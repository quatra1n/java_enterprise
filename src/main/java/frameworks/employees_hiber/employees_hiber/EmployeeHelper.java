package frameworks.employees_hiber.employees_hiber;

import frameworks.employees_hiber.employees_hiber.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeHelper {
    private SessionFactory sessionFactory;

    public EmployeeHelper() { sessionFactory = HibernateUtil.getSessionFactory();}

    public List<Employee> getEmployee() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            cq.select(root);
            return session.createQuery(cq).getResultList();
        }
    }

    public Employee getEmployeeById(long id) {
        try (Session session = sessionFactory.openSession()){
            return session.find(Employee.class, id);
        }
    }
    

}
