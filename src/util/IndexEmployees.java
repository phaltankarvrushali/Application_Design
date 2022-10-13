package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Employee;
import model.Employees;

/**
 *
 * @author vrushaliphaltankar
 */
public class IndexEmployees 
{
    public void indexEmployees(Employee employee)
    {
        Employees employees = Employees.getInstance();
        Map nameToEmployee = new HashMap();
        employees.getNameToEmployee().put(employee.getName(), employee);
        employees.getEmailIdToEmployee().put(employee.getContactInfo().getEmail(), employee);
        employees.getEmpIdToEmployee().put(employee.getEmpId(), employee);
        employees.getPhoneNumberToEmployee().put(employee.getContactInfo().getCell(), employee);
        
        if((null == employees.getGenderToEmployee().get(employee.getGender()) 
                || employees.getGenderToEmployee().get(employee.getGender()).isEmpty()))
        {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee);
            
            employees.getGenderToEmployee().put(employee.getGender(), employeeList);
        }
        else
        {
            employees.getGenderToEmployee().get(employee.getGender()).add(employee);
        }
        
        if((null == employees.getLevelToEmployee().get(employee.getLevel()) 
                || employees.getLevelToEmployee().get(employee.getLevel()).isEmpty()))
        {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee);
            
            employees.getLevelToEmployee().put(employee.getLevel(), employeeList);
        }
        else
        {
            employees.getLevelToEmployee().get(employee.getLevel()).add(employee);
        }
        
        if((null == employees.getTeamInfoToEmployee().get(employee.getTeamInfo()) 
                || employees.getTeamInfoToEmployee().get(employee.getTeamInfo()).isEmpty()))
        {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee);
            
            employees.getTeamInfoToEmployee().put(employee.getTeamInfo(), employeeList);
        }
        else
        {
            employees.getTeamInfoToEmployee().get(employee.getTeamInfo()).add(employee);
        }
        
        if((null == employees.getPositionTitleToEmployee().get(employee.getPositionTitle()) 
                || employees.getPositionTitleToEmployee().get(employee.getPositionTitle()).isEmpty()))
        {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee);
            
            employees.getPositionTitleToEmployee().put(employee.getPositionTitle(), employeeList);
        }
        else
        {
            employees.getPositionTitleToEmployee().get(employee.getPositionTitle()).add(employee);
        }
    }
    
}
