package com.kaixuan.springbootproject.project.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: kaixuan
 * @Date: 2019/3/8 17:04
 * @Description:
 */
@Service
public class IndexServiceImpl  implements IndexService {


    @Autowired
    private  IndexMapper indexMapper;

    @Autowired
    private StringRedisTemplate template;

    /**
     *
     * 功能描述:
     *
     * @param:   首页展示功能
     * @return:
     * @auther: kaixuan
     * @date: 2019/3/8 17:14
     */
    public  List<Map<String,String>> getIndexData(){
        List<Map<String,String>> list;
        if(template.opsForValue().get("list") == null ||  template.opsForValue().get("list") == ""){
           list =   indexMapper.getIndexData();
        }else {
            
        }

        return  null;
    }
}
