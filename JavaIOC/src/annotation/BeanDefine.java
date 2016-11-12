package annotation;

public class BeanDefine {
	private String id;

	private String beanClassName;
	
	public BeanDefine(String id,String beanClassName) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.beanClassName = beanClassName;
	}
	
	public String getId() {
		return id;
	}
	 public void setId(String id) {
		this.id = id;
	}
	
	public String getBeanClassName() {
		return beanClassName;
	}
	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;
	}
}
