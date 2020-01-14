package action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

public class TestActionContext {
    public String execute(){

        ActionContext actionContext = ActionContext.getContext();

        Map<String,Object> applicationMap = actionContext.getApplication();
        applicationMap.put("applicationKey","applicationValue");

        Object date = applicationMap.get("date");
        System.out.println("date: "+date);

        Map<String,Object> sessionMap = actionContext.getSession();
        sessionMap.put("sessionKey","sessionValue");

        Map<String,Object> requestMap = (Map<String,Object>)actionContext.get("request");
        requestMap.put("requestKey","requestValue");


        Map<String,Object> parameterMap = actionContext.getParameters();
        System.out.println(((String[])parameterMap.get("name"))[0]);//请求参数值对应的数组

//        parameterMap.put("age",100);//parameterMap只能读数据，不能写数据

        return "success";
    }
}
