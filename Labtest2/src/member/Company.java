package member;

public class Company {
	public static void main(String[] args) {
        Employee employee = new Employee("John", 25, "", "Home", 25631.5, "IT");
        Manager manager = new Manager("Maxx", 30, "947565847", "Planet", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();
        employee.print();
        manager.print();
    }
}
