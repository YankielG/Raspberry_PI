package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Index;

@Repository
public interface IndexDao extends CrudRepository<Index, Long> {

//@Repository
//public interface IndexDao extends PagingAndSortingRepository<Index, Long>, CrudRepository<Index, Long> {
//      public Page<Index> findAllById(Long id, Pageable pageable);
//      public Page<Incex> findAll(Pageable pageable);
}
