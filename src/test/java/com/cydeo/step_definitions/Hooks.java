package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
   /*
   in this class we will be able to pass pre and post condition to each scenario and  each step
    */
   //import from io.cucumber.java
//    @Before
//public void setupScenario(){
//        System.out.println("seting up browser using @Before");
//}
//    @Before("@LOGIN")
//    public void setupScenariolOGIN(){
//        System.out.println("seting up browser using @Before");
//    }
@After
    public void tearDownScenatio(Scenario scenario){
        //if scenario failes will return true boolean value
if(scenario.isFailed()){
    byte [] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot,"image/png", scenario.getName());
}

    Driver.closeDriver();
  //  System.out.println("closing browser using @After");
   // System.out.println("Scenario ended take screenshot if Scenario failed");
}

@BeforeStep
public void setUpStep(){
//    //System.out.println("------applying setup using setup--------");
   BrowserUtils.sleep(1);
}
//
//@AfterStep
//public void afterStep() {
//    System.out.println("------APPLYING TEARDOWN USING AFTERSTEP------");
//}
}
