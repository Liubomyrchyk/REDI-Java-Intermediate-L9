 package people;

import java.util.ArrayList;

public class Developer extends Person{
	// languages and company
	String[] languageList= {"C++", "Python", "Java"}; 
	
	public String[] getLanguageList()    { 
        return this.languageList; 
    }
	
	public void setLanguageList(String[] languageList)    { 
        this.languageList=languageList; 
    }
	
	@Override
	public int getSalary()    { 
        return this.base +2000; 
    }
    
	@Override
	public void introduce() 
	    { 
	        System.out.println("Hello World!"); 
	    }
}