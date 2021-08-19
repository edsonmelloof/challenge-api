package com.sysmanager.challengeapi.services;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PrimeNumberService {

    public ResponseObjectDefault getBiggerPrimeNumber(int number1, int number2) {
        int biggerPrimeNumber = 0;
        for (int i = number1; i <= number2; i++) {
            if (i == 0 || i == 1)
                continue;

            boolean isPrime = true;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                biggerPrimeNumber = i;
        }
        if(biggerPrimeNumber == 0)
          return ResponseObjectDefault.builder()
                    .status(HttpStatus.NOT_FOUND)
                    .resultInfo(String.format("There are no prime numbers between %1$s and %2$s", number1, number2))
                    .build();

        return ResponseObjectDefault.builder()
                .status(HttpStatus.OK)
                .resultInfo(String.format("The largest prime number between %1$s and %2$s, is %3$s", number1, number2, biggerPrimeNumber))
                .build();
    }

}
