package metaL;

public class metaL extends App {

  public metaL() {
    super("metaL");
  }

  public static void main(java.lang.String[] args) {
    System.out.print("args:");
    for (java.lang.String arg : args) {
      System.out.print(java.lang.String.format(" %s", arg));
    }
    System.out.println();
  }
}
