package com.storage;

import com.common.entity.StorageEntity;
import com.storage.mapper.StorageMapper;
import com.storage.service.StorageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 19:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=StorageApplication.class)
public class StorageTest {

    @Autowired
    private StorageService storageService;


    @Test
    public void test(){
        storageService.decrease(1,1);

    }

}
