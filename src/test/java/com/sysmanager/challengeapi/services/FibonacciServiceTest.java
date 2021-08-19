package com.sysmanager.challengeapi.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
public class FibonacciServiceTest {

    @InjectMocks
    private FibonacciService fibonacciService;

    @Test
    public void getSequenceFibonacciTest() {
        BigInteger[] results = fibonacciService.getSequenceFibonacci(5);
        Assert.assertEquals(BigInteger.ZERO, results[0]);
    }

}
