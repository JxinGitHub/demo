package com.bonc.controller;

import com.alibaba.fastjson.JSON;
import com.bonc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/24.11:17
 */
@Controller
public class ObtainUserController {

	@Autowired
	private UserMapper userDao;

	@RequestMapping("/cas/getUserId/{acount}")
	@ResponseBody
//	public  Object getUserId(@RequestParam String acount){
	public  Object getUserId(@PathVariable String acount){
		Map result = new HashMap();
		Long aLong = null;

		if (acount.contains("@")){
			aLong = userDao.obtainUserIdByEmail(acount);
		}else {
			 aLong = userDao.obtainUserIdByMobile(acount);
		}

		result.put("user_id",aLong);
		result.put("acount",acount);

		return  "jsonpCallback"+"("+ JSON.toJSON(result)+")";
	}


}
