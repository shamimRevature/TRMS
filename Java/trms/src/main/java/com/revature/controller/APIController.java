package com.revature.controller;

import com.google.gson.Gson;
import com.revature.model.*;
import com.revature.service.*;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.util.List;

public class APIController {

    ApplicationService as;
    BenifitCoordinatorService bs;
    DepartmentHeadService ds;
    EmployeeService emS;
    EventsService evS;
    LoginService ls;
    StatusService stS;
    SupervisorService suS;
    Gson gson;

    public APIController(ApplicationService as, BenifitCoordinatorService bs, DepartmentHeadService ds, EmployeeService emS, EventsService evS,LoginService ls, StatusService stS, SupervisorService suS) {
        this.as = as;
        this.bs = bs;
        this.ds = ds;
        this.emS = emS;
        this.evS = evS;
        this.ls = ls;
        this.stS = stS;
        this.suS = suS;
        this.gson = new Gson();
    }
/////////////////////////////////       Application         /////////////

    public Handler getApplicationById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Application a = as.getApplication(id);
        populateResultForApplication(context, a);
    };

    public Handler addApplication = (context) -> {

        Application a = gson.fromJson(context.body(), Application.class);
        a = as.addApplication(a);
        populateResultForApplication(context, a);
    };

    public Handler getAllApplication = (context) -> {

        List<Application> applicationList = as.getAllApplications();
        if(applicationList != null) {
            context.result(gson.toJson(applicationList));
        } else {
            context.result("[]");
        }
    };

    public Handler updateApplication = (context) -> {
        int id = Integer.parseInt(context.pathParam("id"));
        Application m = gson.fromJson(context.body(), Application.class);

        //Should probably validate
        m.setAppId(id);

        m = as.updateApplication(m);
        context.result((m != null) ? gson.toJson(m) : "{}");
    };

///////////////////////////////////////////////////////////////////////////////

    public Handler getEmployeeById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Employee e = emS.getEmployee(id);
        populateResultForEmployee(context, e);

    };

    public Handler addEmployee = (context) -> {

        Employee e = gson.fromJson(context.body(), Employee.class);
        e = emS.addEmployee(e);
        populateResultForEmployee(context, e);
    };

    public Handler getAllEmployee = (context) -> {

        List<Employee> employeeList = emS.getAllEmployees();
        if(employeeList != null) {
            context.result(gson.toJson(employeeList));
        } else {
            context.result("[]");
        }
    };
//////////////////////////////////////////////////////////////////////////

    public Handler getBenCoById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        BenifitCoordinator a = bs.getBenifitCoordinator(id);

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    };


    public Handler getAllBanCo = (context) -> {

        List<BenifitCoordinator> bencoList = bs.getAllBenifitCoordinators();
        if(bencoList != null) {
            context.result(gson.toJson(bencoList));
        } else {
            context.result("[]");
        }
    };

///////////////////////////////////////////////////////////////////////////////////

    public Handler getDepHeadById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        DepartmentHead a = ds.getDepartmentHead(id);

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    };


    public Handler getAllDepHead = (context) -> {

        List<DepartmentHead> depHeadList = ds.getAllDepartmentHeads();
        if(depHeadList != null) {
            context.result(gson.toJson(depHeadList));
        } else {
            context.result("[]");
        }
    };

    ///////////////////////////////////////////////////////////////////////////////////

    public Handler getEventById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Events a = evS.getEvents(id);

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    };


    public Handler getAllEvents = (context) -> {

        List<Events> eventList = evS.getAllEvents();
        if(eventList != null) {
            context.result(gson.toJson(eventList));
        } else {
            context.result("[]");
        }
    };

    ///////////////////////////////////////////////////////////////////////////////////

    public Handler getStatusById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Status a = stS.getStatus(id);

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    };


    public Handler getAllStatus = (context) -> {

        List<Status> statusList = stS.getAllStatus();
        if(statusList != null) {
            context.result(gson.toJson(statusList));
        } else {
            context.result("[]");
        }
    };


    public Handler updateStatus = (context) -> {
        int id = Integer.parseInt(context.pathParam("id"));
        Status s = gson.fromJson(context.body(), Status.class);

        //Should probably validate
        s.setStatusId(id);

        s = stS.updateStatus(s);

        context.result((s != null) ? gson.toJson(s) : "{}");

    };
        ///////////////////////////////////////////////////////////////////////////////////

    public Handler getSupervisorById = (context) -> {

        int id = Integer.parseInt(context.pathParam("id"));
        Supervisor a = suS.getSupervisor(id);

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    };


    public Handler getAllSupervisors = (context) -> {

        List<Supervisor> supList = suS.getAllSupervisors();
        if(supList != null) {
            context.result(gson.toJson(supList));
        } else {
            context.result("[]");
        }
    };

    //Helper Method
    private void populateResultForApplication(Context context, Application a) {

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }
    }

    //Helper Method
    private void populateResultForEmployee(Context context, Employee e) {

        if(e != null) {
            context.result(gson.toJson(e));
        } else {
            context.result("{}");
        }
    }

}//end
