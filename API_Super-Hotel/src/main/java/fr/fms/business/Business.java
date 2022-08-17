package fr.fms.business;

import java.util.List;
import java.util.Optional;

/**
 * @author Sarah Lefort
 */
public interface Business<T> {
    public List<T> findAll();
    public T saveOrUpdateOne(T t);
    public void deleteOne(Long id);
    public Optional<T> readOneById(Long id);
}
