package com.sample.springboot.controller;

import com.sample.springboot.service.image.ImageUploadService;
import com.kit.common.util.http.NewResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Lucifer
 * @data 2018/5/7
 * @Description: 七牛云图片上传
 */
@RestController
@RequestMapping("/upload/")
public class QiniuUploadController {

    @Autowired
    private ImageUploadService imageUploadService;

    @RequestMapping("image")
    public NewResponseModel UploadImage(MultipartFile file) throws Exception {
        NewResponseModel responseModel = NewResponseModel.Success();
        responseModel.setData(imageUploadService.uploadImg(file));
        return responseModel;
    }
}
