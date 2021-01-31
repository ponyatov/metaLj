package metaL.syntax;

public class Token extends Syntax {

  long yyline = 0, yycol = 0;

  public Token(java.lang.String V) {
    super("token", V);
  }
}
