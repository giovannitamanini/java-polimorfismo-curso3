public class TesteReferencias {

    public static void main(String[] args) {

        /*Abaixo: Lado esquerdo representa uma referência de um tipo de classse genérico, Funcionario. Lado direito
        representa um objeto sendo instanciado pela classe filha Gerente. Isso é o polimorfismo!*/
        //Funcionario g1 = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f1 = new Funcionario();
        f1.setNome("Carlos");
        f1.setSalario(2000.0);

        EditorVideo ev1 = new EditorVideo();
        ev1.setNome("Maria");
        ev1.setSalario(2500.0);

        Designer d1 = new Designer();
        d1.setNome("Sofia");
        d1.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ev1);
        controle.registra(d1);

        System.out.println(controle.getSoma());
    }

}
