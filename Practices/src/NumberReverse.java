/*
Write a program to reverse a number using numeric operations. Below example shows how to reverse a number using numeric operations. - See more at: http://www.java2novice.com/java-interview-programs/reverse-number/#sthash.HW8UrHcQ.dpuf
 */
import java.util.Scanner;

public class NumberReverse {

    public int reverseNumber(int num)
    {
        int reverse = 0;
        while (num !=0) {
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args)
    {
        int valueToReverse = Integer.parseInt(new Scanner(System.in).nextLine());
        NumberReverse N = new NumberReverse();
        System.out.println(N.reverseNumber(valueToReverse));

    }
}
