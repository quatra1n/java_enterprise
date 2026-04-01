package frameworks.employees_hiber.employees_hiber;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {factory = new Configuration().
                configure("employees.hibernate.cfg.xml")
                .buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println(e);
        }
    }

    public static SessionFactory getSessionFactory() {return factory; }
}
