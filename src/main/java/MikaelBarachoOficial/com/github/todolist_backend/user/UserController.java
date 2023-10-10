package MikaelBarachoOficial.com.github.todolist_backend.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    

    /*
     * String
     * Integer
     * Double
     * Float
     * Char
     * Date
     * void
     * ...
     */

    @PostMapping("/post")
    // http://localhost:8080/users/post
    public void create(@RequestBody UserModel userModel) {
        System.out.println("name: " + userModel.getName() + " | username: " + userModel.getUserName()+ " | password: " + userModel.getPassword());
    }

}
