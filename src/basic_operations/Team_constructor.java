package basic_operations;

//Constructor method for team members
public class Team_constructor {
	
	public class Team_member {
		  String name;
		  int years;
	

		  public Team_member(String name, int years) {
		    this.name = name;
		    this.years = years;
		  }
			public String getName() {
		        return name;
		    }
		}
	public class Bioinformatician extends Team_member {
		  public Bioinformatician(String name, int years) {
		   super(name, years);
		}
	}
	public class TeamLead extends Team_member {
		  public TeamLead(String name, int years) {
		   super(name, years);
		  }
	}
	public class TechnicalSupport extends Team_member {
		  public TechnicalSupport(String name, int years) {
		   super(name, years);
	}
	}
}
