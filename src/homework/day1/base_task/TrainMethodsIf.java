package homework.day1.base_task;

public class TrainMethodsIf {

    public static int returnNewInt(int i){
        if (i < 8){
            i = i * 7;
            return i;
        } else {
            i = i/4;
            return i;
        }
    }
    //создать метод returnNewInt, который принимает на вход целое число (int)
    // и если оно меньше 8, то возвращает это число умноженное на 7, в противном случае деленное на 4

    public static long returnNewLong(long l){
        if(l>300){
            l=l-300;
            return l;
        }else{
            l = l + 20;
            return l;
        }
    }
    //создать метод returnNewLong, который принимает на вход целое число (long)
    // и если оно больше 300, то возвращает это число минус 300, в противном случае плюс 20


    public static String returnNewChar(char ch){
        if(ch == 'g'){
            return "go";
        } else {
            return "o" + ch;
        }
    }
    //создать метод returnNewChar, который принимает на вход символ (char) и если это 'g',
    // то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"


    public static float returnNewFloat(float fl){
        if(fl == 0.67){
            return fl;
        } else {
            return fl*2;
        }
    }
    //создать метод returnNewFloat, который принимает на вход дробное число (float) и если оно равно 0.67,
    // то возвращает это число, в противном случае число умноженное на 2

    public static double returnNewDouble(double db){
        if(db>30 && db<80){
            return db+87;
        } else if (db>80 && db<400) {
            return db-87;
        } else if (db>400) {
            return db/4;
        } else {
            return db;
        }
    }
    //создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30,
    // но меньше 80, то  возвращает это число плюс 87, если оно больше 80,
    // но меньше 400, то возвращает это число минус 87, а если оно больше 400,
    // то деленное на 4, в остальных случаях возвращает само число


    public static void returnNewBoolean(boolean tr){
        if(tr == true){
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
    //создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean)
    // и если оно true то печатает в консоль "Я получил на вход значение истины",
    // в противном случае печатает в консоль "Я получил на вход ложь"










}
