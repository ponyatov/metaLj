package metaL.core;

public interface IDump {
  public java.lang.String toString();

  public java.lang.String dump(int depth, java.lang.String prefix);

  public java.lang.String pad(int depth);

  public java.lang.String head(java.lang.String prefix);
}
