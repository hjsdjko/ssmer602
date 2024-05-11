package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TijiantaocanEntity;
import com.entity.view.TijiantaocanView;

import com.service.TijiantaocanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 体检套餐
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
@RestController
@RequestMapping("/tijiantaocan")
public class TijiantaocanController {
    @Autowired
    private TijiantaocanService tijiantaocanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TijiantaocanEntity tijiantaocan, 
		HttpServletRequest request){

        EntityWrapper<TijiantaocanEntity> ew = new EntityWrapper<TijiantaocanEntity>();
		PageUtils page = tijiantaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijiantaocan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TijiantaocanEntity tijiantaocan, HttpServletRequest request){
        EntityWrapper<TijiantaocanEntity> ew = new EntityWrapper<TijiantaocanEntity>();
		PageUtils page = tijiantaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijiantaocan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TijiantaocanEntity tijiantaocan){
       	EntityWrapper<TijiantaocanEntity> ew = new EntityWrapper<TijiantaocanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tijiantaocan, "tijiantaocan")); 
        return R.ok().put("data", tijiantaocanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TijiantaocanEntity tijiantaocan){
        EntityWrapper< TijiantaocanEntity> ew = new EntityWrapper< TijiantaocanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tijiantaocan, "tijiantaocan")); 
		TijiantaocanView tijiantaocanView =  tijiantaocanService.selectView(ew);
		return R.ok("查询体检套餐成功").put("data", tijiantaocanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TijiantaocanEntity tijiantaocan = tijiantaocanService.selectById(id);
		tijiantaocan.setClicknum(tijiantaocan.getClicknum()+1);
		tijiantaocan.setClicktime(new Date());
		tijiantaocanService.updateById(tijiantaocan);
        return R.ok().put("data", tijiantaocan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TijiantaocanEntity tijiantaocan = tijiantaocanService.selectById(id);
		tijiantaocan.setClicknum(tijiantaocan.getClicknum()+1);
		tijiantaocan.setClicktime(new Date());
		tijiantaocanService.updateById(tijiantaocan);
        return R.ok().put("data", tijiantaocan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TijiantaocanEntity tijiantaocan, HttpServletRequest request){
    	tijiantaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijiantaocan);

        tijiantaocanService.insert(tijiantaocan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TijiantaocanEntity tijiantaocan, HttpServletRequest request){
    	tijiantaocan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijiantaocan);

        tijiantaocanService.insert(tijiantaocan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TijiantaocanEntity tijiantaocan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tijiantaocan);
        tijiantaocanService.updateById(tijiantaocan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tijiantaocanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TijiantaocanEntity> wrapper = new EntityWrapper<TijiantaocanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = tijiantaocanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TijiantaocanEntity tijiantaocan, HttpServletRequest request,String pre){
        EntityWrapper<TijiantaocanEntity> ew = new EntityWrapper<TijiantaocanEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = tijiantaocanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijiantaocan), params), params));
        return R.ok().put("data", page);
    }


}
