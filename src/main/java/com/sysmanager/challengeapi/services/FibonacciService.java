package com.sysmanager.challengeapi.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Slf4j
@Service
public class FibonacciService {

    public BigInteger[] getSequenceFibonacci(int size) {
        BigInteger[] sequenceArray = new BigInteger[size];
        for (int i=0; i < size; i++) {
            if (i < 2) {
                sequenceArray[i] = BigInteger.valueOf(i);
            } else {
                sequenceArray[i] = sequenceArray[i-1].add(sequenceArray[i-2]);
            }
        }
        return sequenceArray;
    }

}
