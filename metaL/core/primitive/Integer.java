package metaL.core.primitive;

public class Integer extends Primitive {

  long value;

  public Integer(long V) {
    super("int");
    value = V;
  }
}
