package com.capg.service;

import java.util.List;

import com.capg.entities.Trainee;
import org.springframework.stereotype.Component;

public interface ITraineeService {

	  void addTrainee(Trainee tr);

	    void deleteTrainee(int id);

	    Trainee modifyTrainee(Trainee tr);

	    Trainee fetchTrainee(int id);

	    boolean credentials(int id, String password);

}
