package pac;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class InterCheck extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){

        //System.out.println("账号:" + getName());
        //System.out.println("密码:"+ getPassword());

        Map session = ActionContext.getContext().getSession();

        session.put("username",username);
        session.put("password",password);

        if (getUsername().equals("") || getPassword() == null) {
            return "InputNull";
        } else {
            return "Hello";
        }
    }
}
