package Strings;

public class PrintDups {
    public static void main(String args[]) {
        String s = "test string";
        printDuplicates(s);
    }

    public static void printDuplicates(String s) {
        int count[] = new int[256];
        fillCharArray(count, s);
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ", counts=" + count[i]);
            }
        }
    }

    public static void fillCharArray(int count[], String s) {
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i)]++;
        }
    }
}
