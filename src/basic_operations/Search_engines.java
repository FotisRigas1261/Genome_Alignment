package basic_operations;

import java.util.Scanner;

import constructor_classes.Genome;

import java.util.List;

public class Search_engines {
			
	public static void  search_in_Standard(List<Genome> genomes){
		System.out.println("please write the sequence you want to search");
		Scanner scanner = new Scanner(System.in);
		String searchSeq = scanner.nextLine();
		scanner.close(); 
		try {
			for (Genome i : genomes) {
				if (i.getSequence().contains(searchSeq)) {
					String title = i.getTitle();
					System.out.println(title);
				}
			}
		}
		catch (Exception e) {
		System.out.println("This sequence doesn't exist in the alignment");		    
	      }
		}
	
	
	public static void  search_in_SNP(List<Genome> SNP){
		System.out.println("please write the sequence you want to search");
		Scanner scanner = new Scanner(System.in);
		String searchSeqSNP = scanner.nextLine();
		scanner.close();
		try {
		for (Genome i : SNP) {
		      if (i.getSequence().contains(searchSeqSNP)) {
		        String title = i.getTitle();
		        System.out.println(title);
		      }
			}
		}
		catch (Exception e) {
			System.out.println("This sequence doesn't exist in the alignment");		    
		      }
		 }
	
	
	public static void search_title_in_Standard(List<Genome> genomes){
		System.out.println("please write the title you want to search");
		Scanner scanner = new Scanner(System.in);
		String searchTitle = scanner.nextLine();
		scanner.close();
		try {
		for (Genome i : genomes) {
		      if (i.getTitle().contains(searchTitle)) {
		        String sequence = i.getSequence();
		        System.out.println(sequence);
		      }
			}
		}
		catch (Exception e) {
			System.out.println("This title doesn't exist in the alignment");		    
		      }
		 }
	
	
	public static void  search_title_in_SNP(List<Genome> SNP){
		System.out.println("please write the title you want to search");
		Scanner scanner = new Scanner(System.in);
		String searchTitle = scanner.nextLine();
		scanner.close();
		try {
		for (Genome i : SNP) {
		      if (i.getTitle().contains(searchTitle)) {
		        String sequence = i.getSequence();
		        System.out.println(sequence);
		      }
			}
		}
		catch (Exception e) {
			System.out.println("This title doesn't exist in the alignment");		    
	      	}
	 }
	
	public static void display_alignment(List<Genome> Alignment) {
		for (Genome i : Alignment) {
    	    System.out.println(i.getTitle());
    	    System.out.println(i.getSequence());
			}
	}
	
	public static void display_Genome(List<Genome> Alignment) {
		System.out.println("Please type the index of the Genome you want to see");
		Scanner scanner = new Scanner(System.in);
		String index = scanner.nextLine();
		scanner.close();
		int i=Integer.parseInt(index);
    	System.out.println(Alignment.get(i).getTitle());
	    System.out.println(Alignment.get(i).getSequence());
	}
	
}