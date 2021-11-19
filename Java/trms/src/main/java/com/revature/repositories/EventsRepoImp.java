package com.revature.repositories;

import com.revature.model.Events;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EventsRepoImp implements EventsRepo{

    @Override
    public Events addEvents(Events a) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            a.setEventId((int)session.save(a));
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return a;

    }

    @Override
    public List<Events> getAllEvents() {
        Session session = HibernateUtil.getSession();
        List<Events> events = null;

        try {
            events = session.createQuery("FROM Events").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return events;

    }

    @Override
    public Events getEvents(int id) {
        Session session = HibernateUtil.getSession();
        Events m = null;

        try {
            m = session.get(Events.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return m;

    }

    @Override
    public Events updateEvents(Events change) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(change);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return change;

    }

    @Override
    public Events deleteEvents(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        Events m = null;

        try {
            tx = session.beginTransaction();
            m = session.get(Events.class, id);
            session.delete(m);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return m;

    }
}
