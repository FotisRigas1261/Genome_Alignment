package basic_operations;

import java.util.List;

public class Alignment_score_calculation {
	public static int find_score(List<Genome> SNP) {
        int score = 0;    	
    	String sequence ="";
        for (Genome i : SNP) {
            sequence = i.getSequence().replace("_", "");
            score += sequence.length();
        }
        return score;
    }
}