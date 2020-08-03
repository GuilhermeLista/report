package com.multimodule.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import service.ReportService;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class ReportController {

    private ReportService service;


    @GetMapping(path = "/report/get/help")
    public String getHelp() {
        StringBuilder msg = new StringBuilder();
        msg.append("<h4> This API has the following services:");
        return msg.toString();
    }


    @PostMapping(value = "/report/post/handle")
    public ResponseEntity<Object> postReportHandle(
            @RequestParam(value = "id",required = true) String environment,
            @RequestBody (required = false) String body,
            Errors errors)
    {
        ResponseEntity<Object> response = new ResponseEntity<Object>(HttpStatus.OK);
        service.handleReport();

        return response;
    }

}
