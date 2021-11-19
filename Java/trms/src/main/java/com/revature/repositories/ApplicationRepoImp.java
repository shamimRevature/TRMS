package com.revature.repositories;

import com.revature.model.Application;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ApplicationRepoImp implements ApplicationRepo{

    @Override
    public Application addApplication(Application a) {
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            a.setAppId((int)session.save(a));
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            a = null;
        }  finally {
            session.close();
        }
        return a;

    }

    @Override
    public List<Application> getAllApplications() {
        Session session = HibernateUtil.getSession();
        List<Application> applications = null;

        try {
            //SELECT * FROM actors
            //HQL - Hibernate Query Language - Hibernate wants to simplify any SQL you have to write by:
            // 1) Only having to reference you Java Classes
            // 2) Not having to adjust this code per each RDBMS.
            applications = session.createQuery("FROM Application").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return applications;

    }

    @Override
    public Application getApplication(int id) {

        Session session = HibernateUtil.getSession();
        Application a = null;

        try {
            a = session.get(Application.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return a;

    }

    @Override
    public Application updateApplication(Application change) {


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
    public Application deleteApplication(int id) {

        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        Application a = null;

        try {
            tx = session.beginTransaction();
            a = session.get(Application.class, id);
            session.delete(a);
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
}
