package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5]; // Nesta linha é criada uma Array que pode guardar 5 referências do tipo Conta Corrente

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(cc2.getNumero());

        /*Object referenciaGenerica = contas[1];

        System.out.println(contas[1].getNumero());*/
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //Type Cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
