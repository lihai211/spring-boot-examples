package com.sample.springboot.controller;


import com.sample.springboot.service.common.DemoService;
import com.kit.common.util.http.NewResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蒋灵俊
 * @data 2018/6/6
 * @Description:
 */
@RestController
public class SampleController {


    @Autowired
    private DemoService demoService;

    @RequestMapping("send")
    public NewResponseModel sendMessage() {
        NewResponseModel responseModel = NewResponseModel.Success();
        demoService.sendMessage();
        return responseModel;
    }

    @RequestMapping("sendTest")
    public NewResponseModel sendMessageTest() {
        NewResponseModel responseModel = NewResponseModel.Success();
        demoService.sendTestMessage("今天天气是阴天！！！");
        return responseModel;
    }
}
