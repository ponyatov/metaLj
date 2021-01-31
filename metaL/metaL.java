package metaL;

import metaL.core.meta.App;
import metaL.core.primitive.Integer;
import metaL.core.primitive.Number;
import metaL.gui.Frame;

public class metaL extends App {

  public metaL() {
    super("metaL");
  }

  public static void main(java.lang.String[] args) {
    //
    System.out.print("args:");
    for (java.lang.String arg : args) {
      System.out.print(java.lang.String.format(" %s", arg));
    }
    System.out.println();
    //
    App app = new App("metaL");
    Frame main = new Frame(app);
    app.push(main);
    app.push(new Integer(1));
    app.push(new Number(2.3));
    System.out.println(app);
  }
}
