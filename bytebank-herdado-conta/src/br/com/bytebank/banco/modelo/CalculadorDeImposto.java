package bytebank.banco.modelo;

import org.jetbrains.annotations.NotNull;

//bytebank.banco.modelo.CalculadorDeImposto => FQN (full qualified name)
public class CalculadorDeImposto {
    private double totalImposto;

    public void registra(@NotNull Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
