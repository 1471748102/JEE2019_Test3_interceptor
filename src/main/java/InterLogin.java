import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class InterLogin extends AbstractInterceptor {
    public String intercept(ActionInvocation invocation) throws java.lang.Exception {
        //System.out.println("登陆拦截器");
        Map session = invocation.getInvocationContext().getSession();
        //拦截器设置
        if(!session.get("username").toString().endsWith("r"))
            return "defuse";

        return invocation.invoke();
    }
}
