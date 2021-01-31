package metaL.core;

public interface ISerialize {
  public long xxhash();

  public java.lang.String json(int depth);

  public java.lang.String xml(int depth);

  public java.lang.String bert(int depth);
}
