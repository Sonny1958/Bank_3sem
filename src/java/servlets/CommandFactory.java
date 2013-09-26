/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import commands.Command;
import commands.ShowDateCommand;
import commands.TargetCommand;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tobias
 */
class CommandFactory {
    private static CommandFactory instance = new CommandFactory();
    private Map<String, Command> commands = new HashMap<>();
    
    private CommandFactory()
    {
        commands.put("main", new TargetCommand("/main.jsp"));
        commands.put("show_date", new ShowDateCommand("/show_date.jsp"));
    }
    
    public static CommandFactory getInstance()
    {
        return instance;
    }
    
    Command getCommand(String cmdStr) {
        if(cmdStr == null)
        {
            cmdStr = "main";
        }
        return commands.get(cmdStr);
    }
    
    
}
