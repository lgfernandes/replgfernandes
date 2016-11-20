/**
 * 
 */
package cucumber.teste.passos;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.modelo.Banco;
import cucumber.modelo.Conta;

/**
 * @author leandro.fernandes
 *
 */
public class BancoTestePassos {
	private Banco banco;
    private int totalContas;
    private Double totalDinheiro;

    @Dado("^que as contas sao do \"(.*?)\"$")
    public void que_as_contas_sao_do(String nome, List<Conta> listaDeContas) throws Throwable {
          // Definição do banco e associando as contas
          banco = new Banco(nome, listaDeContas);

    }

    @Dado("^o calculo do total de contas criadas$")
    public void o_calculo_do_total_de_contas_criadas() throws Throwable {
          totalContas = banco.getListaDeContas().size();
    }

    @Entao("^o total de contas e (\\d+)$")
    public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
          assertEquals("O cálculo do total de contas está incorreto", totalContasEsperado, totalContas);
    }

    @Dado("^o calculo do total de dinheiro$")
    public void o_calculo_do_total_de_dinheiro() throws Throwable {
          totalDinheiro = banco.getListaDeContas().stream().mapToDouble(c -> c.getSaldo()).sum();
    }

    @Entao("^o total de dinheiro no banco e (\\d+)$")
    public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado) throws Throwable {

          assertEquals("O cálculo do total de dinheiro no banco " + banco.getNome() + " está incorreto", totalDinheiroEsperado, totalDinheiro);
    }
}
