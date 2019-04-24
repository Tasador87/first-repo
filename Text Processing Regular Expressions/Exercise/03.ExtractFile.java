package Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] arr = line.split("\\\\");
        String file = arr[arr.length - 1];

        String fileName = file.substring(0, file.lastIndexOf('.'));
        String fileExt = file.substring(file.lastIndexOf('.') + 1, file.length());
        // може и само с: (file.lastIndexOf('.') + 1) - така ще ни даде всичко от след точката до края.

        System.out.println(String.format("File name: %s\nFile extension: %s", fileName, fileExt));
    }
}
