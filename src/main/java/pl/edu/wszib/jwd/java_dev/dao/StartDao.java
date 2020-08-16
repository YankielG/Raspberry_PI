package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Start;

@Repository
public interface StartDao extends CrudRepository<Start, Long> {

//    @Repository
//public interface StartDao extends PagingAndSortingRepository<Start, Long>, CrudRepository<Start, Long> {
//   public Page<Start> findAllById(Long id, Pageable pageable);
//   public Page<Start> findAll(Pageable pageable);

}
