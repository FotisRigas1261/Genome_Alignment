package file_readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import constructor_classes.Team_member;

public class txt_reader {
	public static List<Team_member> read_txt(String File_name) throws FileNotFoundException, IOException {
		List<Team_member> team = new ArrayList<Team_member>();
		try (BufferedReader br = new BufferedReader(new FileReader(File_name))) {        
    	    	
        String line;    
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\s+");
            String role = parts[0];
            String name = parts[1] + "_" + parts[2];
            int years = Integer.parseInt(parts[3]);

            if(role.equals("Bioinformatician")||role.equals("TeamLead")||role.equals("TechnicalSupport")) {
            	//person =new Team_member(role, name, years);
            	team.add(new Team_member(role, name, years));
            	}            
            else {
                throw new IllegalArgumentException("There are team members without assigned roles");
            	}
            }
        
        }
    	catch (IOException e) {
    		e.printStackTrace();
    	}
	return team;
    } 
	
	public static void display_team(List<Team_member> team) {
		for (Team_member i : team) {
    	    System.out.println(i.getRole());
    	    System.out.println(i.getName());
			}
	}
	
	
	}
