package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

 //br.com.bytebank.banco.teste.TesteContas
public class TesteContas {

    //java.lang.String
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente outra = null;
        outra.deposita(200.0);

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        ContaEspecial especial = new ContaEspecial(333, 333);

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
    }
}
