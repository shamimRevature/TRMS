package com.revature.repositories;

import com.revature.model.Supervisor;

import java.util.List;

public interface SupervisorRepo {

    public Supervisor addSupervisor(Supervisor a);
    public List<Supervisor> getAllSupervisors();
    public Supervisor getSupervisor(int id);
    public Supervisor updateSupervisor(Supervisor change);
    public Supervisor deleteSupervisor(int id);




}
