package com.cityinfo.shrambazar.service;
import  com.cityinfo.shrambazar.model.*;
import  com.cityinfo.shrambazar.repository.*;
import  lombok.RequiredArgsConstructor;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService{
	@Autowired
	private  WorkerRepository workerRepository;
	
	public Worker saveWorker(Worker worker){
		
		return workerRepository.save(worker);
	}
	/*public Worker getWorkerById(Long id){
		return workerRepository.findById(id).get();
	}*/
    public List<Worker> getAllWorkers(){
		return workerRepository.findAll();
	}
	public void deleteWorker(Long id){
		workerRepository.deleteById(id);
		}
	public Worker getWorkerById(Long id){
		
		return workerRepository.findById(id).orElse(null);
		
	}
	
	
	
}