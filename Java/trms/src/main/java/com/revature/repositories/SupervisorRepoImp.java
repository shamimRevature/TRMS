package com.revature.repositories;

import com.revature.model.Supervisor;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SupervisorRepoImp implements SupervisorRepo{

    @Override
    public Supervisor addSupervisor(Supervisor a) {

        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            a.setSuperId((int)session.save(a));
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
    public List<Supervisor> getAllSupervisors() {

        Session session = HibernateUtil.getSession();
        List<Supervisor> supervisors = null;
        try {
            supervisors = session.createQuery("FROM Supervisor").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return supervisors;
    }

    @Override
    public Supervisor getSupervisor(int id) {
        Session session = HibernateUtil.getSession();
        Supervisor s = null;

        try {
            s = session.get(Supervisor.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return s;
    }


    @Override
    public Supervisor updateSupervisor(Supervisor change) {
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
    public Supervisor deleteSupervisor(int id) {

        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        Supervisor s = null;
        try {
            tx = session.beginTransaction();
            s = session.get(Supervisor.class, id);
            session.delete(s);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }
        return s;
    }
}
