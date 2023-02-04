import Immutable.ImmutableClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;

public class DemoImmutability {
    public static void main(String[] args) {
//        Logger logger =LoggerFactory.getLogger(DemoImmutability.class);
        HashMap<String, String> favouriteSports = new HashMap<>();
        favouriteSports.put("BasketBall", "Outdoor");
        favouriteSports.put("Tennis", "Outdoor");
        favouriteSports.put("Chess", "Indoor");
        ImmutableClass immutable = new ImmutableClass("Sonal", 935457109, new Date("21/01/2023"), favouriteSports);
        System.out.println("name : " + immutable.getName());
        System.out.println("mobile : " + immutable.getMobile());
        System.out.println("registerationDate : " + immutable.getRegisterationDate());
        System.out.println("fav sports : " + immutable.getHashMap());

        favouriteSports.put("swimming", "Outdoor");
        // favouritesports map will not be updated due to deep copy
        System.out.println("updated fav sports : " + immutable.getHashMap());

    }
}


