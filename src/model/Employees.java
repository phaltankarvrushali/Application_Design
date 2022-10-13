package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vrushaliphaltankar
 * 
 * This class acts as a DB to save all Employees in HashMap
 * which will be used later for search Employee feature.
 * 
 * Object of this class will be a singleton 
 * and it will be read only
 */
public class Employees {
    
    private Map<String,Employee> nameToEmployee;
    private Map<String, Employee> empIdToEmployee;
    private Map<String, Employee> phoneNumberToEmployee;
    private Map<String, Employee> emailIdToEmployee;
    private Map<String, List<Employee>> genderToEmployee;
    private Map<String, List<Employee>> positionTitleToEmployee;
    private Map<Integer, List<Employee>> levelToEmployee;
    private Map<String, List<Employee>> teamInfoToEmployee;
    
    private static Employees singletonEmployees = null;
    /*
     * Private Constructor to prevent new 
     * Object creation 
     */
    private Employees() {
        nameToEmployee = new HashMap<>();
        empIdToEmployee = new HashMap<>();
        phoneNumberToEmployee = new HashMap<>();
        emailIdToEmployee = new HashMap<>();
        genderToEmployee = new HashMap<>();
        positionTitleToEmployee = new HashMap<>();
        levelToEmployee = new HashMap<>();
        teamInfoToEmployee = new HashMap<>();        
    }
      
    /*
     * To get only one instance of Employees 
     * Object whenever required.
     */
    public static Employees getInstance() {
        if(singletonEmployees == null)
        {
            singletonEmployees = new Employees();
        }
        
        return singletonEmployees;
    }

    public Map<String, Employee> getNameToEmployee() {
        return nameToEmployee;
    }

    public Map<String, Employee> getEmpIdToEmployee() {
        return empIdToEmployee;
    }

    public Map<String, Employee> getPhoneNumberToEmployee() {
        return phoneNumberToEmployee;
    }

    public Map<String, Employee> getEmailIdToEmployee() {
        return emailIdToEmployee;
    }

    public Map<String, List<Employee>> getGenderToEmployee() {
        return genderToEmployee;
    }

    public Map<String, List<Employee>> getPositionTitleToEmployee() {
        return positionTitleToEmployee;
    }

    public Map<Integer, List<Employee>> getLevelToEmployee() {
        return levelToEmployee;
    }

    public Map<String, List<Employee>> getTeamInfoToEmployee() {
        return teamInfoToEmployee;
    }
}
