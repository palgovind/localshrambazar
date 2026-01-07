package com.cityinfo.shrambazar.model;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.http.ResponseEntity;

@Entity
@Data
public class Worker{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private	String name;
	private	String email;
	private String phone;
	private String department;
	public Worker(){}
	public Worker(String name,String email,String phone,String department){
		this.name=name;this.email=email;this.phone=phone;this.department=department;
		}
	
	//Getters and setters
	/*public Long getId(){return id;}
	public void setId(Long id){this.id=id;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}
	public String getEmail(){return email;}
	public void setEmail(){String email){this.email=email;}*/
		
	
}