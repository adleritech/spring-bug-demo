package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@Controller
public class AsyncController {


    @RequestMapping("/bytes")
    public CompletableFuture<ResponseEntity<byte[]>> getBytes() {
        return CompletableFuture.completedFuture(ResponseEntity.ok("hi".getBytes()));
    }

}
