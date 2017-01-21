package vincent.lin.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Grade {
    private int gid;
    private String gname;
    private String gdesc;
    private Set<StudentsEntity> studentsEntities = new HashSet<StudentsEntity>();

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public Set<StudentsEntity> getStudentsEntities() {
        return studentsEntities;
    }

    public void setStudentsEntities(Set<StudentsEntity> studentsEntities) {
        this.studentsEntities = studentsEntities;
    }

}
