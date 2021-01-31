package metaL.core.primitive;

public class Integer extends Primitive {

  long value;

  public Integer(long V) {
    super("integer");
    value = V;
  }

  public java.lang.String val() {
    return Long.toString(value);
  }
}
