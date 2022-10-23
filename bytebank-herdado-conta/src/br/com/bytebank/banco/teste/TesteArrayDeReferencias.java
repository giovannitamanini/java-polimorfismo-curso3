package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5]; // Nesta linha é criada uma Array que pode guardar 5 referências do tipo Conta Corrente

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];

        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

        int[] refs = {1, 2 ,3 , 4, 5};

        for(int i = 0; i < refs.length; i++) {
            System.out.println(refs[i]);
        }
    }
}
