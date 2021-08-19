package com.sysmanager.challengeapi.services;

import com.sysmanager.challengeapi.controllers.v1.dto.ResponseObjectDefault;
import com.sysmanager.challengeapi.controllers.v1.enums.CryptographyEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CryptographyService {

    public ResponseObjectDefault encryptOrDecrypt(CryptographyEnum type, String word) {
        return CryptographyEnum.ENCRYPT.equals(type) ? ResponseObjectDefault.builder()
                .resultInfo(encrypt(word))
                .build() : ResponseObjectDefault.builder()
                .resultInfo(decrypt(word))
                .build();
    }

    private String encrypt(String word) {
        StringBuilder encryptedWord = new StringBuilder();
        char[] arrayChar  = word.toCharArray();
        for(char c : arrayChar) {
            if (c == 88) {
                c = 65;
            } else if (c == 120) {
                c = 97;
            } else if (c == 89) {
                c = 66;
            } else if (c == 121) {
                c = 98;
            } else if (c == 90) {
                c = 67;
            } else if (c == 122) {
                c = 99;
            } else
                c = (char) (c + 3);

            encryptedWord.append(c);
        }
        return encryptedWord.toString();
    }

    private String decrypt(String value) {
        StringBuilder decryptedWord = new StringBuilder();
        char[] arrayChar  = value.toCharArray();
        for(char c : arrayChar){
            if(c == 65) {
                decryptedWord.append(Character.toChars(88));
            } else if(c == 66) {
                decryptedWord.append(Character.toChars(89));
            } else if(c == 67) {
                decryptedWord.append(Character.toChars(90));
            }  else if(c == 99) {
                decryptedWord.append(Character.toChars(122));
            } else if(c == 97) {
                decryptedWord.append(Character.toChars(120));
            } else if(c == 98) {
                decryptedWord.append(Character.toChars(121));
            } else {
                decryptedWord.append(Character.toChars(c-3));
            }
        }
        return decryptedWord.toString();
    }

}
