package cn.muke.spring.demo1;

/**
 * Created by Administrator on 2017/1/19.
 */
public interface AccountDao {
    public void outMoney(String out,Double money);
    public void inMoney(String in,Double money);
}
