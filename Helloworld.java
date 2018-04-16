package FirstClass;

public class Helloworld {

    public static void listEntries (String[] entries){ //this is example 'for each'
        for (String entry: entries){
            System.out.println(entry);
        }

    }

    public static void listNums1(int max){ //this is example 'for loops'
        for(int i=0; i<max; i++){
            System.out.println("Number : " +i);
        }
    }

    public static void listNums2(int max){ //while
        int i = 0;
        while (i<max){
            System.out.println("Number : " +i);
            i++;
        }
    }

    public static void listNums3(int max){
        int i = 0;
        do{
            System.out.println("Number : " +i);
            i++;
        } while (i<max);
    }

    public static void main(String[] args){
        double result = 3.1 + 2.4; //addition

        System.out.println("");
        System.out.println("for each result");
        String[] test = {"This ","is","a","test"};//for each
        listEntries(test);

        System.out.println("");
        System.out.println("for loops result"); //for loops
        listNums1(4);

        System.out.println("");
        System.out.println("for while loops"); //while
        listNums2(5);

        System.out.println("");
        System.out.println("for do loops"); //do
        listNums3(6);

        String Str1 = new String("learn java string length 1"); //string length
        String Str2 = new String("Learn java String length 2");

        System.out.println("");
        System.out.println("this is result from addition on result");
        System.out.println(result);
        System.out.println("");

        System.out.println("");
        System.out.println("Hello this is my first class (using package)");

        System.out.println("");
        System.out.println("And" + " here" + " im using" + " addition for text");

        System.out.println("");
        System.out.println("This number " +10 + " Add by addition");

        System.out.println("");
        System.out.println("learn string length");
        System.out.println("String length one: ");
        System.out.println(Str1.length());
        System.out.println("");

        System.out.println("String length two: ");
        System.out.println(Str2.length());

        System.out.println("");

    }
}
