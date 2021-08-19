package com.sysmanager.challengeapi.controllers.v1;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.services.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/prime-number")
public class PrimeNumberController {

    @Autowired
    PrimeNumberService primeNumberService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObjectDefault> getBiggerPrimeNumber(@RequestParam("number1") int number1,
                                                                      @RequestParam("number2") int number2)  {
        ResponseObjectDefault responseObjectDefault = primeNumberService.getBiggerPrimeNumber(number1, number2);
        return new ResponseEntity<>(responseObjectDefault, responseObjectDefault.getStatus());
    }

}
