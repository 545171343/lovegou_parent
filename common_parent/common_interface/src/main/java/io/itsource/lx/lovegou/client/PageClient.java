package io.itsource.lx.lovegou.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "LOVEGOU-COMMON",fallbackFactory = PageClientFallbackFactory.class )
public interface PageClient {
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    void genStaticPage(@RequestBody Map<String,Object> params);
}
