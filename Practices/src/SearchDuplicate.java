/*
Description:
You have got a range of numbers between 1 to N, where one of the number is
repeated. You need to write a program to find out the duplicate number.
- See more at: http://www.java2novice.com/java-interview-programs/duplicate-number/#sthash.Hsq9Xvcm.dpuf
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchDuplicate {

    public int getSum(List<Integer> Lst)
    {
        int sum = 0;
        for (int num: Lst)
            sum += num;
        return sum;
    }

    public int FindDuplicate(List<Integer> Lst)
    {
        return (getSum(Lst) - (Lst.size()-1)*Lst.size()/2);
    }

    public static void main(String[] args)
    {
        List<Integer> OneToN = new ArrayList<Integer>();
        for (int i=1; i<50; i++)
            OneToN.add(i);

        int inputValue;

        inputValue = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Got Value:" + inputValue);
        OneToN.add(inputValue);

        SearchDuplicate DuplicateValue = new SearchDuplicate();
        System.out.println(DuplicateValue.FindDuplicate(OneToN));
    }
}
