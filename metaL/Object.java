package metaL;

import java.util.Map;

public class Object {
  public String type, value;
  public Map<String, Object> slot;

  public Object(String T) {
    type = T;
  }

  public Object(String T, String V) {
    this(T);
    value = V;
  }
}

// @Test public void testHello() {
//     assertEquals("<hello:world>",new Object("hello","world"));
