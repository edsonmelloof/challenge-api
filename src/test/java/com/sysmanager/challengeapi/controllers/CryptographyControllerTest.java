package com.sysmanager.challengeapi.controllers;

import com.sysmanager.challengeapi.controllers.v1.FibonacciController;
import com.sysmanager.challengeapi.services.FibonacciService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
public class CryptographyControllerTest {

    @InjectMocks
    FibonacciController fibonacciController;

    @Mock
    private FibonacciService fibonacciService;

    private BigInteger[] sequenceArray = new BigInteger[1];

    @Test
    public void getSequenceFibonacciTest() {
        Mockito.doReturn(sequenceArray).when(fibonacciService).getSequenceFibonacci(Mockito.anyInt());
        ResponseEntity<Object> result = fibonacciController.getSequenceFibonacci(50);
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void getSequenceFibonacciGreaterThan5000Test() {
        Mockito.doReturn(sequenceArray).when(fibonacciService).getSequenceFibonacci(Mockito.anyInt());
        ResponseEntity<Object> result = fibonacciController.getSequenceFibonacci(5001);
        Assert.assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
    }

}
