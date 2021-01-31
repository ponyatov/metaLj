package metaL;

public class metaL extends App {
  public static void main(String[] args) {
    System.out.print("args:");
    for (String arg : args) {
      System.out.print(String.format(" %s", arg));
    }
    System.out.println();
  }
}
