package com.revature.repositories;

import com.revature.model.Application;

import java.util.List;

public interface ApplicationRepo {


    public Application addApplication(Application a);
    public List<Application> getAllApplications();
    public Application getApplication(int id);
    public Application updateApplication(Application change);
    public Application deleteApplication(int id);

}
