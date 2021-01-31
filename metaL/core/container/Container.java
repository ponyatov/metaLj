package metaL.core.container;

public class Container extends metaL.core.Object {

  public Container(java.lang.String V) {
    super("container", V == null ? "" : V);
  }

  public Container(java.lang.String T, java.lang.String V) {
    super(T, V == null ? "" : V);
  }
}
