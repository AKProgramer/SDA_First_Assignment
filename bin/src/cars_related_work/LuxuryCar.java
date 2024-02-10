package cars_related_work;

public class LuxuryCar implements BasicPropertiesOfRentedCar {
	private Car car;
	private boolean rentalStatus;
	private double rentalFee;

	public LuxuryCar(Car car, boolean rentalStatus, double rentalFee) {
		this.car = car;
		this.rentalStatus = rentalStatus;
		this.rentalFee = rentalFee;
	}

	public void setRentalStatus(boolean rentalStatus) {
		this.rentalStatus = rentalStatus;
	}

	public void setRentalFee(double rentalFee) {
		this.rentalFee = rentalFee;
	}

	@Override
	public String getBrandName() {
		return car.getBrand();
	}

	@Override
	public boolean getRentalStatus() {
		return rentalStatus;
	}

	@Override
	public double getRentalFee() {
		return rentalFee;
	}

	@Override
	public String getPlateNo() {
		return car.getPlateNumber();
	}

	@Override
	public String getId() {
		return car.getId();
	}

	@Override
	public String getModel() {
		return car.getModel();
	}

	@Override
	public String getYear() {
		return car.getYear();
	}

	@Override
	public void calculateRent() {
		// TODO Auto-generated method stub

	}
}
