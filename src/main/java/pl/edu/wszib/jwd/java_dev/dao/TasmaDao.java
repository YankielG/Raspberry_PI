package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Tasma;

@Repository
public interface TasmaDao extends CrudRepository<Tasma, Long> {

//@Repository
//public interface TasmaDao extends PagingAndSortingRepository<Tasma, Long>, CrudRepository<Tasma, Long> {
//    public Page<Tasma> findAllById(Long id, Pageable pageable);
//    public Page<Tasma> findAll(Pageable pageable);

}
