package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Status;

//@Repository
//public interface StatusDao extends CrudRepository<Status, Long> {
    
@Repository
public interface StatusDao extends PagingAndSortingRepository<Status, Long>, CrudRepository<Status, Long> {
    public Page<Status> findAllById(Long id, Pageable pageable);
    public Page<Status> findAll(Pageable pageable);

    
}
