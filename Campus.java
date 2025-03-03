import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{
}

class Department 
{
	private String departmentName;
	private List<Professor> professors;
	
	public Department(String departmentName) 
	{
		super();
		this.departmentName = departmentName;
		this.professors = new ArrayList(); 
	}
	
	
	public void addProfessor(Professor prof)
	{
		this.professors.add(prof);
	}


	public String getDepartmentName() 
	{
		return departmentName;
	}


	public List<Professor> getProfessors() 
	{
		return professors;
	}
	
}

public class Campus
{
    public static void main(String[] args) 
    {
     
    	Department dept = new Department("Computer Science");
    	dept.addProfessor(new Professor("Mr James","Java"));
    	dept.addProfessor(new Professor("Mr Scott","Python"));
    	dept.addProfessor(new Professor("Mr Smith","Adv Java"));
    	dept.addProfessor(new Professor("Mr Martin",".NET"));
    	
    	System.out.println("Department Name is :"+dept.getDepartmentName());
    	
    	System.out.println("Professor in :"+dept.getDepartmentName()+" department :");
    	
    	List<Professor> professors = dept.getProfessors();
    	professors.forEach(System.out::println);
    	
      
    }
}

