import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UniqueWordsCounter {

    public HashMap getWordsMap(String fileName) {
        HashMap<String,Integer> Quantity = new HashMap<String, Integer>();

        try {
            FileReader myText = new FileReader(fileName);
            BufferedReader B = new BufferedReader(myText);
            String S;
            while ((S = B.readLine()) != null)
            {
                String[] C = S.split("\\W+");
                for (int i = 0; i < C.length - 1; i++)
                    if (Quantity.containsKey(C[i]))
                        Quantity.put(C[i], Quantity.get(C[i]) + 1);
                    else
                        Quantity.put(C[i], 1);
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("File not found: "+fileName);
        }
        catch (IOException e)
        {
            System.out.println("Got IO Exception during file read operation with file:" + fileName);
        }
        return Quantity;

    }

    public static void main(String[] args)
    {
        UniqueWordsCounter uwc = new UniqueWordsCounter();
        System.out.println(uwc.getWordsMap("/Users/sentinel/git/Practices/src/NumberReverse.java"));
    }
}
