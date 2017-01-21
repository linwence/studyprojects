package cn.muke.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/1/19.
 */

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void outMoney(String out, Double money) {
        String sql = "update account set money=money -?  where name =?";
        getJdbcTemplate().update(sql, money, out);

    }

    public void inMoney(String in, Double money) {
        String sql = "update account set money=money+? where name=?";
        getJdbcTemplate().update(sql, money, in);
    }
}
