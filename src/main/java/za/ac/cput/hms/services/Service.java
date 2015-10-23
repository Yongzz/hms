package za.ac.cput.hms.services;

import java.util.List;

/**
 * Created by Andies on 2015-10-22.
 */
public interface Service<E, ID> {
    public E find(ID id);

    public E save(E entity);

    public E merge(E entity);

    public void remove(E entity);

    public List<E> findAll();
}
