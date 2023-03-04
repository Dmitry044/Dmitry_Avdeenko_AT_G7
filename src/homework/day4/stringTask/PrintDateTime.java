package homework.day4.stringTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintDateTime {

    public static void main(String[] args) {
        String input = "22.00 07.09.2020";
        printFormattedDateTime(input);
    }
    public static void printFormattedDateTime(String dateTimeString){
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        String formattedDateTime = dateTime.format(outputFormatter);
        System.out.println(formattedDateTime);
    }
}

//написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
// и выводит в консоль в формате "September, 7, 2020 22:00"