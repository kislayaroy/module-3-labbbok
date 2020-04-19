package com.capg.service;
import com.capg.dao.ITraineeDao;
import com.capg.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService{
    private ITraineeDao traineeDao;

    public ITraineeDao getEmployeeDao(){
        return traineeDao;
    }

    @Autowired
    public void setTraineeDao(ITraineeDao dao){
        this.traineeDao=dao;
    }

	@Override
	public void addTrainee(Trainee tr) {
		traineeDao.addTrainee(tr);
		
	}

	@Override
	public void deleteTrainee(int id) {
		traineeDao.deleteTrainee(id);
		
	}

	@Override
	public Trainee modifyTrainee(Trainee tr) {
		Trainee trainee = traineeDao.modifyTrainee(tr);
		return trainee;
	}

	@Override
	public Trainee fetchTrainee(int id) {
		Trainee t = traineeDao.fetchTrainee(id);
		return t;
	}

	@Override
	public boolean credentials(int id, String password) {
		boolean credential = traineeDao.credentials(id, password);
		return credential;
	}

    
}
