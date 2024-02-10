import java.util.List;

public class Car {
	private int id;
    private static int nextId = 1;
	private String brand;
	private String model;
	private int year;
	private String plateNumber;
    private boolean rentalStatus;
    private List<String> features;
    private double rent;
    private boolean insurable;

    public Car(String brand, String model, int year, String plateNumber,boolean rentalStatus,double rent,boolean insurable,List<String> features) {
        this.id = nextId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.plateNumber = plateNumber;
        this.rentalStatus = rentalStatus;
        this.rent = rent;
        this.insurable = insurable;
        this.features = features;
    }

    public boolean isInsurable() {
        return insurable;
    }
    public void setInsurable(boolean insurable) {
        this.insurable = insurable;
    }
    public double getRent() {
        return rent;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }
    public List<String> getListOfFeatures() {
        return features;
    }
    public void addAFeature(String feature) {
        features.add(feature);
    }
    public boolean getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
	public int getId() {
		return id;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
    public void display() {
        System.out.println("Car ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rental Status: " + rentalStatus);
        System.out.println("Features: ");
        for (String feature : features) {
            System.out.println("- " + feature);
        }
        System.out.println("Rental Fee: " + rent);
        System.out.println("Insurable: " + insurable);
        System.out.println("\n\n");

    }
    

}

