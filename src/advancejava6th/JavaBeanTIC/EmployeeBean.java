
package advancejava6th.JavaBeanTIC;
import java.io.Serializable;

public class EmployeeBean implements Serializable{//1.implementing serializable
    //2.private member
    private int id;
    private String name;
    //3.public no args constructor
    public EmployeeBean(){
        
    }
    //4.creating getter and setter method
     public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
       return  id;
    }
   
    public String getName (){
        return name;
    }
    public void setName(String name)
    {
     this.name =  name;
    }

}
