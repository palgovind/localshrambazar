package com.cityinfo.shrambazar.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="worker")
public class Worker{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "worker_name")
    private	String worker_name;
	@Column(name="mob_num")
	private String mob_num;
	public Worker(){}
	//Getters and setters
}