import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import vincent.lin.domain.Grade;
import vincent.lin.domain.StudentsEntity;
import vincent.lin.util.HibernateUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/1/8.
 */
public class TestOneToMany {

    @Test
    public void testAdd() {
        Grade grade = new Grade();
        grade.setGname("7班");
        grade.setGdesc("大田六中初三七班");
        StudentsEntity studentsEntity = new StudentsEntity();
        studentsEntity.setSname("李四");
        studentsEntity.setGrade(grade);
        StudentsEntity studentsEntity2 = new StudentsEntity();

        studentsEntity2.setSname("王五");
        studentsEntity2.setGrade(grade);
        Set set = new HashSet<StudentsEntity>();
        set.add(studentsEntity);
        set.add(studentsEntity2);
        grade.setStudentsEntities(set);
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(grade);
        //session.save(studentsEntity);
        //session.save(studentsEntity2);
        transaction.commit();
        session.close();

    }
@Test
    public void testFindStudentByGrade(){
        Session session = HibernateUtil.getSession();
        Grade grade=(Grade)session.get(Grade.class,1);
        System.out.println(grade.getGdesc());

      Set<StudentsEntity> studentsEntities=  grade.getStudentsEntities();
       Iterator<StudentsEntity> iterator= studentsEntities.iterator();
        while (iterator.hasNext()){
           StudentsEntity studentsEntity= iterator.next();
            System.out.println(studentsEntity);
        }
    }

}
