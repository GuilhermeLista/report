package com.multimodule.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class ReportController {

    @GetMapping(path = "/report/get/help")
    public String getHelp() {
        StringBuilder msg = new StringBuilder();
        msg.append("<h4> This API has the following services:");
        return msg.toString();
    }
}
