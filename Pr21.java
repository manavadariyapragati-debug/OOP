class VotingApp {
    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

public class Pr21 {
    public static void main(String[] args) {
        VotingApp v = new VotingApp();

        try {
            v.checkEligibility(20);
            v.checkEligibility(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}

/*
Output:
Eligible to vote
Exception: Age must be 18 or above to vote
Validation process completed
*/
