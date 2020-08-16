package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Kolory;

@Repository
public interface KoloryDao extends CrudRepository<Kolory, Long> {

//@Repository
//public interface KoloryDao extends PagingAndSortingRepository<Kolory, Long>, CrudRepository<Kolory, Long> {
//    public Page<Kolory> findAllById(Long id, Pageable pageable);
//    public Page<Kolory> findAll(Pageable pageable);

}
