package me.ghisiluizgustavo.query_by_example.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public List<User> findAllUsersByExample(@RequestBody User user){
        return userService.findUserByExample(user);
    }

}
