package cz.czechitas.java2webapps.lekce10.repository;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Trida, Short> {
}
