package Map.Interface;

public interface DataInterface<T> {
    void add(T data);
    T get(Integer key); //T sebagai type generic: bisa string, integer
    void update(Integer key, T data);
    void delete(Integer key);
}
