package com.luv2code.demo.rest;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentErrorResponse {

        private int status;
        private String message;
        private long timeStamp;


}
