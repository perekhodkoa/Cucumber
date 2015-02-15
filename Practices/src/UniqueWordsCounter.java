/**
 * Description:
 * Write a program to read words from a file. Count the
 * repeated or duplicated words. Sort it by maximum repeated or
 * duplicated word count.
 * - See more at: http://www.java2novice.com/java-interview-programs/max-repeated-words-file/#sthash.94SM8UKz.dpuf
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class UniqueWordsCounter {

    public HashMap getWordsMap(String fileName) {
        HashMap<String,Integer> quantity = new HashMap<String, Integer>();
        FileReader myText;
        String S;
        BufferedReader B;

        try {
            myText = new FileReader(fileName);
            B = new BufferedReader(myText);
            while ((S = B.readLine()) != null)
            {
                String[] C = S.split("\\W+");
                for (int i = 0; i < C.length - 1; i++)
                    if (quantity.containsKey(C[i]))
                        quantity.put(C[i], quantity.get(C[i]) + 1);
                    else
                        quantity.put(C[i], 1);
            }
            B.close();
            myText.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found: "+fileName);
        }
        catch (IOException e)
        {
            System.out.println("Got IO Exception during file read operation with file:" + fileName);
        }
        return quantity;

    }

    public List<Entry<String,Integer>> sortByValue(HashMap<String,Integer> quantity)
    {
      Set<Entry<String,Integer>> set = quantity.entrySet();
        List<Entry<String,Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        return list;
    }

    public static void main(String[] args)
    {
        UniqueWordsCounter uwc = new UniqueWordsCounter();
        List<Entry<String,Integer>> l = uwc.sortByValue(uwc.getWordsMap("/Users/sentinel/git/Practices/src/NumberReverse.java"));
        for (Entry<String,Integer> c :l)
        System.out.println(c.getKey() + " === " + c.getValue());
    }
}
