package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        stepNotifications = true,
        publish = true,
        features = {"src/main/resources/features"},
        glue = {"stepsDefinitions", "framework"}, // Agrega el paquete de los hooks y framework
        tags =  "@PRUEBA2"
)
public class TestRunner {
}

