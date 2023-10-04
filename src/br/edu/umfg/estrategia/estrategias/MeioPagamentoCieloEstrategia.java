package br.edu.umfg.estrategia.estrategias;

import br.edu.umfg.estrategia.interfaces.MeioPagamentoEstrategia;

public class MeioPagamentoCieloEstrategia implements
        MeioPagamentoEstrategia {

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    private String numeroCartao;
    private String cpf;
    private String cvv;
    private String dataValidade;

    public MeioPagamentoCieloEstrategia(
            String numeroCartao,
            String cpf, String cvv,
            String dataValidade) {

        this.numeroCartao = numeroCartao;
        this.cpf = cpf;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public void pagar(Double valor) {
        System.out.printf("Pagamento via Cielo no valor," +
                valor + ", realizado com sucesso \n");
    }
}
