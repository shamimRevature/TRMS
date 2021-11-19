package com.revature.service;

import com.revature.model.Application;
import com.revature.model.BenifitCoordinator;
import com.revature.repositories.ApplicationRepo;
import com.revature.repositories.BenifitCoordinatorRepo;

import java.util.List;

public class BenifitCoordinatorServiceImp implements BenifitCoordinatorService {

    BenifitCoordinatorRepo br;

    public BenifitCoordinatorServiceImp(BenifitCoordinatorRepo br) {
        this.br = br;
    }
    @Override
    public BenifitCoordinator addBenifitCoordinator(BenifitCoordinator b) {

        return br.addBenifitCoordinator(b);
    }

    @Override
    public List<BenifitCoordinator> getAllBenifitCoordinators() {

        return br.getAllBenifitCoordinators();
    }

    @Override
    public BenifitCoordinator getBenifitCoordinator(int id) {

        return br.getBenifitCoordinator(id);
    }

    @Override
    public BenifitCoordinator updateBenifitCoordinator(BenifitCoordinator change) {

        return br.updateBenifitCoordinator(change);
    }

    @Override
    public BenifitCoordinator deleteBenifitCoordinator(int id) {

        return br.deleteBenifitCoordinator(id);
    }
}
