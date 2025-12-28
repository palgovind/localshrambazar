package com.cityinfo.shrambazar.service;
import com.cityinfo.shrambazar.model.*;
import com.cityinfo.shrambazar.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkerService{
	private final WorkerRepository workerRepository;
	public Worker postWorker(Worker worker){
		
		return workerRepository.save(worker);
	}
	
	
}