package com.javen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.json.JSONObject;
import com.javen.model.Staff;
import com.javen.model.User;
import com.javen.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main")
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);
    @Resource
    private MainService mainService;

    @RequestMapping(value="/queryStaff",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> queryStaff(HttpServletRequest request, Staff bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            List<Staff> staff = mainService.queryStaff(bo);
            if (staff != null && staff .size() != 0) {
                map.put("code", 0);
                map.put("remake", "查询成功");
                map.put("rsp", JSON.parseArray(JSONObject.valueToString(staff)));
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "查询失败");
        }
        return map;
    }


    @RequestMapping(value="/addStaff",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> addStaff(HttpServletRequest request, Staff bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            mainService.addStaff(bo);
            map.put("code", 0);
            map.put("remake", "添加员工成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "添加添加失败");
        }
        return map;
    }

}
