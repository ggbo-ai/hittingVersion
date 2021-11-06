package com.version_hit.Service;

import com.version_hit.VO.HitVO;
import com.version_hit.VO.Response;
import org.springframework.stereotype.Service;

@Service
public interface HitService {
    Response ifHit(HitVO hitVO);
}
