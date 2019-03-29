import com.opensymphony.xwork2.ActionSupport;

import java.io.IOException;
import java.sql.SQLException;

public class Exception extends ActionSupport {
      public String execute() throws IOException, SQLException {

        double number = Math.random();
        if (number > 0.5)
            throw new IOException("大于0.5，抛出IOException异常");
        else
            throw new SQLException("不大于0.5，抛出SQLException异常");

    }
}
