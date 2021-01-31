package metaL;

public class Token extends Syntax {

  long yyline, yycol;

  public Token(java.lang.String V) {
    super("token", V);
    yyline = yycol = 0;
  }
}
