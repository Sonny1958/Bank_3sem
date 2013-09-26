/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author hsty
 */
public class TargetCommand implements Command {
    private final String target;

    public TargetCommand(String target) {
        this.target = target;
    }

    @Override
    public String execute(HttpServletRequest request) {
        return target;
    }
    
    
    
}
