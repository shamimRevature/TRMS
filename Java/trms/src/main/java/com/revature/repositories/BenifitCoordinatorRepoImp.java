package com.revature.repositories;

import com.revature.model.Application;
import com.revature.model.BenifitCoordinator;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BenifitCoordinatorRepoImp implements  BenifitCoordinatorRepo{


    @Override
    public BenifitCoordinator addBenifitCoordinator(BenifitCoordinator b) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            b.setBenId((int)session.save(b));
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }
        return b;

    }

    @Override
    public List<BenifitCoordinator> getAllBenifitCoordinators() {
        Session session = HibernateUtil.getSession();
        List<BenifitCoordinator> ben = null;
        try {
            ben = session.createQuery("FROM BenifitCoordinator").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return ben;

    }

    @Override
    public BenifitCoordinator getBenifitCoordinator(int id) {
        Session session = HibernateUtil.getSession();
        BenifitCoordinator b = null;
        try {
            b = session.get(BenifitCoordinator.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return b;

    }

    @Override
    public BenifitCoordinator updateBenifitCoordinator(BenifitCoordinator change) {
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
    public BenifitCoordinator deleteBenifitCoordinator(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        BenifitCoordinator b = null;

        try {
            tx = session.beginTransaction();
            b = session.get(BenifitCoordinator.class, id);
            session.delete(b);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }
        return b;

    }
}
