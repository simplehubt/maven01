package com.itheima.domain;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2019年5月4日 下午8:43:38 <br/>       
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password
                + "]";
    }
    
    
}
  
