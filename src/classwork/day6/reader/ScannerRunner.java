package classwork.day6.reader;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incomming = scanner.nextLine();
            /*if (incomming == "stop") {
                break;
            }*/
            System.out.printf("Just got '%s' text!", incomming);
        }

    }
}