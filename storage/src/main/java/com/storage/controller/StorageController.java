package com.storage.controller;

import com.common.pojo.ResponseResult;
import com.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 18:43
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public ResponseResult decrease(@RequestParam("productId") Integer productId,
                            @RequestParam("count") Integer count){
        ResponseResult failResult = ResponseResult.fail("StorageController invoke decrease fail");
        try {
             if(storageService.decrease(productId, count))
             return ResponseResult.success("StorageController invoke decrease success");
             return  failResult;
        }catch (Exception e){
            return failResult;
        }
    }

}
