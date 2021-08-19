package com.sysmanager.challengeapi.controllers;

import com.sysmanager.challengeapi.controllers.v1.HealthController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HealthControllerTest {

    @InjectMocks
    HealthController healthController;

    @Test
    public void getHealthTest() {
        ResponseEntity<String> result = healthController.getHealth();
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

}
