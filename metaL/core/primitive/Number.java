package metaL.core.primitive;

public class Number extends Primitive {

  double value;

  public Number(double V) {
    super("number");
    value = V;
  }

  public java.lang.String val() {
    return Double.toString(value);
  }
}
