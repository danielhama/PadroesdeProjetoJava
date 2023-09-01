package strategy;

public class ComportamentoAgressivoSingleton implements Comportamento{
    private static ComportamentoAgressivoSingleton instancia;

    private ComportamentoAgressivoSingleton (){}

    public static ComportamentoAgressivoSingleton getInstancia(){
        if (instancia == null){
            instancia = new ComportamentoAgressivoSingleton();
        }
        return instancia;
    }

    @Override
    public void mover() {
        System.out.println("Robô está se movendo agressivamente...");

    }
}
