package homework.day1.base_task;

public class TrainMethodsReturn {
    //создать метод returnNewInt, который принимает на вход целое число (int)
    // и возвращает это число умноженное на 3
    public int returnNewInt(int x){
        x = x * 3;
        return x;
    }

    //создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
    public long returnNewLong (long l){
        l = l - 4;
        return l;
    }

    //создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
    public char returnNewChar(char ch){
        return (char) (ch + ch);
    }

    //создать метод returnNewFloat, который принимает на вход дробное число (float)
    // и возвращает это число деленное на 2
    public float returnNewFloat(float f){
        f = f/2;
        return f;
    }

    //создать метод returnNewDouble, который принимает на вход дробное число (double)
    // и возвращает это число плюс 8
    public double returnNewDouble(double d){
        d = d + 8;
        return d;
    }

    //создать метод returnNewShort, который принимает на вход целое число (short)
    // и возвращает это число минус 1
    public short returnNewShort(short s){
        s = (short) (s-1); //арифметические действия  выполняются как int
        return s;
    }

    //создать метод returnNewByte, который принимает на вход целое число (byte) и
    // возвращает это число умноженное на 2
    public byte returnNewByte(byte b){
        b = (byte) (b*2);
        return b;
    }

    //создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и
    // возвращает обратное булево
    public boolean returnNewBoolean(boolean i){
        return !i;
    }




}



