package action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 通过实现 ServletRequestAware, ServletContextAware 等接口的方式
 */
public class TestServletAwareAction implements ServletRequestAware, ServletContextAware, ServletResponseAware {
    private ServletContext context;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    public String execute(){
        System.out.println("servletContext: "+this.context);
        return "success";
    }
}
