package Immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;


public final class ImmutableClass {
    private final String name;                          //  String data type is immutable
private final Integer mobile;                               //  Integer data type is immutable
    private final Date registerationDate;                 // Date data type is mutable

    private final HashMap<String,String> hashMap;       // hashmap data type is mutable

    public ImmutableClass(String name, int mobile, Date registerationDate, HashMap<String, String> stringHashMap)
    {
        this.name = name;
        this.mobile = mobile;
        this.registerationDate = registerationDate;
        HashMap<String,String> tempMap = new HashMap<>();
        String key;
        Iterator<String> iterator = stringHashMap.keySet().iterator();
        //example of deep cloning by creating a temporary object
        while (iterator.hasNext())
        {
            key = iterator.next();
            tempMap.put(key,stringHashMap.get(key));
        }
        this.hashMap = tempMap;
    }

    public String getName() {
        return name;
    }

    public Integer getMobile() {
        return mobile;
    }

    public Date getRegisterationDate() {
        return (Date) registerationDate.clone();
    }

    public HashMap<String, String> getHashMap() {
        return (HashMap<String, String>) hashMap.clone();
    }
}
