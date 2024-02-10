package cars_related_work;

public class Car {
	private String id;
	private String brand;
	private String model;
	private String year;
	private String plateNumber;

	public Car(String id, String brand, String model, String year, String plateNumber) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.plateNumber = plateNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

}

interface BasicPropertiesOfRentedCar {
	public String getId();

	public String getBrandName();

	public String getModel();

	public String getYear();

	public boolean getRentalStatus();

	public double getRentalFee();

	public String getPlateNo();

	public void calculateRent();
}
