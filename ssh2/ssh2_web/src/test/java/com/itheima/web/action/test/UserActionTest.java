package com.itheima.web.action.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.domain.User;
import com.itheima.service.UserService;

/**  
 * ClassName:UserActionTest <br/>  
 * Function:  <br/>  
 * Date:     2019年5月5日 下午4:02:45 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
public class UserActionTest {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void test() {
        User user = userService.findById(2);
        System.out.println(user);
    }

}
  
