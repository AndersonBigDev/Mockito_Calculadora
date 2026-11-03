package projeto.calculadora;

/**
 * Dependência externa: registra as operações realizadas.
 * Em um sistema real poderia gravar em banco de dados, arquivo ou API.
 */
public interface HistoricoOperacoes {

    void registrar(String operacao, double resultado);
}
