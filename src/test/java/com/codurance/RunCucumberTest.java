package com.codurance;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format="html:target/cukes")
public class RunCucumberTest {
}
