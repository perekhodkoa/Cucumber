
/**
 * Description:
 * Singleton class means you can create only one object for the given class.
 * You can create a singleton class by making its constructor as private,
 * so that you can restrict the creation of the object. Provide a static method to get instance of the object, wherein you can handle the object creation inside the class only. In this example we are creating object by using static block.
 * - See more at: http://www.java2novice.com/java-interview-programs/java-singleton/#sthash.sAJhO3rE.dpuf
 */

public class MySingleton {

    private static MySingleton myObj;
    private int a = 99;
    static{
        myObj = new MySingleton();
    }

    private MySingleton()
    {

    }

    public static MySingleton getInstance()
    {
        return myObj;
    }

    public void testMe(int n){
        for (int i = 0; i<n;i++) {
            a++;
            System.out.println("Works - " + a);
        }
    }

    public static void main(String[] args)
    {
        MySingleton newSingle = new MySingleton();
        newSingle.testMe(2);

        MySingleton newSingle1 = new MySingleton();
        newSingle1.testMe(2);

        MySingleton anotherSingle = MySingleton.getInstance();
        anotherSingle.testMe(3);

        MySingleton anotherSingle1 = MySingleton.getInstance();
        anotherSingle1.testMe(3);

        System.out.print(((11 & 9)^3)|12);

    }
}
