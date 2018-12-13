package com.javen.controller;

import com.alibaba.fastjson.JSON;
import com.javen.model.Turnover;
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
            }else {
                map.put("code", 1);
                map.put("remake", "查询为空");
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "查询失败");
        }
        return map;
    }

    @RequestMapping(value="/queryStaffById",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> queryStaffById(HttpServletRequest request, Staff bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            Staff staff = mainService.queryStaffById(bo);
            if (staff != null ) {
                map.put("code", 0);
                map.put("remake", "查询成功");
                map.put("rsp", JSON.toJSONString(staff));
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
            map.put("remake", "添加员工失败");
        }
        return map;
    }


    @RequestMapping(value="/updateStaff",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> updateStaff(HttpServletRequest request, Staff bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            mainService.updateStaff(bo);
            map.put("code", 0);
            map.put("remake", "修改员工成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "修改员工失败");
        }
        return map;
    }



    /////////////////////////////////////////////////////

    @RequestMapping(value="/queryTurnover",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> queryTurnover(HttpServletRequest request, Turnover bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            List<Turnover> rsp = mainService.queryThrowable(bo);
            if (rsp != null && rsp.size() != 0 ) {
                map.put("code", 0);
                map.put("remake", "查询成功");
                map.put("rsp", JSON.parseArray(JSONObject.valueToString(rsp)));
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "查询失败");
        }
        return map;
    }

    @RequestMapping(value="/queryTurnoverById",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> queryTurnoverById(HttpServletRequest request, Turnover bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            Turnover rsp = mainService.queryThrowableById(bo);
            if (rsp != null ) {
                map.put("code", 0);
                map.put("remake", "查询成功");
                map.put("rsp", JSON.toJSONString(rsp));
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "查询失败");
        }
        return map;
    }



    @RequestMapping(value="/addTurnover",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> addTurnover(HttpServletRequest request, Turnover bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            mainService.addThrowable(bo);
            map.put("code", 0);
            map.put("remake", "添加营业额成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "添加营业额失败");
        }
        return map;
    }


    @RequestMapping(value="/updateTurnover",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> updateTurnover(HttpServletRequest request, Turnover bo){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            mainService.updateThrowable(bo);
            map.put("code", 0);
            map.put("remake", "修改营业额成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 8);
            map.put("remake", "修改营业额失败");
        }
        return map;
    }

    @RequestMapping(value="/test",method= RequestMethod.POST)
    public @ResponseBody Object  test(HttpServletRequest request, Staff bo){
        List<Staff> staff = mainService.queryStaff(bo);
        return  JSONObject.valueToString(staff);

    }
}
