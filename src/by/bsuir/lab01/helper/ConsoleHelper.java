package by.bsuir.lab01.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Антон on 26.10.2015.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void write(String text) {
        System.out.println(text);
    }

    public static String read()  {
        try {
            String text = reader.readLine();
            return text;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static int readInt() {
        String text = read();
        return Integer.parseInt(text.trim());
    }
}
