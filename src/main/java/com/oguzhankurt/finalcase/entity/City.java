package com.oguzhankurt.finalcase.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cities")
@Getter
@Setter
@NoArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "city", sequenceName = "CITY_ID_SEQ")
    private Long id;

    public String name;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public City(Long id, String name, User user) {
        this.id = id;
        this.user = user;
        this.name = name;
    }
}
