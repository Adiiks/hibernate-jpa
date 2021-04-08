package pl.adiks.hibernatejpa.enitity;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adiks.hibernatejpa.Gender;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "student")
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "STUDENT_NAME", length = 50, nullable = false, unique = false)
    private String name;

    @Transient
    private Integer age;

    @Enumerated(EnumType.STRING) // for saving enum
    private Gender gender;
}
