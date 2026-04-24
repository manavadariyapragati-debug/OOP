import java.io.*;

public class Pr28 {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    words += w.length;
                }

                characters += line.replaceAll("\\s", "").length();
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Output:
Lines: 3
Words: 9
Characters: 45
*/
