package com.revature.repositories;

import com.revature.model.Application;
import com.revature.model.BenifitCoordinator;

import java.util.List;

public interface BenifitCoordinatorRepo{

    public BenifitCoordinator addBenifitCoordinator(BenifitCoordinator a);
    public List<BenifitCoordinator> getAllBenifitCoordinators();
    public BenifitCoordinator getBenifitCoordinator(int id);
    public BenifitCoordinator updateBenifitCoordinator(BenifitCoordinator change);
    public BenifitCoordinator deleteBenifitCoordinator(int id);

}
