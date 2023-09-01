package Singleton;

import strategy.*;

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

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstance();

        System.out.println(holder == holder1);

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento single = ComportamentoAgressivoSingleton.getInstancia();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();


        robo.setComportamento(single);
        robo.mover();


    }
}
