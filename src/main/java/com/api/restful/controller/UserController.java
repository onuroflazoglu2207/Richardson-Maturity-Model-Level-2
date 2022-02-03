package com.api.restful.controller;

import com.api.restful.model.UserModel;
import com.api.restful.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/getAll")
    public List<UserModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/getById/{identity}")
    public UserModel getById(@PathVariable Long identity) {
        return service.getById(identity);
    }

    @PutMapping("/save")
    public UserModel save(@RequestBody UserModel model) {
        return service.save(model);
    }

    @PutMapping("/update/{identity}")
    public UserModel update(@PathVariable Long identity, @RequestBody UserModel model) {
        return service.update(identity, model);
    }

    @DeleteMapping("/delete/{identity}")
    public UserModel delete(@PathVariable Long identity) {
        return service.delete(identity);
    }
}
