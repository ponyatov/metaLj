# \ <section:var>
MODULE       = metaL
OS           = $(shell uname -s)
MACHINE      = $(shell uname -m)
NOW          = $(shell date +%d%m%y)
REL          = $(shell git rev-parse --short=4 HEAD)
# / <section:var>
# \ <section:dir>
CWD          = $(CURDIR)
DOC          = $(CWD)/doc
BIN          = $(CWD)/bin
SRC          = $(CWD)/$(MODULE)
TMP          = $(CWD)/tmp
# / <section:dir>
# \ <section:ver>
GJF_VER      = 1.9
CFR_VER      = 0.150
# / <section:ver>
# \ <section:tool>
WGET         = wget -c
CURL         = curl
JAVAC        = $(JAVA_HOME)/bin/javac -d $(BIN)
JAVA         = $(JAVA_HOME)/bin/java -cp $(TMP) -cp $(BIN)
JSH          = $(JAVA_HOME)/bin/jshell
GJF          = tmp/google-java-format-$(GJF_VER)-all-deps.jar
CFR          = tmp/cfr-$(CFR_VER).jar
JAD          = procyon
# / <section:tool>
# \ <section:obj>
J  = $(shell find metaL -type f )
C  = $(shell echo $(J) | sed 's/metaL\//bin\/metaL\//g' | sed 's/.java/.class/g')
S  = $(J)
# / <section:obj>
# \ <section:all>

.PHONY: all
all: $(C)
	$(JAVA) $(MODULE).$(MODULE)
#	$(J)

bin/%.class: %.java
	$(JAVAC) $< && touch $@

.PHONY: repl
repl:
	$(JSH)

.PHONY: format
format: tmp/format
tmp/format: $(J)
	$(JAVA) -jar $(GJF) --replace $? && touch $@

.PHONY: cfr
cfr: tmp/cfr
tmp/cfr: $(C)
	$(JAVA) -jar $(CFR) --outputdir $@ $? && touch $@
# / <section:all>
# \ <section:doc>
.PHONY: doxy
doxy:
	rm -rf docs ; doxygen doxy.gen 1>/dev/null
# / <section:doc>
# \ <section:gz>
.PHONY: gz
gz: $(GJF) $(CFR)

$(GJF):
	$(WGET) -O $@ https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar

$(CFR):
	$(WGET) -O $@ https://github.com/leibnitz27/cfr/releases/download/$(CFR_VER)/cfr-$(CFR_VER).jar
# / <section:gz>
# \ <section:install>
.PHONY: install
install: $(OS)_install gz
.PHONY: update
update: $(OS)_update gz
.PHONY: Linux_install Linux_update
Linux_install Linux_update:
	sudo apt update
	sudo apt install -u `cat apt.txt`
# / <section:install>
# \ <section:merge>
MERGE  = Makefile README.md apt.txt .gitignore .vscode $(S) doxy.gen
.PHONY: main
main:
	git push -v
	git checkout $@
	git pull -v
	git checkout shadow -- $(MERGE)
	$(MAKE) doxy
.PHONY: shadow
shadow:
	git pull -v
	git checkout $@
	git pull -v
.PHONY: release
release:
	git tag $(NOW)-$(REL)
	git push -v && git push -v --tags
	$(MAKE) shadow
# / <section:merge>
