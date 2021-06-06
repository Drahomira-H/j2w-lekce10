package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Page<Student> seznamStudentu(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public Student student(Integer id) {
        return studentRepository.getOne(id);
    }
}
