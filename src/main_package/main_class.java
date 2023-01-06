package main_package;

import java.util.Scanner;
import basic_operations.*;
import constructor_classes.Genome;
import constructor_classes.Team_member;
import file_readers.FASTA_reader;
import java.util.List;
import file_readers.txt_reader.*;
import bioinformatician.*;
import team_leader.*;
import tech_support.*;

public class main_class {

	public static void main(String[] args) throws Exception {		

		//Opening of the files and creation of the initial alignment and team members list
		System.out.println("Welcome to Genome Alignment.");
		List<Genome> standard_alignment = FASTA_reader.readGenomes("src/hiv.fasta");
		List<Genome> SNiP_alignment= Standard_to_SNP_Alignment_Converter.convert_to_SNP(standard_alignment);
		List<Team_member> team = file_readers.txt_reader.read_txt("src/team.txt");					
				
		//Identification of users
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name with an underscore between your first and last name:");
		String name = scanner.nextLine();
		
		//Instructions for bioinformaticians given and actions executed
		for (Team_member member : team) {
			try {
				if (member.getName().equals(name)&& member.getRole().equals("Bioinformatician")) {
					Bioinformatician_actions.print_actions();
					String number = scanner.nextLine();
					while((!number.equals("END")) ){
					switch (number) {
				      case "1":
				    	Search_engines.display_alignment(standard_alignment);
				        break;
				      case "2":
				    	Search_engines.display_alignment(SNiP_alignment);
				        break;
				      case "3":
				        Search_engines.search_in_Standard(standard_alignment);
				        break;
				      case "4":
				    	Search_engines.search_in_Standard(SNiP_alignment);
				        break;
				      case "5":
				        Search_engines.search_title_in_Standard(standard_alignment);
				        break;
				      case "6":
				    	Search_engines.search_title_in_SNP(SNiP_alignment);
				        break;
				      case "7":
				    	Search_engines.display_Genome(standard_alignment);
				        break;
				      case "8":
				    	  Search_engines.display_Genome(SNiP_alignment);
				        break;
				      case "9":
				    	  Alignment_Editors.remove_Genome(standard_alignment);
				    	break;
				      case "10":
				    	  Alignment_Editors.remove_Genome(SNiP_alignment);
					    break;
				      case "11":
				    	  Alignment_Editors.add_Genome(standard_alignment);
				    	break;
				      case "12":
				    	  Alignment_Editors.add_Genome(SNiP_alignment);
					    break;
				      case "13":
				    	  Alignment_Editors.replace_Genome(standard_alignment);
				    	break;
				      case "14":
				    	  Alignment_Editors.replace_Genome(SNiP_alignment);
				      case "15":
				    	  Alignment_Editors.replace_sequence_in_Alignment(standard_alignment);
					    break;
				      case "16":
				    	  Alignment_Editors.replace_sequence_in_Alignment(SNiP_alignment);
					    break;
				      case "17":
				    	  Alignment_Editors.replace_sequence_in_Genome(standard_alignment);
				    	break;
				      case "18":
				    	  Alignment_Editors.replace_sequence_in_Genome(SNiP_alignment);
				    	break;
				      case "19":
				    	  //change reference Genome standard
				    	break;
				      case "20":
				    	  //change reference Genome snip
				    	break;
				      case "21":
				    	  Alignment_score_calculation.find_score_standard(standard_alignment);
				    	break;
				      case "22":
				    	  Alignment_score_calculation.calculate_score_SNP(SNiP_alignment);
				    	break;
				      case "23":
				    	  //Save alignment
				    	break;
				      case "24":
				    	  //retrieve personal alignment
				    	break;
				      default:				    	  
				        System.out.println("Invalid input");
				        break;
				    }
					}
				}
				
				//Instructions for TeamLeaders given and actions executed
				if (member.getName().equals(name)&& member.getRole().equals("TeamLead")) {
					TeamLead_actions.print_actions();
					String number = scanner.nextLine();
					switch (number) {
				      case "1":
				    	Search_engines.display_alignment(standard_alignment);
				        break;
				      case "2":
				    	Search_engines.display_alignment(SNiP_alignment);
				        break;
				      case "3":
				        Search_engines.search_in_Standard(standard_alignment);
				        break;
				      case "4":
				    	Search_engines.search_in_Standard(SNiP_alignment);
				        break;
				      case "5":
				        Search_engines.search_title_in_Standard(standard_alignment);
				        break;
				      case "6":
				    	Search_engines.search_title_in_SNP(SNiP_alignment);
				        break;
				      case "7":
				    	Search_engines.display_Genome(standard_alignment);
				        break;
				      case "8":
				    	  Search_engines.display_Genome(SNiP_alignment);
				        break;
				      default:
				        System.out.println("Invalid input");
				        break;
				    }						
				}
				
				//Instructions for TeamLeaders given and actions executed
				if (member.getName().equals(name)&& member.getRole().equals("TechnicalSupport")) {
					TechnicalSupport_actions.print_actions();
										
				}
				}
			 catch (Exception e) {		
				e.printStackTrace();
			}
		
		}
		scanner.close();
	}
}


		



