package io.arukas.controller.api;

import io.arukas.entity.User;
import io.arukas.utils.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 20/06/2017.
 */
@RestController(value = "api-user")
@RequestMapping(value = "/api")
public class UserController {

    @GetMapping(value = "/users", produces="application/json;charset=UTF-8")
    public String users(){
        User u1 = new User("张三", "李四");
        User u2 = new User("张三", "李四");
        User u3 = new User("张三", "李四");
        User u4 = new User("张三", "李四");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        return JsonResult.fillResultString(100, "成功", users);
    }

}
