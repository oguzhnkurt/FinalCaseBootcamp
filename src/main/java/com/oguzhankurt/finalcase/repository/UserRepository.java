package com.oguzhankurt.finalcase.repository;

import com.oguzhankurt.finalcase.entity.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Primary
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   void saveUser (User user);

}
