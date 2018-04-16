package FirstClass;

public class LoopTest {

    public static void listEntries(String[] entries) {
        for (String entry : entries) {
            System.out.println(entry);
        }
    }

    public static void listNums1(int[] max) {
        for (int i = 0; i < max.length; i++) {
            System.out.println("Number using for loops = " + i);
            System.out.println("");
        }
    }

    public static void listNums2(int[] max) {
        int i = 0;
        while (i < max.length) {
            System.out.println("Number using while loops = " + i);
            System.out.println("");
        }
    }

    public static void listNums3(int[] max) {
        int i = 0;
        do {
            System.out.println("Number using for loops = " + i);
            System.out.println("");
            i++;
        } while (i < max.length);
    }

public static void main(String[] args){
    String[] test = {"This ", "Is ", "a ", "Test"};
    listNums1(5);
    listNums2(6);
    listNums3(7);
}