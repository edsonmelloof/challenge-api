package com.sysmanager.challengeapi.controllers;

import com.sysmanager.challengeapi.controllers.v1.PrimeNumberController;
import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.services.PrimeNumberService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PrimeNumberControllerTest {

    @InjectMocks
    PrimeNumberController primeNumberController;

    @Mock
    private PrimeNumberService primeNumberService;

    @Test
    public void getBiggerPrimeNumberTest() {
        Mockito.doReturn(ResponseObjectDefault.builder()
                .status(HttpStatus.OK)
                .resultInfo("O maior número primo entre 0 e 50 é o 47").build()).when(primeNumberService)
                .getBiggerPrimeNumber(Mockito.anyInt(), Mockito.anyInt());
        ResponseEntity<ResponseObjectDefault> result = primeNumberController.getBiggerPrimeNumber(0, 50);
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

}
