package pl.edu.wszib.jwd.java_dev.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.java_dev.model.Konto;

@Repository
public interface KontoDao extends CrudRepository<Konto, Long> {

//@Repository
//public interface UzytkownicyDao extends PagingAndSortingRepository<Uzytkownicy, Long>, CrudRepository<Uzytkownicy, Long> {
//    public Page<Uzytkownicy> findAllById(Long id, Pageable pageable);
//    public Page<Uzytkownicy> findAll(Pageable pageable);
    
}
