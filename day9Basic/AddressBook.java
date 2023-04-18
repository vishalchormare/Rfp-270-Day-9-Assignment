package day9Basic;

public class AddressBook {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<DetailsOfEmployee> list = new ArrayList<DetailsOfEmployee>();
		int option;
		do {
			DetailsOfEmployee emp = new DetailsOfEmployee();
			System.out.println("Enter your option : ");
			System.out.println("1.Add contact  ");
			System.out.println("2.Display all contact ");

			option = s.nextInt();

			switch (option) {
			case 1:
				emp.DetailsOfEmployee_();
				list.add(emp);
				break;
			case 2:
				emp.Add_DetailsOfEmployee(list);
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to continue (1.Continue.Exit)");
			option = s.nextInt();
		} while (option != 0);

	}

}
