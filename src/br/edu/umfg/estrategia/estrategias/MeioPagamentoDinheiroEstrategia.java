package br.edu.umfg.estrategia.estrategias;

import br.edu.umfg.estrategia.interfaces.MeioPagamentoEstrategia;

public class MeioPagamentoDinheiroEstrategia implements MeioPagamentoEstrategia {
    @Override
    public void pagar(Double valor) {
        System.out.println("Pagamento via Dinheiro no valor " +
                valor + ", realizado com sucesso");
    }
}
