package com.revature.repositories;

import com.revature.model.Login;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class LoginRepoImp implements LoginRepo{
    @Override
    public Login addLogin(Login a) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            a.setUserId((int) session.save(a));
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return a;
    }

    @Override
    public Login getLogin(int id) {
            Session session = HibernateUtil.getSession();
            Login m = null;

            try {
                m = session.get(Login.class, id);
            } catch (HibernateException e) {
                e.printStackTrace();
            } finally {
                session.close();
            }

            return m;

        }

    @Override
    public Login updateLogin(Login change) {
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
    public Login deleteLogin(int id) {
            Session session = HibernateUtil.getSession();
            Transaction tx = null;
            Login m = null;

            try {
                tx = session.beginTransaction();
                m = session.get(Login.class, id);
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
