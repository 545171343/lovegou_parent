package io.itsource.lx.lovegou.controller;

import io.itsource.lx.lovegou.domain.Employee;
import io.itsource.lx.lovegou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
    if ("admin".equals(employee.getName())&&"0".equals(employee.getPassword())){
            return  AjaxResult.me();
         }
         return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确!");
    }
}
