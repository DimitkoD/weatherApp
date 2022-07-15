package com.example.springbootproject.NEW.Data.DB.Repository;

import com.example.springbootproject.NEW.Data.DB.Entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);

    @Override
    boolean existsById(Long aLong);
}
