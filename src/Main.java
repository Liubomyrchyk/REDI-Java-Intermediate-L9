import java.util.Arrays;

import people.Dentist;
import people.Developer;
import people.Doctor;
import people.Person;

// Driver class
public class Main{
		
	public static void main (String[] args) {
		Doctor doctor= new Doctor();
		doctor.introduce();
		System.out.println(doctor.getSalary());
		
		Dentist dentist= new Dentist();
		dentist.introduce();
		System.out.println(dentist.getSalary());
		
		Developer developer= new Developer();
		String[] skills= developer.getLanguageList();
		System.out.println(Arrays.toString(skills));
		System.out.println(developer.getSalary());
		
		developer.introduce();
	}	
	
}
