package com.version_hit.ServiceImpl;

import com.version_hit.Mapping.HitMapping;
import com.version_hit.Service.HitService;
import com.version_hit.VO.HitVO;
import com.version_hit.VO.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HitServiceImpl implements HitService {

    @Autowired
    HitMapping hitMapping;

    @Override
    public Response ifHit(HitVO hitVO) {
        return null;
    }
}
