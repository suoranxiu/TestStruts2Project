package action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;


/**
 * ActionContext 是 Action 执行的上下文对象, 在 ActionContext 中保存了 Action 执行所需要的所有对象,
 * 包括 parameters, request, session, application 等.
 * (ActionContext 类中没有提供类似 getRequest() 这样的方法来获取 HttpServletRequest 对应的 Map 对象.
 * 要得到 HttpServletRequest 对应的 Map 对象, 可以通过为 get() 方法传递 “request” 参数实现)
 *
 */
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
