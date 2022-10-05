// Gerente é um funcionário, Gerente herda da classe Funcionario
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente!");
        return super.getSalario(); /*Super significa que os métodos estão definidos na classe mãe*/
    }

}
