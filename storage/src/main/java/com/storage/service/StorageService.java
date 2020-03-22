package com.storage.service;

import com.common.entity.StorageEntity;
import com.storage.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 18:42
 */
@Service
public class StorageService {

    @Autowired
    private StorageMapper storageMapper;


    public boolean decrease(Integer productId, Integer count) {
        StorageEntity storage=new StorageEntity();
        storage.setProductId(productId);
        StorageEntity tempStorage = storageMapper.selectOne(storage);
        if (tempStorage!=null && tempStorage.getResidue()>=count){
            tempStorage.setUsed(count+tempStorage.getUsed());
            tempStorage.setResidue(tempStorage.getResidue()-count);
            storageMapper.updateByPrimaryKeySelective(tempStorage);
            return true;
        }
        return false;
    }
}
