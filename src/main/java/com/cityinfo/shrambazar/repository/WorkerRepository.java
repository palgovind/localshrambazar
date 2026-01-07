package com.cityinfo.shrambazar.repository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.*;
import com.cityinfo.shrambazar.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long>{

    public  Worker getWorkerById(Integer id);
	
   // public List <Worker> getAllWorker();
   // public void deleteWorker(Long id);

}