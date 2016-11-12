package test;

public class Car {
	private String carId;
	private String carColor;
	private Office office;
    public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public Office getOffice() {
		return office;
	}
	
	public void setOffice(Office office) {
		this.office = office;
	}
	
	public String printDishes()
	{
		return String.format("The  car is: %s. Color is: %s." ,getCarId(),getCarColor());
	}
}
