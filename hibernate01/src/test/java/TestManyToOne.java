import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import vincent.lin.domain.Grade;
import vincent.lin.domain.StudentsEntity;
import vincent.lin.util.HibernateUtil;

/**
 * Created by Administrator on 2017/1/8.
 */
public class TestManyToOne {
@Test
    public void testAddStudent(){
        StudentsEntity studentsEntity=new StudentsEntity();
        studentsEntity.setSname("赵六");
        Grade grade=new Grade();
        grade.setGname("8班");
        studentsEntity.setGrade(grade);
        StudentsEntity studentsEntity2=new StudentsEntity();

        studentsEntity2.setSname("张7");
        studentsEntity2.setGrade(grade);
        Session session= HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        session.save(grade);
        session.save(studentsEntity);
        session.save(studentsEntity2);

        transaction.commit();
        session.close();
    }
}
