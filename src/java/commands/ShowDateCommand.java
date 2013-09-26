/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author tobias
 */
public class ShowDateCommand extends TargetCommand{

    public ShowDateCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        
        request.setAttribute("date", new Date());
        
        return super.execute(request); 
    }
    
}
