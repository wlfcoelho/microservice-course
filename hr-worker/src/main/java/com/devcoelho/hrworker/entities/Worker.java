package com.devcoelho.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_worker")
public class Worker  implements Serializable{
	
	//serializable serve para que a classe (worker) seja transformada em bites
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	//gerar ID automaticamente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Double dailyIncome;
	
	
}
