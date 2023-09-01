public class Main {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstancia();

        System.out.println(lazy);
        SingletonLazy lazy1 = SingletonLazy.getInstancia();

        System.out.println(lazy1);

        System.out.println(lazy == lazy1);

        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager eager1 = SingletonEager.getInstance();

        System.out.println("A instância eager é igual a eager1?: " + (eager==eager1));

    }
}
