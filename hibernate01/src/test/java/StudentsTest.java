import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import vincent.lin.domain.AddressEntity;
import vincent.lin.domain.StudentsEntity;

import java.util.Calendar;


/**
 * Created by Administrator on 2017/1/7.
 */
public class StudentsTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();

       // ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
       ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        transaction=session.beginTransaction();
    }

    @After
    public void destory() {
       // transaction.commit();
        session.close();
        sessionFactory.close();

    }

    @Test
    public void testSaveStudents() {
        StudentsEntity studentsEntity=new StudentsEntity();
        //studentsEntity.setSid(3);
        studentsEntity.setSname("张三2");
       // studentsEntity.setAddress("北京通州");
        AddressEntity addressEntity=new AddressEntity("7100068","092","北京通州");
        studentsEntity.setAddressEntity(addressEntity);
        studentsEntity.setGender("男");
        Calendar calendar=Calendar.getInstance();

        studentsEntity.setBirthday(calendar.getTime());
       // studentsEntity.setBirthday();

        session.save(studentsEntity);
        transaction.commit();
    }

    @Test
    public void testReadStudents(){
        StudentsEntity studentsEntity=(StudentsEntity) session.get(StudentsEntity.class,1);
        System.out.println(studentsEntity);

    }

    @Test
    public void testGetStuendt(){
        StudentsEntity studentsEntity=(StudentsEntity) session.get(StudentsEntity.class,1);
        //System.out.println(studentsEntity);
        //studentsEntity=(StudentsEntity)session.get(StudentsEntity.class,1);
       // System.out.println(studentsEntity);
    }

    @Test
    public void testLoadStudent(){
        StudentsEntity studentsEntity=(StudentsEntity)session.load(StudentsEntity.class,1);
       // System.out.println(studentsEntity);
        //  studentsEntity=(StudentsEntity)session.load(StudentsEntity.class,1);
       // System.out.println(studentsEntity);
    }
    @Test
    public void testUpdateStudent(){
        StudentsEntity studentsEntity=(StudentsEntity)session.load(StudentsEntity.class,1);
        studentsEntity.setGender("女");
        session.update(studentsEntity);
        transaction.commit();
    }

    public void testDeleteStudent(){
        StudentsEntity studentsEntity=(StudentsEntity)session.load(StudentsEntity.class,1);
        session.delete(studentsEntity);
        transaction.commit();
    }
}
