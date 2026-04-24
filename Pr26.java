import java.io.*;

public class Pr26 {
    public static void main(String[] args) {
        int characters = 0, words = 0, lines = 0;

        try {
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] w = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    words += w.length;
                }
            }

            br.close();

            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Output:
java FileCount sample.txt
Characters: 56
Words: 10
Lines: 3
*/
