package metaL;

public class metaL {
  public static void main(String[] args) {
    System.out.print("args:");
    for (String arg : args) {
      System.out.print(String.format(" %s", arg));
    }
    System.out.println();
  }
}
