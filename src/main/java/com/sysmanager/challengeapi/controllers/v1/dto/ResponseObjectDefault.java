package com.sysmanager.challengeapi.controllers.v1.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseObjectDefault implements Serializable {

    private static final long serialVersionUID = -6110093553425237430L;

    private String resultInfo;
    @JsonIgnore
    private HttpStatus status;
}
