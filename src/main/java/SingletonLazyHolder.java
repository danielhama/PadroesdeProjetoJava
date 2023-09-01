public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static SingletonLazyHolder instancia;
    }
    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }

}
