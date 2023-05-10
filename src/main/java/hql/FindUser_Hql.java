package hql;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class FindUser_Hql {
    public void findUser() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM User"; // Example of HQL to get all records of user class
        TypedQuery query = session.createQuery(hql);
        List<User> results = query.getResultList();
        for (User u : results) {
            System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullName()
                    +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
        }
    }
    public void getRecordbyId() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM User E WHERE E.id > 2 ORDER BY E.salary DESC";
        TypedQuery query = session.createQuery(hql);
        List<User> results = query.getResultList();
        for (User u : results) {
            System.out.println("User Id: " +u.getId() + "|" + " Full name:" +
                    u.getFullName() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
        }
    }
}
