package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Worker;

//metodos para acessar dados
public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
