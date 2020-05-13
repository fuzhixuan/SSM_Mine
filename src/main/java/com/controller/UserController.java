package com.controller;

import com.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;
import java.util.Map;

/**
 * @author zxfuc
 * @Title:
 * @Package
 * @Description:
 * @date 2020/5/215:49
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserServiceImpl userService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    @ResponseBody
    public Map getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("hello", userService.getAll());
        mv.setViewName("hello");

        return mv;
    }
}
