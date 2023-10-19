package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void setUp(Scenario scenario){
        System.out.println(scenario.getName());
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println(scenario.getStatus());
    }
}
