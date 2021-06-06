package cz.czechitas.java2webapps.lekce10.repository;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for class {@code trida}.
 */
@Repository
public interface TridaRepository  extends JpaRepository<Trida, Short> {

    /**
     * Finds class by name
     */
//    Page<Trida> findByName(String nazev, Pageable pageable);

    Trida findByNazev(String nazev);
}
