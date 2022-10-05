public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador a = new Administrador();
        a.setSenha(333);

        Cliente c = new Cliente();
        c.setSenha(444);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(a);
        si.autentica(c);
    }
}
