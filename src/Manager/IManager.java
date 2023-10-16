package Manager;

import java.util.ArrayList;

public interface IManager<T> {
    boolean add(T e);
    boolean edit(T e);
    boolean delete(int id);
    ArrayList<T> findAll();
}
