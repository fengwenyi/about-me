package com.fengwenyi.about_me.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Erwin Feng
 * @since 2020/5/21
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
