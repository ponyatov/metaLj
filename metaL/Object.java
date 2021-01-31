package metaL;

import java.util.Map;

public class Object {
  public java.lang.String type, value;
  public Map<java.lang.String, Object> slot;

  public Object(java.lang.String T) {
    type = T;
  }

  public Object(java.lang.String T, java.lang.String V) {
    this(T);
    value = V;
  }
}

// @Test public void testHello() {
//     assertEquals("<hello:world>",new Object("hello","world"));
