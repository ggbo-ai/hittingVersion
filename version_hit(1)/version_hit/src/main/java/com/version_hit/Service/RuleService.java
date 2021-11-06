package com.version_hit.Service;

import com.version_hit.VO.Response;
import com.version_hit.VO.RuleVO;
import org.springframework.stereotype.Service;

@Service
public interface RuleService {
    Response addRules(RuleVO ruleVO);
    Response addIDs(String ids);
}
