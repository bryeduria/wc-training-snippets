package com.whitecloak.training.inventory.service;

import com.whitecloak.training.inventory.controller.response.UserResource;

public interface UserService {
    UserResource create(String name);
}
