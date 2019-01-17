package cn.itsource.lx.lovegou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer_4396 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_4396.class);
    }
}
