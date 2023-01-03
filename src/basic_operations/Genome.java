package basic_operations;

public class Genome {   //this is a constructor class creating the genome objects
	String title;
	String sequence;
	
	public Genome(String t, String s) {
		this.title=t;
		this.sequence=s;
	}
	
	public static Genome Genome_constructor(String title, String sequence) {
		return new Genome(title,sequence);
	}
	public String getTitle() {
        return title;
    }

    public String getSequence() {
        return sequence;
    }
	public char charAt(int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
