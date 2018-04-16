package FirstClass;

public class ArraySum {
    public static double arraySum1(double[] nums){
        double sum = 0;
        for( double num: nums){
            sum = sum + num; //orsum +=num
                    }
        return (sum);
    }

    public static double arraySum2(double[] nums){
        double sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum =  sum + nums[i]; //ditambah [i] karena dia bukan for each. jadi urutan arraynya harus didefiisikan
        }
        return(sum);
    }

    public static double arraySum3(double[] nums){
        double sum = 0;
        int i = 0;

        while(i<nums.length){
            sum = sum + nums[i];
            i++;
        }
        return (sum);
    }

    public static double arraySum4(double[] nums) {
        double sum = 0;
        int i = 0;

        do {
            sum = sum + nums[i];
            i++;
        } while (i < nums.length);
            return(sum);
    }

    public static void main(String[] args){
        double[] numbers = {1.1, 2.2, 3.3};
        System.out.println("Use for each");
        System.out.println("[VI] Sum of {1.1, 2.2, 3.3}= " +arraySum1(numbers));
        System.out.println("");

        System.out.println("Use for loops");
        System.out.println("[V2] Sum of {1.1, 2.2, 3.3}= " +arraySum2(numbers));
        System.out.println("");

        System.out.println("Use while loops");
        System.out.println("[V3] Sum of {1.1 2.2, 3.3}= " +arraySum3(numbers));
        System.out.println("");

        System.out.println("use do while");
        System.out.println("[V4] Sum of {1.1 2.2, 3.3}= " +arraySum4(numbers));
        System.out.println("");
    }

}
