package com.revature.service;

import com.revature.model.Application;

import java.util.List;

public interface ApplicationService {


    public Application addApplication(Application a);
    public List<Application> getAllApplications();
    public Application getApplication(int id);
    public Application updateApplication(Application change);
    public Application deleteApplication(int id);

}
