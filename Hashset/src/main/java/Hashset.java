import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args)
    {
        HashSet<String> hashset = new HashSet();
        hashset.add("EUR");
        hashset.add("INR");
        hashset.add("AUD");

        Iterator<String> iterator = hashset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(" value : "+iterator.next());
        }
        if(hashset.contains("INR"))
        {
            System.out.println("INR is present");
        }
        hashset.remove("AUD");
        System.out.println("updated hashset");
        Iterator<String> iterator1 = hashset.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(" value1 : "+iterator1.next());
        }
    }
}