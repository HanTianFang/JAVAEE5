package annotation;

@Component(id="userDao")
public class UserDaoImpl {
	String name ;  
    
    public void show(){  
        System.out.println("这里是dao方法........");  
    }
}
