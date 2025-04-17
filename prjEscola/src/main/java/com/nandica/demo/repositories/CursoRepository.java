package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
