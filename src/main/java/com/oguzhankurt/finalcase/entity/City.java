package com.oguzhankurt.finalcase.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cities")
@Getter
@Setter
public class City {
    @Id
    private Long id;

    public String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private User user;
}
