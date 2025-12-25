package com.cityinfo.shrambazar.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="servicer")
public class Servicer{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "servicer_name")
    private	String servicer_name;
	@Column(name="mob_num")
	private String mob_num;
	public Servicer(){}
	//Getters and setters
}