package metaL.core;

public interface ISerialize {
  public int xxhash32();

  public long xxhash64();

  public java.lang.String json(int depth);

  public java.lang.String xml(int depth);

  public java.lang.String bert(int depth);

  public java.lang.String sql(int depth);
}
