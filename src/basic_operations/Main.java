package basic_operations;
import java.util.Scanner;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Welcome to Genome Alignment.\nWhat is your name?");
	    String name = scanner.nextLine();

	    if (name.equals("Alice")) {
	      System.out.println("Welcome, Alice!");
	    } else if (name.equals("Bob")) {
	      System.out.println("Welcome, Bob!");
	    } else {
	      System.out.println("Welcome, user!");
	    }
		List<Genome> genomes = FASTA_reader.readGenomes("C:/Users/friga/Desktop/hiv.fasta"); //dimourgw genomes apo to arxeio
		List<Genome> SNP = Standard_to_SNP_Alignment_Conversion.genome_conversion(genomes); //ta sugkrinw me to 1o
    	//System.out.println(genomes.get(0).getTitle());
	    //System.out.println(genomes.get(0).getSequence());
	    int score = Alignment_score_calculation.find_score(SNP);
	    System.out.println(score);
    	/*
    	for (Genome i : genomes) {
    	    System.out.println(i.getTitle());
    	    System.out.println(i.getSequence());
    	}
    	*/

	}

}
