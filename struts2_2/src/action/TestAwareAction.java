package action;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Action 类通过可以实现某些特定的接口, 让 Struts2 框架在运行时向 Action 实例注入
 * parameters, request, session 和 application 对应的 Map 对象
 */
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
