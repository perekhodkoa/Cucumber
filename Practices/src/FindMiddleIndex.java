/*
Description:
        You are given an array of numbers. Find out the array index or position
        where sum of numbers preceeding the index is equals to sum of numbers
        succeeding the index.
        - See more at: http://www.java2novice.com/java-interview-programs/find-middle-index/#sthash.EpAtdO1T.dpuf
*/
public class FindMiddleIndex {

    public int findIndex(int[] numbers) throws Exception{
        int startIndex=0;
        int endIndex = numbers.length -1;
        int sumLeft =0;
        int sumRight =0;

        while(true) {
            if (sumLeft > sumRight){
            sumRight +=numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex)
            {
                if (sumLeft == sumRight)
                    return endIndex;
                else
                    throw new Exception("Please use appropriate array");
            }
        }

    }
    public static void main(String[] args) throws Exception
    {
        int[] a = {1,2,6,5,1};

        System.out.println("Index: "+new FindMiddleIndex().findIndex(a));

    }
}
