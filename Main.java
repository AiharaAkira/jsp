package com.javalec.exjsp;

public class Main {
    public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                   + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                   + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                   + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                   + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                   + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                   + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                   + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                   + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                   + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                   + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                   + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                   + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                   + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                   + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                   + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                   + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                   + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                   + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                   + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                   + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                   + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
        char[] charArray = dna.toCharArray();
    
    int tagg= 0, ccag = 0, agcc = 0;
    
    char[] current = new char[4];
    
    for (int i = 0; i < charArray.length - 3; i++){
        for (int j= 0; j < current.length; j++){
            current[j] = charArray[i+j];
        }
        String seq = new String(current);
        
            switch (seq) {
  case "TAGG":
    tagg++;
    break;
  case "CCAG":
    ccag++;
    break;
  case "AGCC":
    agcc++;
    break;
    
}
    }
    


      System.out.println("TAGG: " + tagg);
        System.out.println("CCAG: " + ccag);
        System.out.println("AGCC: " + agcc);
}
}