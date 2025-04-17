package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
