/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package poepart.pkg2;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Student
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String name = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(name, password);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(loginStatus);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
