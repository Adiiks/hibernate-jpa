package pl.adiks.hibernatejpa.jpa_entity_lifecycle_events;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@EntityListeners(AuditTrailListener.class)
@Entity
@Slf4j
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String firstName;
    private String lastName;

    @Transient
    private String fullName;
}
