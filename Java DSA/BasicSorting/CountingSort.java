package BasicSorting;

public class CountingSort {
    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countinSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countinSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
}
