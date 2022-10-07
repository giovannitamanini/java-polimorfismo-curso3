public class TesteContas {

    public static void main(String[] args) {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200.0);

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
    }
}
