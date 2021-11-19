package com.revature.modelTest.application;

import com.revature.model.Application;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testingSetAppId(){

        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setAppId(2);
        assertEquals(app.getAppId(),2);

    }
    @Test
    public void testingGetAppId(){

        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setAppId(2);
        assertEquals(app.getAppId(),2);

    }

    @Test
    public void testingSetEventId(){

        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setEnventId(4);
        assertEquals(app.getEnventId(),4);


    }
    @Test
    public void testingGetEventId(){

        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setEnventId(4);
        assertEquals(app.getEnventId(),4);

    }

    @Test
    public void testingSetEmpId(){
        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setEmpId(10);
        assertEquals(app.getEmpId(),10);

    }
    @Test
    public void testingGetEmpId(){
        Application app = new Application(1,22,"Shamim", 33, 121230,232344, 1234, "GPA",true, true, 4);
        app.setEmpId(10);
        assertEquals(app.getEmpId(),10);

    }


    @Test
    public void testingGetAppName(){


    }

    @Test
    public void testingSetAppEventStartDate(){


    }
    @Test
    public void testingGetEventEndDate(){


    }
    @Test
    public void testingSetCost(){


    }
    @Test
    public void testingGetCost(){


    }
    @Test
    public void testingSetUrgent(){


    }
    @Test
    public void testingGetUrgent(){


    }
    @Test
    public void testingSetWorkRelated(){


    }
    @Test
    public void testingGetWorkRelated(){


    }
    @Test
    public void testingSetStatusId(){


    }
    @Test
    public void testingGetStatusId(){


    }
}
