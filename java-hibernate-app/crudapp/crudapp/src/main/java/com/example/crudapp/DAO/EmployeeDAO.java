package com.example.crudapp.DAO;

import com.example.crudapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface {

    private EntityManager entityManager;

    public EmployeeDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee order by lastName asc", Employee.class);
        return query.getResultList();
    }

    @Override
    public List<Employee> findBylastName(String lastName) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where lastName=:data", Employee.class);
        query.setParameter("data", lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int rowsDeleted = entityManager.createQuery("delete from Employee").executeUpdate();
        return rowsDeleted;
    }
}
