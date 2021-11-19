package com.revature.repositories;

import com.revature.model.Events;
import com.revature.model.Status;

import java.util.List;

public interface StatusRepo {


    public Status addStatus(Status a);
    public List<Status> getAllStatus();
    public Status getStatus(int id);
    public Status updateStatus(Status change);
    public Status deleteStatus(int id);



}
