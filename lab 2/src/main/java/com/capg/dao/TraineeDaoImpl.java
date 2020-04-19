package com.capg.dao;

import com.capg.entities.Trainee;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class TraineeDaoImpl implements ITraineeDao{
    private Map<Integer,Trainee>store=new HashMap<>();
    private Map<Integer,Trainee>admin = new HashMap<>();
    
    public TraineeDaoImpl() {
    Trainee trainee = new Trainee();
    trainee.setId(1);
    trainee.setName("Kislaya");
    trainee.setPassword("Roy");
    trainee.setLocation("bhopal");
    admin.put(1,trainee);
    }
    
	@Override
	public void addTrainee(Trainee tr) {
		store.put(tr.getId(),tr);
		
	}

	@Override
	public void deleteTrainee(int id) {
		 Trainee tr = store.get(id);
    	 	 store.remove(tr.getId());
    	}

	@Override
	public Trainee modifyTrainee(Trainee tr) {
    	if(store.containsKey(tr.getId())) {
    		store.put(tr.getId(),tr);
    	}
    	return tr;
	}

	@Override
	public Trainee fetchTrainee(int id) {
		Trainee t = store.get(id);
		return t;
	}


    @Override
    public boolean credentials(int id, String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        Trainee trainee = admin.get(id);
        if (trainee == null) {
            return false;
        }
        return trainee.getPassword().equals(password);
    }

  
}
