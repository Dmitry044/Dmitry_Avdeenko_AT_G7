package classwork.day6.reader;

import java.io.*;

public class MyReadWriter {
    public static void read() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line=in.readLine())!=null){
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("Мама мыла раму");
        out.close();
    }
    public static void copyText(String fileFrom, String fileTo) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(fileFrom));
        BufferedWriter out = new BufferedWriter(new FileWriter(fileTo));

        String line;
        while ((line = in.readLine()) != null){
            out.append(line);
            out.newLine();
        }
        in.close();
        out.close();
    }
    public static void copyText2(String fileFrom, String fileTo) throws Exception{
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileFrom));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileTo));

        byte[] line = in.readAllBytes();
        out.write(line);

        in.close();
        out.close();
    }
}
