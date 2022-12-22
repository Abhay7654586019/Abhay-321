package persons;

public class mainclass {

	public static void main(String[] args) {
		String[] student1 = {"Math","Chemistry"};
		String[] student2 = {"Computer","Java"};
		Student s1  = new Student("Abhay",21,"824572829","204543",student1);
		Student s2  = new Student("Ajit",21,"892394343","435345",student2);
		s1.print();
		s2.print();

	}

}
