package com.sysmanager.challengeapi.controllers.v1;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.controllers.v1.enums.CryptographyEnum;
import com.sysmanager.challengeapi.services.CryptographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cryptography")
public class CryptographyController {

    @Autowired
    CryptographyService cryptographyService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObjectDefault> getEncryptedOrDecryptedWord(@RequestParam("type") CryptographyEnum type,
                                                                             @RequestParam("value") String value)  {
        return new ResponseEntity<>(cryptographyService.encryptOrDecrypt(type, value), HttpStatus.OK);
    }



}
