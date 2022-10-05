// Gerente é um funcionário, Gerente herda da classe Funcionario e  assina contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente!");
        return super.getSalario(); /*Super significa que os métodos estão definidos na classe mãe*/
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
