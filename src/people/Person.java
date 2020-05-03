package people;


public class Person{
	protected static int base = 1000; 
	private String speciality = "Surgeon";
    
	public int getSalary()    { 
        return this.base; 
    }
    
    public void setSalary(int base) {
		this.base=base;
	}
    
    
    public String getSpeciality() {
    	return this.speciality;
    }
    
    public void setSpeciality(String speciality) {
		this.speciality=speciality;
	}
    
    
	public void introduce() {
		System.out.println("Hello everyone!");
		
	}
	
	
}