package com.letzautomate.tests;

import com.letzautomate.pages.application.Login;
import com.letzautomate.utilities.TestcaseManager;
import org.testng.annotations.Test;

public class Test001 extends TestcaseManager {

    @Test(groups={"regression", "TC001"})
    public void test001() throws InterruptedException {
     Login login = new Login();


      // login.login();
        setTestcaseName("Login Functionality");
       login.selectValue("Proximity of fine dining");
        //login
    }

}
