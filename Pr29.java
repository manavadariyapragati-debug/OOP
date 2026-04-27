import java.util.*;

public class Pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(67);
        marks.add(90);
        marks.add(58);

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}

/*
Output:
Marks: [75, 82, 67, 90, 58]
Highest: 90
Lowest: 58
*/
