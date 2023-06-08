package com.oguzhankurt.finalcase.repository;

import com.oguzhankurt.finalcase.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
