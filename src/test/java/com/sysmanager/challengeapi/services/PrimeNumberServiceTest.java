package com.sysmanager.challengeapi.services;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PrimeNumberServiceTest {

    @InjectMocks
    private PrimeNumberService primeNumberService;

    @Test
    public void getBiggerPrimeNumberExistsTest() {
        ResponseObjectDefault result = primeNumberService.getBiggerPrimeNumber(0, 50);
        Assert.assertEquals("The largest prime number between 0 and 50, is 47", result.getResultInfo());
    }

    @Test
    public void getBiggerPrimeNumberNotExistsTest() {
        ResponseObjectDefault result = primeNumberService.getBiggerPrimeNumber(0, 1);
        Assert.assertEquals("There are no prime numbers between 0 and 1", result.getResultInfo());
    }

}
