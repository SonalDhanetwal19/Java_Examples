public enum EnumSingleton {
    INSTANCE("inital instance value - Enum Singleton"); //name of the singleton instance - default initalized

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;

    EnumSingleton(String info)
    {
        this.info=info;
    }

    public EnumSingleton getInstance()
    {
        return INSTANCE;
    }

}
