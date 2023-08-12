package advancejava6th.JavaBeanTIC;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Method;

class EmployeeBean implements Serializable { //1. Implementing serializable
    //2. Private members

    private int id;
    private String name;

    //3. public no-args constructors
    public EmployeeBean() {
    }

    ;
    
    //4. Create getter and setter methods
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void Hello(){
        System.out.println("hello guys");
    }
    public void Bye(){
        System.out.println("bye guys");
    }
    
}

public class IntrospectionExample {

    public static void main(String[] args) {
        //EmployeeBean emp = new EmployeeBean();
        try {
            // Get the BeanInfo for a class
            BeanInfo beanInfo = Introspector.getBeanInfo(EmployeeBean.class);
            // Get the property descriptors
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            System.out.println("Properties:");
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                System.out.println(descriptor.getName());
            }
            //Get the method description 
            Method[] methods = EmployeeBean.class.getMethods();
            System.out.println("\nMEthods");
            for (Method method : methods){
                System.out.println(method.getName());
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }

    }
}
