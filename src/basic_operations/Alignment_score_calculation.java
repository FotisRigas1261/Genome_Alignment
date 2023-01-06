package basic_operations;

import java.util.List;

import constructor_classes.Genome;

public class Alignment_score_calculation {
	public static int calculate_score_SNP(List<Genome> SNP) {
        int score = 0;    	
    	String sequence ="";
        for (Genome i : SNP) {
            sequence = i.getSequence().replace("_", "");
            score += sequence.length();
        }
        System.out.println("The score of this alignment is:");
        System.out.println(score);
        return score;
    }
	
	//The score for both alignment types will be the same, since they represent the same thing, so in order to calculate the standard
	//alignment score it is first converted into SNP
	public static int find_score_standard(List<Genome> genomes) {
		List<Genome> SNP = null;
		try {
			SNP = Standard_to_SNP_Alignment_Converter.convert_to_SNP(genomes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int score = 0;    	
    	String sequence ="";
        for (Genome i : SNP) {
            sequence = i.getSequence().replace("_", "");
            score += sequence.length();
        }
        System.out.println("The score of this alignment is:");
        System.out.println(score);
		return score;
	}
}