package com.shanto.springboot_gradle_rest_sw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "Home Page", value = "Controller handles different messages")
public class HomeControllerr {

    @ApiOperation(value = "Get Home Page Data",
    nickname = "getHome")
    @ApiResponses(value = {@ApiResponse(code = 405,message = "Invalid Request")})
    @GetMapping("/home")
    public ResponseEntity<List<String>> home(){
        String[] strAr1=new String[] {"Ani", "Sam", "Joe"};
        List<String> stringList = Arrays.asList(strAr1);
        return new ResponseEntity<>(stringList, HttpStatus.OK);
    }
}
