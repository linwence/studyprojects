package cn.muke.spring.demo1;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/1/19.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDaoImpl accountDao;

    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }
}
