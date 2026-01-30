import java.util.Scanner;

public class maxMin {

    public static void isMaxMin() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++)   // input 5 numbers
            arr[i] = sc.nextInt();

        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {    // find max and min
            if (arr[i] > max) max = arr[i];       // update max if it is greater
            if (arr[i] < min) min = arr[i];       // update min if it is smaller
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        
    }

    public static void main(String[] args) {
        isMaxMin();
    }
}



//output
//Input: {5 ,3, 8, 1, 4}
//Max = 8
//Min = 1