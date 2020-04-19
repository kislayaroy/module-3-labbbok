package com.capg.dao;

import com.capg.entities.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

    private Map<Integer,Employee>store=new HashMap<>();

    public EmployeeDaoImpl(){
        store.put(1,new Employee(1,"Kislaya"));
        store.put(2,new Employee(2,"Roy"));
    }


    @Override
    public List<Employee> fetchAllEmployees() {
        Collection<Employee>employees=store.values();
        List<Employee>list=new ArrayList<>(employees);
        return list;
    }
}
