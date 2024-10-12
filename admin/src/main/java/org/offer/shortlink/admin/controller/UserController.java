package org.offer.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.offer.shortlink.admin.common.convention.result.Result;
import org.offer.shortlink.admin.common.convention.result.Results;
import org.offer.shortlink.admin.dto.resp.UserRespDTO;
import org.offer.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
* 用户管理控制层
 */

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("api/link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        return Results.success(result);
    }
}
