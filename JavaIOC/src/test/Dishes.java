package test;

public class Dishes {
	private String dishName;
	private Integer dishPrice;
	private Car car;
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	public Integer getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(Integer dishPrice) {
		this.dishPrice = dishPrice;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String printDishes()
	{
		return String.format("Dish Name: %s. Dish Price: %d." ,getDishName(),getDishPrice());
	}
}
