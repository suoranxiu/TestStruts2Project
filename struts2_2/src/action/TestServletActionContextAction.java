package action;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 直接访问 Servlet API 将使 Action 与 Servlet 环境耦合在一起,  测试时需要有 Servlet 容器, 不便于对 Action 的单元测试.
 */
public class TestServletActionContextAction {
    public String execute(){

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        ServletContext servletContext = ServletActionContext.getServletContext();
        System.out.println("execute.....");
        return "success";
    }
}
