class Singleton{
    private Singleton(){}
    public String str;
    //private static final Singleton si = new Singleton();
    //static Singleton getSingleInstance(){
    //    return si;
    //}
    private static volatile Singleton si;
    static Singleton getSingleInstance(){
        if(si==null)
            synchronized (Singleton.class) {
                if(si==null) si = new Singleton();            
            }
        return si;
    }
}
