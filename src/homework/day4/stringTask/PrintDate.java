package homework.day4.stringTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintDate {
    public static void main(String[] args) {
        printCurrentDateTime();
    }

    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Сейчас на дворе:' d MMMM, yyyy, H 'часов' m 'минут'", new Locale("ru"));
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }
}
