package org.ecommerce.signincontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"META-INF/rr/**/*.xml"})
public class SigninControllerApp {
    public static void main(String[] args)
    {
      SpringApplication.run(SigninControllerApp.class, args);
    }
}