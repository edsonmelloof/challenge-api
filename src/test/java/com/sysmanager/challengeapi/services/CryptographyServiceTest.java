package com.sysmanager.challengeapi.services;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.controllers.v1.enums.CryptographyEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CryptographyServiceTest {

    @InjectMocks
    private CryptographyService cryptographyService;

    @Test
    public void getSequenceFibonacciEncryptTest() {
        ResponseObjectDefault result = cryptographyService.encryptOrDecrypt(CryptographyEnum.ENCRYPT,
                "O que significa 'abxyzABXYZ' escrito nessa xícara");
        Assert.assertEquals("R#txh#vljqlilfd#*deabcDEABC*#hvfulwr#qhvvd#aðfdud", result.getResultInfo());
    }

    @Test
    public void getSequenceFibonacciDecryptTest() {
        ResponseObjectDefault result = cryptographyService.encryptOrDecrypt(CryptographyEnum.DECRYPT,
                "R#txh#vljqlilfd#*deabcDEABC*#hvfulwr#qhvvd#aðfdud");
        Assert.assertEquals("O que significa 'abxyzABXYZ' escrito nessa xícara", result.getResultInfo());
    }

}
