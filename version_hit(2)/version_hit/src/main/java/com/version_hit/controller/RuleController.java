package com.version_hit.controller;

import com.version_hit.Service.RuleService;
import com.version_hit.VO.Response;
import com.version_hit.VO.RuleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class RuleController {

    @Autowired
    RuleService ruleService;

//127.0.0.1:8080/version/rule?platform=2&download_url=3&update_version_code=4&md5=5&device_id_list=6&max_update_version_code=7&min_update_version_code=8&max_os_api=9&min_os_api=10&cpu_arch=1&channel=2&title=3&update_tips=4
    @GetMapping("/rule")

    public String Rule(@RequestParam("aid") int aid,
                        @RequestParam("platform") String platform,
                       @RequestParam("download_url") String download_url,
                       @RequestParam("update_version_code") String update_version_code,
                       @RequestParam("md5") String md5,
//                       @RequestParam("device_id_list") String device_id_list,
                       @RequestParam("min_update_version_code") String min_version,
                       @RequestParam("max_update_version_code") String max_version,
                       @RequestParam("max_os_api") String max_os_api,
                       @RequestParam("min_os_api") String min_os_api,
                       @RequestParam("cpu_arch") String  cpu_arch,
                       @RequestParam("channel") String channel,
                       @RequestParam("title") String title,
                       @RequestParam("update_tips") String update_tips){

        Response response=ruleService.addRules(new RuleVO(aid,platform,download_url,update_version_code,md5,min_version,max_version,
                Integer.valueOf(max_os_api),Integer.valueOf(min_os_api),
                Integer.valueOf(cpu_arch),channel,title,update_tips));

        return response.getMessage();
    }
    @GetMapping("/ID")
    public String SaveID(@RequestParam("ids") String ids){
        Response response=ruleService.addIDs(ids);
        return response.getMessage();
    }

}