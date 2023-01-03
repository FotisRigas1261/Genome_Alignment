package basic_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FASTA_reader{        //This class creates a list named genomes, containing Genome objects
    public static List<Genome> readGenomes(String File_name) throws Exception {
        List<Genome> genomes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(File_name));
        String line;
        String title = null;
        StringBuilder sequence = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(">")) {
                if (title != null) {
                    genomes.add(new Genome(title, sequence.toString()));
                }
                title = line.substring(1);
                sequence = new StringBuilder();
            } else {
                sequence.append(line);
            }
        }
        if (title != null) {
            genomes.add(new Genome(title, sequence.toString()));
        }
        reader.close();
        return genomes;
    }

}

