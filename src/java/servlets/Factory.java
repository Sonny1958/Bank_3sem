/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import commands.AddCustomerCommand;
import commands.TargetCommand;
import commands.Command;
import commands.ListCustomersCommand;
import commands.MyPageCommand;
import commands.ViewCustomerCommand;
import java.util.HashMap;
import java.util.Map;
import shared.BankDataController;

/**
 *
 * @author hsty
 */

public class Factory {
    
    private static Factory instance = new Factory();
    
    private Map<String, Command> commands = new HashMap<>();
    
    private Factory()
    {
        commands.put("main", new TargetCommand("/main.jsp"));
        commands.put("mypage", new MyPageCommand("/mypage.jsp"));
        commands.put("addcustomer", new AddCustomerCommand("/addCustomer.jsp"));
        commands.put("listcustomers", new ListCustomersCommand("/listCustomers.jsp"));
        commands.put("viewcustomer", new ViewCustomerCommand("/viewCustomer.jsp"));
    }

    public static Factory getInstance() {
       return instance;
    }
    public static BankDataController getBankController(){
      return DummyBankController.getInstance();
    }

    public Command getCommand(String cmdStr) {
        if(cmdStr == null)
            cmdStr = "main";
        return commands.get(cmdStr);
    }
    
}
