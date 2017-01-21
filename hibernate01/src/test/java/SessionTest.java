import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * Created by Administrator on 2017/1/8.
 */
public class SessionTest {
    @Test
    public void testOpenSession() {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        Session session1=sessionFactory.openSession();
        System.out.println(session==session1);
        if (session != null) {
            System.out.println("session创建成功");
        } else {
            System.out.println("session创建失败");
        }

    }

    @Test
    public void testGetCurrentSession() {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.getCurrentSession();
        Session session1=sessionFactory.getCurrentSession();
        System.out.println(session==session1);
        if (session != null) {
            System.out.println("curentSession创建成功");
        } else {
            System.out.println("curentSession创建失败");
        }
    }
}

