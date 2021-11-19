package com.revature.repositories;

import com.revature.model.Events;

import java.util.List;

public interface EventsRepo {

    public Events addEvents(Events a);
    public List<Events> getAllEvents();
    public Events getEvents(int id);
    public Events updateEvents(Events change);
    public Events deleteEvents(int id);


}
