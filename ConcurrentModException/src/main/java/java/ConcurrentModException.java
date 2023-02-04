//package java;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//
//public class ConcurrentModException {
//    public static void main(String[] args)
//    {
//        List<String> phonelList = new ArrayList<>(Arrays.asList("Nokia","Samsung","Iphone","Redmi"));
//        System.out.println("list of phones : "+phonelList);
//        for(String phone: phonelList)
//        {
//            System.out.println(" phone : "+ phone);
//            // will give concurrent modification exception due to change in modlist as it break the Arraylist
//            // contract of removing an element while iterating instead we can use an iterator that internally
//            // check for any changes in Arraylist structure(size) using modlist
//            if(phone.startsWith("IPh"))
//            phonelList.remove("IPhone");
//        }
//
////        Iterator<String> iterator = phonelList.iterator()
//
//
//    }
//}
