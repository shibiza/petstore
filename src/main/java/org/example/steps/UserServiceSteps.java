package org.example.steps;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.example.entities.User;
import org.example.service.UserService;
import org.example.service.uritemplate.UserServiceUri;

@Slf4j
public class UserServiceSteps {
    private static final UserService USER_SERVICE = UserService.getInstance();

    public int createUser(User user) {
        log.info("Try to create user with userData: " + user);
        Response response = USER_SERVICE.postRequest(UserServiceUri.USER, "{\n" +
                "  \"id\":" + user.getId() + ",\n" +
                "  \"username\": \"" + user.getUsername() + "\",\n" +
                "  \"firstName\": \"" + user.getFirstName() + "\",\n" +
                "  \"lastName\": \"" + user.getLastName() + "\",\n" +
                "  \"email\": \"" + user.getEmail() + "\",\n" +
                "  \"password\": \"" + user.getPassword() + "\",\n" +
                "  \"phone\": \"" + user.getPhone() + "\",\n" +
                "  \"userStatus\": " + user.getUserStatus() + "\n" +
                "}");
        log.info("Status code after create user: " + response.getStatusCode());
        return response.getStatusCode();
    }

    public int findUserByUserName(String userName) {
        log.info("Try to find user with userName : " + userName);
        Response response = USER_SERVICE.getRequest(UserServiceUri.USER_BY_USERNAME ,userName);
        log.info("Status code after trying find user: " + response.getStatusCode());
        return response.getStatusCode();
    }
    public  int deleteUserByUserName(String userName){
        log.info("Try to delete user by username: " + userName );
        Response response =  USER_SERVICE.deleteRequest(UserServiceUri.DELETE_USER_BY_USER_NAME, userName);
        log.info("Status code after trying delete user by username : " + response.getStatusCode());
        return response.getStatusCode();
    }
}

