public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info = "inital instance value";

    private DoubleCheckedLockingSingleton()
    {}

    public static DoubleCheckedLockingSingleton getInstance()
    {
        if(instance == null)
        {
            synchronized (DoubleCheckedLockingSingleton.class)
            {
                if(instance == null)
                {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

}