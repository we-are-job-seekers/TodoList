package com.friendo.backend.user.controller;

import com.friendo.backend.user.dto.ResponseItemDto;
import com.friendo.backend.user.model.Item;
import com.friendo.backend.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    /* API Test용
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam("empNo") String empNo, @RequestParam("year") int year) {
        log.info("empNo: {}", empNo);
        log.info("year: {}", year);
        return "ok";
    }

    @GetMapping("/company/{id}")
    public String getCompany(@PathVariable("id") String id) {
        log.info("id: {}", id);
        return "ok";
    }

    @PostMapping("/item")       //PostMapping은 Body를 보내줌
    public String registerItem(@RequestBody String item) {
        log.info("item: {}", item);

        return "ok";
    }

    @PostMapping("/itemInfo")       //PostMapping은 Body를 보내줌
    public ResponseItemDto registerItem(@RequestBody Item item) {

        log.info("item: {}", item);
        ResponseItemDto responseItemDto = new ResponseItemDto();
        responseItemDto.setMessage("ok");

        return responseItemDto;
    } */
}
