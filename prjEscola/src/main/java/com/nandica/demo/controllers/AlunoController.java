package com.nandica.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandica.demo.entities.Aluno;
import com.nandica.demo.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	private final AlunoService alunoService;
	
	@Autowired
	public AlunoController(AlunoService alunoService){
		this.alunoService = alunoService;
	}
	
	@PostMapping("/create")
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoService.saveAluno(aluno);
	}
	
	@GetMapping("/{id}")
	public Aluno getAluo(@PathVariable Long id) {
		return alunoService.findAlunoById(id);
	}
	
	@GetMapping("/all")
	public List<Aluno> getAllAlunos(){
		return alunoService.findAllAlunos();
	}
	
}

