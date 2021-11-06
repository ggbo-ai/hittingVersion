package com.version_hit.Mapping;

import com.version_hit.PO.RulePO;
import com.version_hit.VO.RuleVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RuleMapping {
    int insertRule(RuleVO ruleVO);
    int insertID(String id);
}
