package com.cityinfo.shrambazar.controller;
import com.cityinfo.shrambazar.repository.*;
import com.cityinfo.shrambazar.model.*;
import com.cityinfo.shrambazar.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;   

@RestController
@CrossOrigin(origins = "http://localhost:5173")
//@RequiredArgsConstructor
   public class WorkerController {
	private  final WorkerRepository workerRepository;
	private final WorkerService workerService;

	@Autowired
	public WorkerController(WorkerRepository workerRepository, WorkerService workerService) {
		this.workerRepository=workerRepository;
		this.workerService = workerService;
	}

/*	@PostMapping("/index")
	public String showAllWorkers(Model model) {
		model.addAttribute("workers", workerService.getAllWorkers());
		return "index";
	}*/
	
	
    @PostMapping("/worker")
	public Worker saveWorker(@RequestBody Worker worker){
	return workerRepository.save(worker);
	}
/*	 @GetMapping("/worker")
	public Worker getWorkerById(@RequestBody Long id){
		return repository.
				
	}*/
	
	@GetMapping("/workers")
    public List<Worker>getAllWorkers() {
        return workerService.getAllWorkers();
    }
}
 
