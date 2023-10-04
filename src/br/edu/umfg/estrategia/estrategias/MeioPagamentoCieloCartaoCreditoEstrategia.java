package br.edu.umfg.estrategia.estrategias;

import br.edu.umfg.estrategia.interfaces.MeioPagamentoCieloCartaoCredito;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;


public class MeioPagamentoCieloCartaoCreditoEstrategia  extends MeioPagamentoCieloEstrategia implements MeioPagamentoCieloCartaoCredito {
    public MeioPagamentoCieloCartaoCreditoEstrategia(
            String numeroCartao,
            String cpf,
            String cvv,
            String dataValidade) {
        super(numeroCartao, cpf, cvv, dataValidade);
    }

    @Override
    public void pagar(Double valor) {
        System.out.println("Pagamento via Cartão de crédito Cielo no valor " +
                valor + ", realizado com sucesso");

        validarCpf(getCpf());
        validarNumCartao(getNumeroCartao());
        validarCVV(getCvv());
        validarDataValidade(getDataValidade());
    }
    @Override
    public void validarCVV(String cvv){
        if(cvv.length() > 3 || cvv.length() < 3){
            System.out.println("CVV precisa ter apenas três digitos!");
            System. exit(0);
        }
    }
    @Override
    public void validarCpf(String cpf){

    }
    @Override
    public void validarNumCartao(String num){

    }
    @Override
    public void validarDataValidade(String data){
        String dataFormato = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern(dataFormato)
                .withResolverStyle(ResolverStyle.STRICT);

        LocalDate dataValidade = LocalDate.parse(data, dateTimeFormatter);

        Date dataAtual = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataAtual);

        if(dataValidade.getYear() < calendario.get(Calendar.YEAR)){
            System.out.println("A data de validade precisa ser maior do que a data de hoje.");
            System. exit(0);
        }
        int mesAtual = calendario.get(Calendar.MONTH + 1);

        if(dataValidade.getYear() == calendario.get(Calendar.YEAR)){
            if(dataValidade.getMonth().getValue() < mesAtual){
                System.out.println("A data de validade precisa ser maior do que a data de hoje.");
                System. exit(0);
            }
        }
    }
}


