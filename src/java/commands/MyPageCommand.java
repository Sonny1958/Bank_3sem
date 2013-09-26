/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author hsty
 */
public class MyPageCommand extends TargetCommand {

    public MyPageCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("date", new Date());
        return super.execute(request); //To change body of generated methods, choose Tools | Templates.
    }
    
}
