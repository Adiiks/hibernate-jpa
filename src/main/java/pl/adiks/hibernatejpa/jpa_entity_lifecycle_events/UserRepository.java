package pl.adiks.hibernatejpa.jpa_entity_lifecycle_events;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
