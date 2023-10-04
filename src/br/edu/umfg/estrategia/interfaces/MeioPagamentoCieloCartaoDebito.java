package br.edu.umfg.estrategia.interfaces;

public interface MeioPagamentoCieloCartaoDebito {
    void validarCpf(String cpf);
    void validarCVV(String cvv);
    void validarDataValidade(String data);
    void validarNumCartao(String numero);
}
