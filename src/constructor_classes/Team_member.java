package constructor_classes;

//Constructor method for team members
public class Team_member {
		
	String name;
	int years;
	String role;
	
	public Team_member(String role, String name, int years) {
		this.name = name;
		this.years = years;
		this.role= role;
	}
	
	public String getRole() {
	        return role;
	    }
	public String getName() {
        return name;
    }	
	public void setRole(String role) {
        this.role=role;
    }
	public void setName(String name) {
        this.name=name;
    }
	public void setYears(int years) {
        this.years=years;
    }
}















