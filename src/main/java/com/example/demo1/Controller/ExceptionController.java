package com.example.demo1.Controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:fhj
 * date:2017/6/28 0028 14:58
 */
@Controller
@RequestMapping(value = "error")
public class ExceptionController implements ErrorController {


    @Override
    public String getErrorPath() {
        return "error/error";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}
