package com.revature.service;

import com.revature.model.Status;
import com.revature.repositories.LoginRepo;
import com.revature.repositories.StatusRepo;

import java.util.List;

public class StatusServiceImp implements StatusService{

    StatusRepo sr;

    public StatusServiceImp(StatusRepo sr) {
        this.sr = sr;
    }

    @Override
    public Status addStatus(Status a) {

        return sr.addStatus(a);
    }

    @Override
    public List<Status> getAllStatus() {

        return sr.getAllStatus();
    }

    @Override
    public Status getStatus(int id) {

        return sr.getStatus(id);
    }

    @Override
    public Status updateStatus(Status change) {

        return sr.updateStatus(change);
    }

    @Override
    public Status deleteStatus(int id) {

        return sr.deleteStatus(id);
    }
}
