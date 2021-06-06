package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Service for working with classes (trida)
 */
@Service
public class TridaService {
    private final TridaRepository tridaRepository;

    @Autowired
    public TridaService(TridaRepository tridaRepository) {
        this.tridaRepository = tridaRepository;
    }

    /**
     * Returns sorted pageable list of all classes in the database.
     */
    public Page<Trida> seznamTrid(Pageable pageable) {
        return tridaRepository.findAll(pageable);
    }

    /**
     * Returns a class found by name
     */
    public Trida singleClass(String nazev) {
        return tridaRepository.findByNazev(nazev);
    }

}
