package midterm.ana_kurua_2.task4;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        Set<String> wordSet = new HashSet<>(fantasyFormatData);


        System.out.println("Set of all different words:");
        System.out.println(wordSet);


        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        
        System.out.println("\nMap of word lengths and their occurrences:");
        for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " word(s)");
        }
    }
}

