import java.util.ArrayList;
import java.util.List;

public class CDM {
    // Function to perform CDM and recover station signals
    public static List<Integer> recoverSignals(List<List<Integer>> chipSequences, List<List<Integer>> transmissions) {
        List<Integer> recoveredSignals = new ArrayList<>();
        // Iterate over each transmission
        for (List<Integer> transmission : transmissions) {
            int sum = 0;
            // Calculate the sum of dot products for the transmission with each chip sequence
            for (int i = 0; i < chipSequences.size(); i++) {
                int dotProduct = calculateDotProduct(chipSequences.get(i), transmission);
                sum += dotProduct;
            }
            // Determine the recovered bit based on the sum
            int recoveredBit = (sum >= 0) ? 1 : 0;
            recoveredSignals.add(recoveredBit);
        }
        return recoveredSignals;
    }

    // Function to calculate the dot product of two lists
    public static int calculateDotProduct(List<Integer> sequence1, List<Integer> sequence2) {
        int dotProduct = 0;
        // Calculate the dot product by summing the product of corresponding elements
        for (int i = 0; i < sequence1.size(); i++) {
            dotProduct += sequence1.get(i) * sequence2.get(i);
        }
        return dotProduct;
    }

    public static void main(String[] args) {
        // Define chip sequences for four stations
        List<List<Integer>> chipSequences = new ArrayList<>();
        chipSequences.add(List.of(-1, 1, -1, 1, 1, 1, -1, -1)); // A
        chipSequences.add(List.of(-1, -1, 1, -1, 1, 1, 1, -1)); // B
        chipSequences.add(List.of(-1, 1, -1, 1, 1, 1, -1, -1)); // C
        chipSequences.add(List.of(-1, 1, -1, -1, -1, -1, 1, -1)); // D

        // Define transmissions
        List<List<Integer>> transmissions = new ArrayList<>();
        transmissions.add(List.of(-1, 1, -1, 1, 1, 1, -1, -1)); // S1
        transmissions.add(List.of(-2, 0, 0, 0, 2, 2, 0, -2)); // S2
        transmissions.add(List.of(0, 0, -2, 2, 0, -2, 0, 2)); // S3
        transmissions.add(List.of(1, 1, 3, 3, 1, -1, 1, -1)); // S4
        transmissions.add(List.of(-4, 0, -2, 0, 2, 0, -2, 2)); // S5
        transmissions.add(List.of(-2, -2, 0, -2, 0, -2, 4, 0)); // S6

        // Recover signals
        List<Integer> recoveredSignals = recoverSignals(chipSequences, transmissions);

        // Print the recovered signals
        System.out.println("Recovered Signals:");
        for (int signal : recoveredSignals) {
            System.out.print(signal + " ");
        }
    }
}
