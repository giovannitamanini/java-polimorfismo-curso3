// Contrato Autenticável
    // Quem assina esse contrato precisa implementar:
        //método setSenha
        //método autentica
public abstract interface Autenticavel { /*Não precisaria colocar o abstract*/

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
