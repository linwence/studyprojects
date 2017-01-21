package cn.muke.spring.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/1/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/muke/spring/demo1/applicationContext.xml")
public class SpringDemo1 {
    @Autowired
    private AccountService accountServiceImpl;
    @Test
    public void demo1(){
        accountServiceImpl.transfer("aaa","bbb",200);
    }
}
