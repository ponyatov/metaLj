package metaL.core;

import java.util.Map;

public class Object implements IDump {
  public java.lang.String type, value;
  public Map<java.lang.String, Object> slot;

  public Object(java.lang.String T) {
    type = T;
  }

  public Object(java.lang.String T, java.lang.String V) {
    this("object");
    value = V;
  }

  public Object(Object that) {
    this("object");
    value = that.value;
  }

  public java.lang.String toString() {
    return dump(0, "");
  }

  public java.lang.String dump(int depth, java.lang.String prefix) {
    java.lang.String ret = pad(depth) + head(prefix);
    return ret;
  }

  public java.lang.String pad(int depth) {
    return "\n" + "\t".repeat(depth);
  }

  public java.lang.String head(java.lang.String prefix) {
    return prefix + "<" + type + ":" + value + ">";
  }
}

// @Test public void testHello() {
//     assertEquals("<hello:world>",new Object("hello","world"));
