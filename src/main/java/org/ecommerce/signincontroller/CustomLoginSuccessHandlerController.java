package org.ecommerce.signincontroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.signincontroller.dto.*;
import org.ecommerce.security.handlers.CustomLoginSuccessHandler;

@RestController
@RequestMapping("/customLoginSuccessHandler")
public class CustomLoginSuccessHandlerController {
    @Autowired
    private CustomLoginSuccessHandler customLoginSuccessHandler;

    @PostMapping(value = "/onAuthenticationSuccess", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomLoginSuccessHandlerOnAuthenticationSuccessOutDTO> onAuthenticationSuccess(@RequestBody CustomLoginSuccessHandlerOnAuthenticationSuccessInDTO in) {
        CustomLoginSuccessHandlerOnAuthenticationSuccessOutDTO ret = new CustomLoginSuccessHandlerOnAuthenticationSuccessOutDTO();
        customLoginSuccessHandler.onAuthenticationSuccess(in.getRequest(), in.getResponse(), in.getAuthentication());
        return ResponseEntity.ok(ret);
    }

}