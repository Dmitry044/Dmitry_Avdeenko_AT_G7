package homework.day4.stringTask;

import static java.awt.SystemColor.text;

public class PrintLetters{
    public static void printLettersInColumn (String text){
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}


//сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста,
// которую принимает на вход в виде аргумента.
