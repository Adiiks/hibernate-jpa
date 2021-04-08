package pl.adiks.hibernatejpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.hibernatejpa.enitity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
