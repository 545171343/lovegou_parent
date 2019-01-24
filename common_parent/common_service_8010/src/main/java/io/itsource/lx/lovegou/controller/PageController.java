package io.itsource.lx.lovegou.controller;

import io.itsource.lx.lovegou.client.PageClient;
import io.itsource.lx.lovegou.utils.VelocityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PageController implements PageClient {

    @Override
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public void genStaticPage(@RequestBody  Map<String, Object> params) {
        Object model = params.get("model");
        String tmeplatPath = (String)params.get("tmeplatPath");
        String staticPagePath = (String)params.get("staticPagePath");
        System.out.println(model);
        System.out.println(tmeplatPath);
        System.out.println(staticPagePath);
        VelocityUtils.staticByTemplate(model, tmeplatPath, staticPagePath);
    }
}
