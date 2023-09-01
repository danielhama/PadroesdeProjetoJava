package facade;

import subsistema.cep.CepApi;
import subsustema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarcliente(nome, cep, cidade, estado);

    }

}
