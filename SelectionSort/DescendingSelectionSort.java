import java.util.Scanner;

public class DescendingSelectionSort {
    public static void descendingSelectionSort(int[] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; ++i) {
            int largestNum = numbers[i];
            int largestIndex = i;

            for (int j = i + 1; j < numElements; ++j) {
                if (numbers[j] > largestNum) {
                    largestNum = numbers[j];
                    largestIndex = j;
                }
            }
            numbers[largestIndex] = numbers[i];
            numbers[i] = largestNum;

            StringBuilder tmp = new StringBuilder();
            for (int item : numbers) {
                if (item != 0)
                    tmp.append(item + " ");
            }
            System.out.println(tmp.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int [] numbers = new int[10];
        int numElements = 0;

        for (int i = 0; i < numbers.length + 1; ++i) {
            int tmp = scnr.nextInt();
            if (tmp > -1) {
                numbers[i] = tmp;
                numElements++;
            } else
                break;
        }
        descendingSelectionSort(numbers, numElements);
    }
}

