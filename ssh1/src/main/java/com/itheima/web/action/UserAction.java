package com.itheima.web.action;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2019年5月4日 下午9:49:51 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
    
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void setModel(User model) {
        this.model = model;
    }
    
    private User model = new User();
    @Override
    public User getModel() {
        return model;
    }
    
    public String findById(){
        model = userService.findById(getModel().getId());
        return SUCCESS;
    }

}
  
