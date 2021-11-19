package com.revature.service;

import com.revature.model.DepartmentHead;

import java.util.List;

public interface DepartmentHeadService {

    public DepartmentHead addDepartmentHead(DepartmentHead a);
    public List<DepartmentHead> getAllDepartmentHeads();
    public DepartmentHead getDepartmentHead(int id);
    public DepartmentHead updateDepartmentHead(DepartmentHead change);
    public DepartmentHead deleteDepartmentHead(int id);


}
