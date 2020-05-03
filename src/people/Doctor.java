package people;



public class Doctor extends Person{
	public void Doctor() {
		setSpeciality("Doctor");
	}
	/*private String speciality;
	public String getSpeciality() {
		return this.speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality=speciality;
	}
	*/
	
	@Override
	public void introduce() {
		String introduceString= "Hello I am "+ getSpeciality();
		System.out.println(introduceString);
	} 
	
	
	@Override
	public int getSalary() 
    { 
        return base + 1000; 
    } 
}