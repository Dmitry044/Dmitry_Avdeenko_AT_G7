package homework.day4.stringTask;

import java.util.HashMap;
import java.util.Locale;

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
}

//сделать метод, который позволяет найти и вывести в консоль все дубликаты слов
// в строке текста, который принимает на вход в виде аргумента.
