package com.example.demo.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal,Long> {
    List<Animal> findByName(String name);
}
