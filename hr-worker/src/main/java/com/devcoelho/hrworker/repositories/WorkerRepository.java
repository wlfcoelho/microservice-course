package com.devcoelho.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcoelho.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
