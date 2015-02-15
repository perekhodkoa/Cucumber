/**
 * Description:
 * Write a program to find top two maximum numbers in the
 * given array. You should not use any sorting functions. You
 * should iterate the array only once. You should not use any
 * kind of collections in java.
 * - See more at: http://www.java2novice.com/java-interview-programs/two-max-numbers-in-array/#sthash.5OFvE1iJ.dpuf
 */
public class TwoMaxNumbers {

    public void printTwoMax(int[] numbers)
    {
        int firstMax = 0;
        int secondMax = 0;

        for (int i:numbers)
        {
            if (i > firstMax) {
                secondMax = firstMax;
                firstMax = i;
            }
            else if (i>secondMax)
                secondMax = i;

        }
        System.out.println(firstMax+","+secondMax);
    }

    public static void main(String[] args)
    {
        int[] a = {2,5,9,55,45,3,8};
        TwoMaxNumbers twm = new TwoMaxNumbers();
        twm.printTwoMax(a);
    }
}
