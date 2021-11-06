package com.version_hit.ServiceImpl;

import com.version_hit.Mapping.RuleMapping;
import com.version_hit.Service.RuleService;
import com.version_hit.VO.Response;
import com.version_hit.VO.ReturnVO;
import com.version_hit.VO.RuleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;

@Component
public class RuleServiceImpl implements RuleService {

    @Autowired
    RuleMapping ruleMapping;

    @Override
    public Response addRules(RuleVO ruleVO) {

        int res=ruleMapping.insertRule(ruleVO);
        if(res==0){
            return new Response("INSERT FAILED!", new ReturnVO(res));
        }
        return new Response("INSERT SUCCESSFULLY!",new ReturnVO(res));
    }

    public Response addIDs(String ids){
        String[] device_id_lists=ids.split(",");
        int res=0;
        for(String id:device_id_lists){
            res=ruleMapping.insertID(id);

        }
        if(res==0){
            return new Response("INSERT FAILED!", new ReturnVO(res));
        }
        return new Response("INSERT SUCCESSFULLY!",new ReturnVO(res));

    }
}
