/**
 * 
 */
package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author leandro.fernandes
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@BancoTeste", 
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)
public class BancoTeste {

}
