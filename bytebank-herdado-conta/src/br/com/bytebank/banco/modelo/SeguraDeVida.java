package br.com.bytebank.banco.modelo;

public class SeguraDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
