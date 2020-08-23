package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Szafy;

@Repository
public interface SzafyDao extends CrudRepository<Szafy, Long> {
    
//@Repository
//public interface SzafyDao extends PagingAndSortingRepository<Szafy, Long>, CrudRepository<Szafy, Long> {
//    public Page<Szafy> findAllById(Long id, Pageable pageable);
//    public Page<Szafy> findAll(Pageable pageable);


}
