package action;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware {

    private Map<String,Object> application;
    public String execute(){
        application.put("applicationKey2","applicationValue");

        System.out.println(application.get("date"));

        return "success";
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    @Override
    public void setParameters(Map<String, String[]> map) {
        
    }

    @Override
    public void setRequest(Map<String, Object> map) {

    }

    @Override
    public void setSession(Map<String, Object> map) {

    }
}
