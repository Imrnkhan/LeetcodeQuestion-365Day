package Zap;

import java.util.*;

public class CandidateSelection {

    public static String selectCandidates(int N, int K, int[] A) {
        // Create a list to store candidate information (ID and score)
        List<int[]> candidates = new ArrayList<>();

        // Populate the list with candidate IDs and their scores
        for (int i = 0; i < N; i++) {
            candidates.add(new int[]{i + 1, A[i]}); // ID is i+1, Score is A[i]
        }

        // Sort the candidates:
        // 1. By score in descending order
        // 2. By ID in descending order in case of a tie
        candidates.sort((a, b) -> {
            if (b[1] != a[1]) {
                return Integer.compare(b[1], a[1]); // Compare scores
            } else {
                return Integer.compare(b[0], a[0]); // Compare IDs
            }
        });

        // Collect the top K candidates' IDs
        StringBuilder demo = new StringBuilder();
        for (int i = 0; i < K; i++) {
            demo.append(candidates.get(i)[0]); // Append candidate ID
        }

        // Return the result as a string
        return demo.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Input: Scores of candidates
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Get the result and print
        String result = selectCandidates(N, K, A);
        System.out.println(result);

        scanner.close();
    }
}
