package annotation;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXMLApplicationContext path = new ClassPathXMLApplicationContext("configAnnotation.xml");
		UserServiceImpl userService = (UserServiceImpl) path.getBean("userService");
		userService.show();
	}

}
