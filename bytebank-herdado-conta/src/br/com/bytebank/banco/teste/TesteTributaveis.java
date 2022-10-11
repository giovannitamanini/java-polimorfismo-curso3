package bytebank.banco.teste;

import bytebank.banco.modelo.CalculadorDeImposto;
import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.SeguraDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguraDeVida seguro = new SeguraDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
