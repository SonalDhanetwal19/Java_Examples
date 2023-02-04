public class SingletonExample {
    public static void main(String [] args)
    {
        //Example of DoubleCheckedLockingSingleton instance
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(doubleCheckedLockingSingleton.getInfo());
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        doubleCheckedLockingSingleton1.setInfo("updated value for singleton instance - DoubleCheckedLockingSingleton");
        System.out.println(doubleCheckedLockingSingleton.getInfo());
        System.out.println(doubleCheckedLockingSingleton1.getInfo());

        //Example of EnumSingleton instance
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton.getInfo());
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton1.setInfo("updated value for singleton instance - EnumSingleton");
        System.out.println(enumSingleton.getInfo());
        System.out.println(enumSingleton1.getInfo());
    }
}
