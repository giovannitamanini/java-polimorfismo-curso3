package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Giovanni Tamanini
 */
public abstract class Conta {
    protected double saldo; //privacidade package private --> visível somente no pacote
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas aberto é: " + br.com.bytebank.banco.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Foi inicializada uma conta " + this.numero + " na agência " + this.agencia);
    }

    public abstract void deposita(double valor);


    /**
     * Valor precisa ser maior do que o saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
