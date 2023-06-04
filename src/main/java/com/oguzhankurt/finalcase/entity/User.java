package com.oguzhankurt.finalcase.entity;

import com.oguzhankurt.finalcase.general.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    private Long id;

    public String userName;
    public String password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @OneToMany(mappedBy="user")
    private Set<City> city;
}
