package com.cityinfo.shrambazar.controller;
import com.cityinfo.shrambazar.repository.*;
import com.cityinfo.shrambazar.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ServicerController{
@Autowired
private ServicerRepository repository;
  // Find
    @GetMapping("/servicers")
    List<Servicer> findAll() {
        return repository.findAll();
    }
	@CrossOrigin(origins = "http://localhost:5173")
	@GetMapping("/serhome")
	public String home(){return "spring_boot comes with service home";}
}