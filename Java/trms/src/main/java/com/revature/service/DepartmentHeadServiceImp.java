package com.revature.service;

import com.revature.model.DepartmentHead;
import com.revature.repositories.BenifitCoordinatorRepo;
import com.revature.repositories.DepartmentHeadRepo;

import java.util.List;

public class DepartmentHeadServiceImp implements DepartmentHeadService{

    DepartmentHeadRepo dr;

    public DepartmentHeadServiceImp(DepartmentHeadRepo dr) {
        this.dr = dr;
    }

    @Override
    public DepartmentHead addDepartmentHead(DepartmentHead a) {

        return dr.addDepartmentHead(a);
    }

    @Override
    public List<DepartmentHead> getAllDepartmentHeads() {

        return dr.getAllDepartmentHeads();
    }

    @Override
    public DepartmentHead getDepartmentHead(int id) {

        return dr.getDepartmentHead(id);
    }

    @Override
    public DepartmentHead updateDepartmentHead(DepartmentHead change) {

        return dr.updateDepartmentHead(change);
    }

    @Override
    public DepartmentHead deleteDepartmentHead(int id) {

        return dr.deleteDepartmentHead(id);
    }
}
