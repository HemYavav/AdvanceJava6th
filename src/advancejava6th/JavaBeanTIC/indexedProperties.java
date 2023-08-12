package advancejava6th.JavaBeanTIC;

import java.io.Serializable;

class Employee implements Serializable{
    final private String[] phoneNumbers;
    public Employee() {
        phoneNumbers = new String[3];
    }
    public String getPhoneNumber(int index) {
        return phoneNumbers[index];
    }
    public void setPhoneNumber(int index, String phoneNumber) {
        phoneNumbers[index] = phoneNumber;
    }
}
    
public class indexedProperties {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPhoneNumber(0, "98123456");
        employee.setPhoneNumber(1, "984578213");
        employee.setPhoneNumber(2, "1234568");
        System.out.println(employee.getPhoneNumber(0));  
        System.out.println(employee.getPhoneNumber(1));  
        System.out.println(employee.getPhoneNumber(2)); 
    }
}
