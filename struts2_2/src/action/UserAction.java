package action;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class UserAction implements SessionAware, ApplicationAware {

    private Map<String,Object> session;
    private Map<String,Object> application;
    private String username;

    public String execute(){

        session.put("username",username);

        Integer count = (Integer) application.get("count");
        if(count==null){
            count = 0;
        }
        count++;

        application.put("count",count);
        return "login-success";
    }

    public String logout(){
        //强转为SessionMap 使session失效
        ((SessionMap)session).invalidate();
        Integer count = (Integer) application.get("count");
        if (count > 0){
            count --;
        }
        application.put("count",count);
        return "logout-success";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }
}
