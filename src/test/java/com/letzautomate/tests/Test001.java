package com.letzautomate.tests;

import com.letzautomate.pages.application.Login;
import com.letzautomate.utilities.TestcaseManager;
import org.testng.annotations.Test;

public class Test001 extends TestcaseManager {

    @Test(groups={"regression", "TC001"})
    public void test001() throws InterruptedException {
     Login login = new Login();

        setTestcaseName("Login Functionality");

       login.login();

       //login.selectValue("Proximity of fine dining");
        //login
    }

}
