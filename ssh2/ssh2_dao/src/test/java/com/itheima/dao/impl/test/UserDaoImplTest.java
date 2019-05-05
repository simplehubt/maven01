package com.itheima.dao.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

/**  
 * ClassName:UserDaoImplTest <br/>  
 * Function:  <br/>  
 * Date:     2019年5月5日 下午3:54:54 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDaoImplTest {
    
    @Autowired
    private UserDao userDao;
    @Test
    public void test() {
        User user = userDao.findById(1);
        System.out.println(user);
    }

}
  
