package com.revature.app;
import com.revature.controller.APIController;
import com.revature.logging.MyLogger;
import com.revature.repositories.*;
import com.revature.service.*;
import com.revature.util.JDBCConnection;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class App {

    public static void main(String[] args) {

        //Establish our Javalin Object
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);
        //Establish the Route/Endpoints that Javalin will manage.
        establishRoutes(app);
        //Run Javalin
        app.start(7000);
        // To display the messsage about successfully load the javaline
        MyLogger.logger.info("\nJavalin running now .............");
        // To test the database connection
        System.out.println("Connection working ........ \n" + JDBCConnection.getConnection());


    }

    private static void establishRoutes(Javalin app) {
        //Tell Javalin which routes/endpoints Javalin will manage
        app.get("/hello", (ctx) -> ctx.result("Hello"));
        //Establish a route to the 'landing' page.
        app.get("/", (ctx) -> ctx.result("Welcome to my TRMS"));

        ApplicationRepo ar = new ApplicationRepoImp();
        ApplicationService as = new ApplicationServiceImp(ar);

        BenifitCoordinatorRepo b = new BenifitCoordinatorRepoImp();
        BenifitCoordinatorService bs = new BenifitCoordinatorServiceImp(b);

        DepartmentHeadRepo d = new DepartmentHeadRepoImp();
        DepartmentHeadService ds = new DepartmentHeadServiceImp(d);

        EmployeeRepo er = new EmployeeRepoImp();
        EmployeeService emS = new EmployeeServiceImp(er);

        EventsRepo e = new EventsRepoImp();
        EventsService evS = new EventsServiceImp(e);

        LoginRepo l = new LoginRepoImp();
        LoginService ls = new LoginServiceImp(l);

        StatusRepo s = new StatusRepoImp();
        StatusService stS = new StatusServiceImp(s);

        SupervisorRepo su = new SupervisorRepoImp();
        SupervisorService suS = new SupervisorServiceImp(su);

        APIController api = new APIController(as, bs, ds, emS, evS, ls, stS, suS);



        // API for Application
        app.get("/applications", api.getAllApplication);
        app.get("/application/:id", api.getApplicationById);
        app.post("/newapplication", api.addApplication);
        app.put("/application/:id", api.updateApplication);


        // API for BenifitCoordinator
        app.get("/bencos", api.getAllBanCo);
        app.get("/benco/:id", api.getBenCoById);

        // API for DepartmentHead
        app.get("/depheads", api.getAllDepHead);
        app.get("/dephead/:id", api.getDepHeadById);

        // API for Employee
        app.get("/employees", api.getAllEmployee);
        app.get("/employee/:id", api.getEmployeeById);

        //API for Events
        app.get("/events", api.getAllEvents);
        app.get("/event/:id", api.getEventById);

        // API for Status
        app.get("/allstatus", api.getAllStatus);
        app.get("/status/:id", api.getStatusById);
        app.post("/status/:id", api.updateStatus);


        // API for Supervisor
        app.get("/supervisors", api.getAllSupervisors);
        app.get("/supervisor/:id", api.getSupervisorById);



    }
}