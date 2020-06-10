
package sumequalssum;

import java.util.Scanner;


public class SumEqualsSum {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        long allNums;
        // Save each number entered by user in nums[]
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
        }
       
        // Calculate sum
        for (int j : nums)
            sum += j;
        
        System.out.println(" ");
        System.out.println("Sum is: " + sum + "\t\t\tSimplified: "+ getSum(sum));
        System.out.println("Breakdown:");
        getBreakdown(sum);
        
        allNums = arrayToInt(nums);
        System.out.println(" ");
        System.out.println("All numbers: " + allNums 
                + "\t\tSimplified: " + getSum(allNums));
        System.out.println("Breakdown:");
        getBreakdown(allNums);
    }   
    
    private static int getSum(long n) {
        int sum = 0;
        while(n > 9 || n == 0){
            sum = 0;
            while(n > 0){
                sum += n% 10;
                n/=10;
            }
            n = sum; 
        }
    return sum;
}
    
    private static long arrayToInt(int[] arr)
{
    StringBuilder s = new StringBuilder(); 

    for (long i : arr)
    {
         s.append(i); //add all the digits to a string
    }
    return Long.parseLong(s.toString()); //parse long out of the string
}
    private static void getBreakdown (long n){
        long sum;
        long total = 0;
        while(n > 9 || n == 0){
            sum = n;
            total = 0;
            while(n > 0){
                total += n% 10;
                n/=10;
            }
            n = total;
            System.out.println("The sum of " + sum + " is " + total);
        }
    }
}

