package pl.adiks.hibernatejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.adiks.hibernatejpa.enitity.Student;

@SpringBootApplication
public class HibernateJpaApplication {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateJpaApplication.class, args);
    }

    @Bean
    void test() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Adrian");
        student.setGender(Gender.MALE);

        studentRepository.save(student);
    }

}
