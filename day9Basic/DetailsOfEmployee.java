package day9Basic;

public class DetailsOfEmployee {
  
  private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DetailsOfEmployee [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";

	}

	public void DetailsOfEmployee_() {

		Scanner s = new Scanner(System.in);
		System.out.print("Add Contact  \n");
		System.out.print("Enter First Name: ");
		this.firstName = s.nextLine();
		System.out.print("Enter Last Name : ");
		this.lastName = s.nextLine();
		System.out.print("Enter City : ");
		this.city = s.nextLine();
		System.out.print("Enter State : ");
		this.state = s.nextLine();
		System.out.print("Enter zip : ");
		this.zip = s.nextLine();
		System.out.print("Enter PhoneNumber: ");
		this.phoneNumber = s.nextLine();
		System.out.print("Enter Email ID : ");
		this.email = s.nextLine();
	}

	public void Add_DetailsOfEmployee(ArrayList<DetailsOfEmployee> arr) {
		boolean is_Empty = arr.isEmpty();
		if (is_Empty == true)
			System.out.println("Array List is Empty");
		else
			System.out.println(arr);
	}

}
