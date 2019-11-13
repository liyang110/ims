package com.ims.modules.test.controller;

import com.ims.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：liyang.
 * @ Date       ：Created in 16:55 2019/11/11
 * @ Description：
 * @ Modified By：
 */
@RestController
public class TestHelloController {
    /**
     * hello world
     *
     * @return
     */
    @GetMapping(value = "/hello")
    public Result<String> hello() {
        Result<String> result = new Result<String>();
        result.setResult("Hello World!");
        result.setSuccess(true);
        return result;
    }
}
