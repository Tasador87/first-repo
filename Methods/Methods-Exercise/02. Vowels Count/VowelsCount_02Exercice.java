package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount_02Exercice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean isVowel(char symbol){

        switch (symbol){
            case 'a':
            case 'o':
            case 'u':
            case 'e':
            case 'i':
            case 'y':
                return true;
        }
        return false;
    }
}
