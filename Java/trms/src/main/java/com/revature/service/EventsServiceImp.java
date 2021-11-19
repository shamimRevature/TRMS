package com.revature.service;

import com.revature.model.Events;
import com.revature.repositories.EmployeeRepo;
import com.revature.repositories.EventsRepo;

import java.util.List;

public class EventsServiceImp implements EventsService{

    EventsRepo evr;

    public EventsServiceImp(EventsRepo evr) {
        this.evr = evr;
    }

    @Override
    public Events addEvents(Events a) {

        return evr.addEvents(a);
    }

    @Override
    public List<Events> getAllEvents() {

        return evr.getAllEvents();
    }

    @Override
    public Events getEvents(int id) {

        return evr.getEvents(id);
    }

    @Override
    public Events updateEvents(Events change) {

        return evr.updateEvents(change);
    }

    @Override
    public Events deleteEvents(int id) {

        return evr.deleteEvents(id);
    }
}
