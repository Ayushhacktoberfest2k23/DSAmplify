import java.util.*;

public class GreedyAlgorithm {

    // Function to find the maximum number of activities that can be performed by a single person
    static void printMaxActivities(int start[], int finish[], int n) {
        int i, j;

        System.out.println("Following activities are selected:");

        // The first activity is always selected
        i = 0;
        System.out.print(i + " ");

        // Consider the rest of the activities
        for (j = 1; j < n; j++) {
            // If this activity has a start time greater than or equal to the finish time of the previously selected activity, then select it
            if (start[j] >= finish[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        printMaxActivities(start, finish, n);
    }
}
