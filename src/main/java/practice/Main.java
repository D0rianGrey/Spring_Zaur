package practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/test1.txt"));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/main/resources/test2.txt"));

        String s;
        while ((s = fileReader.readLine()) != null) {
            fileWriter.write(s);
        }

//        int i;
//        while ((i = fileReader.read()) != -1) {
//            fileWriter.write(i);
//        }

        fileReader.close();
        fileWriter.close();
    }
}


