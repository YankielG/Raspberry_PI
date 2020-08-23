package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Jasnosc;

@Repository
public interface JasnoscDao extends CrudRepository<Jasnosc, Long> {

//@Repository
//public interface JasnoscDao extends PagingAndSortingRepository<Jasnosc, Long>, CrudRepository<Jasnosc, Long> {
//    public Page<Jasnosc> findAllById(Long id, Pageable pageable);
//    public Page<Jasnosc> findAll(Pageable pageable);

}
