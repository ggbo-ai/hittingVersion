package com.version_hit.controller;

import com.version_hit.Service.HitService;
import com.version_hit.VO.HitVO;
import com.version_hit.VO.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class HitController {

    @Autowired
    HitService hitService;

    @GetMapping("/hit")
    public Response Hit(@RequestParam("hitVO") HitVO hitVO){
        return hitService.ifHit(hitVO);
    }
}
