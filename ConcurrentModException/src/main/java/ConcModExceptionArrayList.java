import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcModExceptionArrayList {
    public static void main(String[] args) {
        List<String> phonelList = new ArrayList<>(Arrays.asList("Nokia", "Samsung", "Iphone", "Redmi","Realme"));
        System.out.println("list of phones : " + phonelList);
        for (String phone : phonelList) {
            // this will happen in single and multithreaded both scenarios
            // will give concurrent modification exception due to change in modlist as it break the Arraylist
            // contract of removing an element while iterating instead we can use an iterator that internally
            // check for any changes in Arraylist structure(size) using modlist
            //commenting out below code instead using iterator to remove
            //Though remove() method of java.util.Collection works fine to remove individual objects,
            // they don't work well when you are iterating over a collection.
            if (phone.contains("Iphone")) {
//                phonelList.remove(phone);
            }
        }

        for(Iterator<String> phoneIterator = phonelList.iterator(); phoneIterator.hasNext();)
        {
            String phoneModel = phoneIterator.next();
            System.out.println(" phone iterator values : "+phoneModel);
            if(phoneModel.contains("Iphone"))
            {
                // removes value successfully without any exception
                phoneIterator.remove();
            }
        }
        System.out.println("list of values after iteration : "+phonelList);
    }
}
