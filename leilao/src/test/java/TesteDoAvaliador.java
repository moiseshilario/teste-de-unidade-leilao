import org.junit.Assert;
import org.junit.Test;

import br.ufg.inf.leilao.dominio.Lance;
import br.ufg.inf.leilao.dominio.Leilao;
import br.ufg.inf.leilao.dominio.Usuario;
import br.ufg.inf.leilao.servico.Avaliador;

public class TesteDoAvaliador {

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Usuario joao = new Usuario("Samuel");
		Usuario jose = new Usuario("Moises");
		Usuario maria = new Usuario("Leo");
		
		Leilao leilao = new Leilao("PS4");
		
		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250;
		
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(),0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(),0.00001);
		
		
	}
}
