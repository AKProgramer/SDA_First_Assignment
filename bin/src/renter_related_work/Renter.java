package renter_related_work;

public class Renter {
	private int id;
	private String name;
	private String CNIC;
	private String email;
	private String phoneNo;
	private String address;

	public Renter(int id, String name, String cNIC, String email, String phoneNo, String address) {
		super();
		this.id = id;
		this.name = name;
		CNIC = cNIC;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCNIC() {
		return CNIC;
	}

	public void setCNIC(String cNIC) {
		CNIC = cNIC;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

interface propertiesOfRenter {
	public void getId();

	public void getName();

	public void getEmail();

	public void getListOfRentedCars();

	public void getTotalRentalFee();

	public void getPhoneNumber();

	public void getAddress();
}