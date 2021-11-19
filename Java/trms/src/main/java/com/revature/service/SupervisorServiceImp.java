package com.revature.service;

import com.revature.model.Supervisor;
import com.revature.repositories.StatusRepo;
import com.revature.repositories.SupervisorRepo;

import java.util.List;

public class SupervisorServiceImp implements SupervisorService{
    SupervisorRepo sup;

    public SupervisorServiceImp(SupervisorRepo sup) {

        this.sup = sup;
    }

    @Override
    public Supervisor addSupervisor(Supervisor a) {

        return sup.addSupervisor(a);
    }

    @Override
    public List<Supervisor> getAllSupervisors() {
        return sup.getAllSupervisors();
    }

    @Override
    public Supervisor getSupervisor(int id) {

        return sup.getSupervisor(id);
    }


    @Override
    public Supervisor updateSupervisor(Supervisor change) {

        return sup.updateSupervisor(change);
    }

    @Override
    public Supervisor deleteSupervisor(int id) {

        return sup.deleteSupervisor(id);
    }
}
