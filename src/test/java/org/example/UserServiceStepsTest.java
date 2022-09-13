package org.example;

import org.example.entities.User;
import org.example.steps.UserServiceSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserServiceStepsTest {
    UserServiceSteps userServiceSteps = new UserServiceSteps();

    @BeforeMethod
    public void test() {
        int responceCode = userServiceSteps.createUser(new User().setId(1).
                setUsername("admin").
                setFirstName("vv").
                setLastName("vv").
                setEmail("dsd").
                setPassword("sad").
                setPhone("dsd").
                setUserStatus(0));
    }

    @org.testng.annotations.Test
    public void testCreateUser() {
        int responceCode = userServiceSteps.createUser(new User().setId(1).
                setUsername("admin").
                setFirstName("vv").
                setLastName("vv").
                setEmail("dsd").
                setPassword("sad").
                setPhone("dsd").
                setUserStatus(0));
        Assert.assertEquals(200, responceCode);
    }

    @org.testng.annotations.Test
    public void testFindUserByUserName() {
        int responceCode = userServiceSteps.findUserByUserName("admin");
        //   Assert.assertEquals(200, responceCode);
        Assert.assertEquals(200, responceCode);
    }

    @Test
    public void testDeleteUserByUserName() {
        int responceCode = userServiceSteps.deleteUserByUserName("admin");
        Assert.assertEquals(200, responceCode);
    }
}
