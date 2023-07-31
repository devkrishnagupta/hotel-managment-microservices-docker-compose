package com.devkrishnagupta.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/userFallBack")
    public Mono<String> userServiceFallBack(){
        return Mono.just("User service is currently down, please wait...");
    }

    @RequestMapping("/hotelFallBack")
    public Mono<String> hotelServiceFallBack(){
        return Mono.just("Hotel service is currently down, please wait...");
    }

    @RequestMapping("/ratingFallBack")
    public Mono<String> ratingServiceFallBack(){
        return Mono.just("Rating service is currently down, please wait...");
    }
}
