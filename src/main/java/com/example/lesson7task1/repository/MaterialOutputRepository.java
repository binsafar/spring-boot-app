package com.example.lesson7task1.repository;

import com.example.lesson7task1.entity.Comment;
import com.example.lesson7task1.entity.MaterialOutput;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialOutputRepository extends JpaRepository<MaterialOutput, Long> {


    boolean existsById(Long id);
}
