package com.revature.service;

import com.revature.model.Application;
import com.revature.repositories.ApplicationRepo;

import java.util.List;

public class ApplicationServiceImp implements ApplicationService{

    ApplicationRepo ar;

    public ApplicationServiceImp(ApplicationRepo ar) {
        this.ar = ar;
    }

    @Override
    public Application addApplication(Application a) {
        return ar.addApplication(a);
    }

    @Override
    public List<Application> getAllApplications() {
        return ar.getAllApplications();
    }

    @Override
    public Application getApplication(int id) {
        return ar.getApplication(id);
    }

    @Override
    public Application updateApplication(Application change) {
        return ar.updateApplication(change);
    }

    @Override
    public Application deleteApplication(int id) {
        return ar.deleteApplication(id);
    }
}
