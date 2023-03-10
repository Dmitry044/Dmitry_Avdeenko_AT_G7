package homework.day4.stringTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class PrintDuplicate {

    public static void printDuplicateWords(String text){
        text = text.toLowerCase();
        String[] words = text.split(" "); //разбил на слова

        HashMap<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            if (wordFreq.containsKey(word)) {
                wordFreq.put(word, wordFreq.get(word) + 1);
            } else {
                wordFreq.put(word, 1);
            }
        }
        for (String word : wordFreq.keySet()) {
            if (wordFreq.get(word) > 1) {
                System.out.println(word);
            }
        }
    }
    public static void printDuplicateWords2(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");

    }
    public static Set<String> findDuplicatedUsingEqualsMethod(String text) {

        text = text.toLowerCase();
        String[] words = text.split(" ");
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1 ; j < words.length; j++) {
                if (words[i].equals(words[j])) { // got the duplicate element
                    duplicates.add(words[i]);
                } } }

        return duplicates;
    }
    }


//сделать метод, который позволяет найти и вывести в консоль все дубликаты слов
// в строке текста, который принимает на вход в виде аргумента.
