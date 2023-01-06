package basic_operations;

import java.util.List;
import java.util.Scanner;

import constructor_classes.Genome;

public class Alignment_Editors {
	public static List<Genome> remove_Genome(List<Genome> genomes) {
		System.out.println("please write the complete title of the sequence you want to remove:");
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		scanner.close();
		try {
			genomes.removeIf(genome -> genome.getTitle().equals(title));
		}
		catch(Exception e) {
			System.out.println("Title not found!");
		}
		return genomes;
	}
	
	public static List<Genome> add_Genome(List<Genome> genomes) {
		System.out.println("please write a title for the new sequence:");
		Scanner scanner1 = new Scanner(System.in);
		String title = scanner1.nextLine();
		System.out.println("please write the new sequence:");
		Scanner scanner2 = new Scanner(System.in);
		String sequence = scanner1.nextLine();
		scanner1.close();
		scanner2.close();
		Genome added_Genome = new Genome(title,sequence);
		genomes.add(added_Genome);		
		return genomes;
	}
	
	public static List<Genome> replace_Genome(List<Genome> genomes) {
		System.out.println("please write the complete title of the sequence you want to replace:");
		Scanner scanner1 = new Scanner(System.in);
		String title = scanner1.nextLine();
		System.out.println("please write a title for the replacement sequence:");
		Scanner scanner2 = new Scanner(System.in);
		String new_title = scanner1.nextLine();		
		System.out.println("please write the new sequence:");
		Scanner scanner3 = new Scanner(System.in);
		String new_sequence = scanner1.nextLine();
		//check for valid input as a sequence
		boolean valid = true;
	    for (char c : new_sequence.toCharArray()) {
	      if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
	        valid = false;
	        break;
	      }
	    }
	    if (valid) {	 
	      System.out.println("Input is valid.");
	    } else {	     
	      System.out.println("Error: Input must contain only the characters A, T, C, and G.");
	    }
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
		try {
			genomes.removeIf(genome -> genome.getTitle().equals(title));
		}
		catch(Exception e) {
			System.out.println("Title not found!");
		}
		Genome replacement_Genome = new Genome(new_title,new_sequence);
		genomes.add(replacement_Genome);
		//This method will delete the existing genome and insert the replacement one at the end of the list.
		//This should not be significant since it does not change the alignment score
		return genomes;
	}
	
	public static  List<Genome> replace_sequence_in_Alignment(List <Genome> genomes) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a search sequence: ");
	    String searchString = scanner.nextLine();
	    System.out.print("Enter a replacement string: ");
	    String replacementString = scanner.nextLine();
	    scanner.close();

	    if (searchString.length() == replacementString.length()) {
	      for (Genome genome : genomes) {
	        String sequence = genome.getSequence();
	        if (sequence.contains(searchString)) {
	          int startIndex = sequence.indexOf(searchString);
	          int endIndex = startIndex + searchString.length();
	          String newSequence =
	              sequence.substring(0, startIndex)
	                  + replacementString
	                  + sequence.substring(endIndex);
	          genome.setSequence(newSequence);
	        }
	      }
	    } else {
	      System.out.println("Error: Search and replacement strings must be the same size.");
	    }	
		return genomes;
	}
	
	public static List<Genome> replace_sequence_in_Genome(List <Genome> genomes) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a Genome title: ");
	    String search_title = scanner.nextLine();
	    Genome genome = null;
	    for (Genome g : genomes) {
	      if (g.getTitle().equals(search_title)) {
	        genome = g;
	        break;
	      }
	    }

	    if (genome != null) {
	    	System.out.print("Enter a search string: ");
	        String searchString = scanner.nextLine();
	        System.out.print("Enter a replacement string: ");
	        String replacementString = scanner.nextLine();

	     
	        boolean valid = true;
	        for (char c : replacementString.toCharArray()) {
	          if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
	            valid = false;
	            break;
	          }
	        }

	        if (valid && searchString.length() == replacementString.length()) {
	          // If the input is valid, replace the search string with the replacement string
	          String sequence = genome.getSequence();
	          int startIndex = sequence.indexOf(searchString);
	          int endIndex = startIndex + searchString.length();
	          String newSequence =
	              sequence.substring(0, startIndex)
	                  + replacementString
	                  + sequence.substring(endIndex);
	          genome.setSequence(newSequence);
	          System.out.println("New sequence:");
	  		  System.out.println(newSequence);
	        }
	        }	    
	    	else {
	        System.out.println("Error: Search and replacement strings must be the same size.");
	    	}	
		scanner.close();
		return genomes;
	}
}	
