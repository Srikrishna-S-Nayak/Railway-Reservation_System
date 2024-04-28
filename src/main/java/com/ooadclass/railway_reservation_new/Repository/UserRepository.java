package com.ooadclass.railway_reservation_new.Repository;

import com.ooadclass.railway_reservation_new.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);

    Optional<User> findByUsername(String username);
}