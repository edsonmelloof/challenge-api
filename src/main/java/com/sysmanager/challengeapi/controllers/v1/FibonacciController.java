package com.sysmanager.challengeapi.controllers.v1;

import com.sysmanager.challengeapi.services.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/fibonacci")
public class FibonacciController {

    @Autowired
    FibonacciService fibonacciService;

    @GetMapping(value = "/{size}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getSequenceFibonacci(@PathVariable("size") int size) {
        if(size > 5000)
            return new ResponseEntity<>("O número máximo de repetições é de 5000", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(fibonacciService.getSequenceFibonacci(size), HttpStatus.OK);
    }

}
