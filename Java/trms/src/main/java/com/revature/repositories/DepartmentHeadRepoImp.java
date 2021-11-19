package com.revature.repositories;

import com.revature.model.DepartmentHead;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DepartmentHeadRepoImp implements DepartmentHeadRepo{

    @Override
    public DepartmentHead addDepartmentHead(DepartmentHead d) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            d.setDepHeadId((int)session.save(d));
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }
        return d;

    }

    @Override
    public List<DepartmentHead> getAllDepartmentHeads() {
        Session session = HibernateUtil.getSession();
        List<DepartmentHead> department = null;

        try {
            department = session.createQuery("FROM DepartmentHead").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return department;

    }

    @Override
    public DepartmentHead getDepartmentHead(int id) {
        Session session = HibernateUtil.getSession();
        DepartmentHead d = null;

        try {
            d = session.get(DepartmentHead.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return d;

    }


    @Override
    public DepartmentHead updateDepartmentHead(DepartmentHead change) {
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
    public DepartmentHead deleteDepartmentHead(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        DepartmentHead d = null;

        try {
            tx = session.beginTransaction();
            d = session.get(DepartmentHead.class, id);
            session.delete(d);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return d;

    }
}
