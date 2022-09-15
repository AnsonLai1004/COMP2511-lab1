package scrabble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Scrabble {
    private String word;
    public Scrabble(String word) {
        this.word = word;
    };
    private List<String> dictionary = new ArrayList<String>(Arrays.asList("ab", "abe", "able", "ad", "ae", "ae",
            "ah", "al", "ale", "at", "ate", "ba", "bad", "be", "be", "bead", "bed", "bra", "brad", "bread", "bred",
            "cabble", "cable", "ea", "ea", "eat", "eater", "ed", "ha", "hah", "hat", "hate", "hater", "hath", "he",
            "heat", "heater", "heath", "heather", "heathery", "het", "in", "io", "ion", "li", "lin", "lion", "on",
            "program", "ra", "rad", "re", "rea", "read", "red", "sa", "sat", "scabble", "scrabble", "se", "sea", "seat",
            "seathe", "set", "seth", "sh", "sha", "shat", "she", "shea", "sheat", "sheath", "sheathe", "sheather",
            "sheathery", "sheth", "st", "te"));
    

    private Set<String> set = new HashSet<String>();
    public int score() {
        subStrSet(word);
        return set.size();
    }
    public void subStrSet(String str) {
        if (str.length() < 2) {
            return;
        }
        if (dictionary.contains(str)) {
            set.add(str);
            for (int i = 0; i < str.length(); i++) {
                StringBuffer sbf = new StringBuffer(str);
                sbf.deleteCharAt(i);
                subStrSet(sbf.toString());
            }
        } 
    }
    /*
    public static void main(String[] args) {
        Scrabble s = new Scrabble("lion");
        System.out.println(s.score());
    }
    */
}
/* 
lion
ion lin 
on io in li in */
/*
 * scrabble 
 * crabble srabble scabble scrbble scrable scrable scrabbe scrabbl -> scabble 
 * cabble sabble scbble scable scable scabbe scabbl -> cabble
 * abble cbble cable cable cabbe cabbl -> cable cable 
 * able cble cale cabe cabl -> able  
 * ble ale abe abl -> ale abe 
 * le ae al, be ae ab -> ae al be ae ab 
 */
