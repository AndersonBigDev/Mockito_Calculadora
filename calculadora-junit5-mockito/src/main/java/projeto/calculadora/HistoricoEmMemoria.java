package projeto.calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação simples do histórico, usada apenas pela classe App.
 */
public class HistoricoEmMemoria implements HistoricoOperacoes {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void registrar(String operacao, double resultado) {
        registros.add(operacao + " = " + resultado);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
