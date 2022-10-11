package bytebank.banco.teste;

import bytebank.banco.modelo.Conta;
import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo insuficiente: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
