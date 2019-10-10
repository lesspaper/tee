import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] inputs = new int[5];
        System.out.println("Enter 1st number : ");
        inputs[0] = s.nextInt();
        System.out.println("Enter 2nd number : ");
        inputs[1] = s.nextInt();
        System.out.println("Enter 3rd number : ");
        inputs[2] = s.nextInt();
        System.out.println("Enter 4th number : ");
        inputs[3] = s.nextInt();
        System.out.println("Enter 5th number : ");
        inputs[4] = s.nextInt();

        System.out.println("");
        System.out.println("Your inputs are ");
        for (int i : inputs) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("");
        
        showStat(inputs);
    }

    public static int findMax(int[] inputs) {
        int max = inputs[0];
        for (int i : inputs) {
            if(max < i) max = i;
        }
        return max;
    }
    public static int findMin(int[] inputs) {
        int min = inputs[0];
        for (int i : inputs) {
            if(min > i) min = i;
        }
        return min;
    }
    public static int sumNum(int[] inputs) {
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;
    }
    public static int average(int[] inputs) {
        int sum = sumNum(inputs);
        int avg = sum/inputs.length;
        return avg;
    }
    public static void showStat(int[] inputs) {
        System.out.println("== stat ==");
        System.out.println("max = "+findMax(inputs));
        System.out.println("min = "+findMin(inputs));
        System.out.println("sum = "+sumNum(inputs));
        System.out.println("avg = "+average(inputs));
    }
}