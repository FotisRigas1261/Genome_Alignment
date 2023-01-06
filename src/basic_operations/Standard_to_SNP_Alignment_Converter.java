package basic_operations;

import java.util.ArrayList;
import java.util.List;

import constructor_classes.Genome;

public class Standard_to_SNP_Alignment_Converter{
	public static List<Genome> convert_to_SNP(List<Genome> genomes) throws Exception {

	List<Genome> SNP = new ArrayList<>();
	Genome firstGenome = genomes.get(0);  // Get the first Genome object

	for (int i = 1; i < genomes.size(); i++) {  // Iterate through the rest of the Genomes
	  Genome genome = genomes.get(i);  // Get the current Genome object
	  String title = genome.getTitle();  // Get the title of the current Genome
	  String sequence = genome.getSequence();  // Get the sequence of the current Genome

	  StringBuilder sb = new StringBuilder();  // Create a StringBuilder to store the different parts of the sequence string

	  for (int j = 0; j < sequence.length(); j++) {  // Iterate through the characters in the sequence string
	    if (sequence.charAt(j) != firstGenome.getSequence().charAt(j)) {  // If the character at the current index is different in the first Genome
	      sb.append(sequence.charAt(j));  // Append the character to the StringBuilder
	    } else {
	      sb.append("_");  // Append a "_" character to the StringBuilder
	    }
	  }

	  String differentParts = sb.toString();  // Convert the StringBuilder to a String

	  // Create a new Genome object with the title and different parts of the sequence and add it to the SNP list
	  SNP.add(new Genome(title, differentParts));
	}
	return SNP;
}
}