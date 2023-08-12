package advancejava6th.JavaBeanTIC;
import java.io.Serializable;

public class BooleanProperties implements Serializable {
    private boolean isManager;
    
    public BooleanProperties(){};
    
    public boolean isIsManager() {
        return isManager;
    }
    public void setIsManger(boolean isManger){
        this.isManager = isManger;
    }
}

//on boolean properties there is no is in place of get properties 