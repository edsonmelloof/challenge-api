package com.sysmanager.challengeapi.controllers;

import com.sysmanager.challengeapi.controllers.v1.CryptographyController;
import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.controllers.v1.enums.CryptographyEnum;
import com.sysmanager.challengeapi.services.CryptographyService;
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
public class FibonacciControllerTest {

    @InjectMocks
    CryptographyController cryptographyController;

    @Mock
    private CryptographyService cryptographyService;

    @Test
    public void getEncryptedOrDecryptedWordTest() {
        Mockito.doReturn(ResponseObjectDefault.builder().resultInfo("ydoxh").build())
                .when(cryptographyService).encryptOrDecrypt(Mockito.any(), Mockito.any());
        ResponseEntity<ResponseObjectDefault> result = cryptographyController.getEncryptedOrDecryptedWord(CryptographyEnum.ENCRYPT, "any value");
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

}
