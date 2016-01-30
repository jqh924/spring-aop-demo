package service;

/**
 * Created by jinqinghua on 16/1/23.
 */
public interface Service {
    void adviced(String name);

    void adviced2(String name);

    void aadviced(String name);

    void unadviced(String name);

    void throwException();
}
