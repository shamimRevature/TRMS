package com.revature.repositories;

import com.revature.model.Employee;
import com.revature.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepoImp implements EmployeeRepo{


    @Override
    public Employee addEmployee(Employee e) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            e.setEmpId((int)session.save(e));
            tx.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return e;

    }

    @Override
    public List<Employee> getAllEmployees() {
        Session session = HibernateUtil.getSession();
        List<Employee> employees = null;

        try {
            employees = session.createQuery("FROM Employee").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employees;

    }

    @Override
    public Employee getEmployee(int id) {
        Session session = HibernateUtil.getSession();
        Employee e = null;

        try {
            e = session.get(Employee.class, id);
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            session.close();
        }

        return e;

    }

    @Override
    public Employee updateEmployee(Employee change) {
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
    public Employee deleteEmployee(int id) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        Employee e = null;

        try {
            tx = session.beginTransaction();
            e = session.get(Employee.class, id);
            session.delete(e);
            tx.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if(tx != null) tx.rollback();
            return null;
        } finally {
            session.close();
        }

        return e;
    }

}
