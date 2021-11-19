package com.revature.repositories;

import com.revature.model.Status;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StatusRepoImp implements StatusRepo{
    @Override
    public Status addStatus(Status a) {
        return null;
    }

    @Override
    public List<Status> getAllStatus() {


        Session session = HibernateUtil.getSession();
        List<Status> statusList = null;

        try {
            statusList = session.createQuery("FROM Status").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return statusList;

    }

    @Override
    public Status getStatus(int id) {
        Session session = HibernateUtil.getSession();
        Status s = null;

        try {
            s = session.get(Status.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return s;

    }

    @Override
    public Status updateStatus(Status change) {


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
    public Status deleteStatus(int id) {
        return null;
    }
}
