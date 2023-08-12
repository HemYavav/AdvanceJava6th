
package advancejava6th.JavaBeanTIC;


public class JavaBeanTIC {


    public static void main(String[] args) {
        EmployeeBean emp1 = new EmployeeBean();
        emp1.setId(1);
        emp1.setName("Hem N. Yadav");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: "+ emp1.getName());
        
        BooleanProperties b1 = new BooleanProperties();
        b1.setIsManger(true);
        System.out.println("Is Manager or not? "+b1.isIsManager());
    }
    
}
