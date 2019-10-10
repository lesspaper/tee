public class Exam1 {

    public static void main(String[] args) {
        
        int evenSum = 0;
        int oddSum = 0;

        for(int i=1; i<=100; i++) {
            if(i%2==0) {evenSum += i;}
            if(i%2!=0) {oddSum  += i;}
        }

        int diff = evenSum-oddSum;

        System.out.println("even sum = "+evenSum);
        System.out.println("odd sum  = "+oddSum);
        System.out.println("even - odd = "+diff);
    }

    
}