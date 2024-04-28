package com.ooadclass.railway_reservation_new.Model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role() {
        this.name = ERole.ROLE_USER;
    }

    public Role(ERole name) {
        this.name = name;
    }
}

