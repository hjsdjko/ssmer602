package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstijiantaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstijiantaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstijiantaocanView;


/**
 * 体检套餐评论表
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface DiscusstijiantaocanService extends IService<DiscusstijiantaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstijiantaocanVO> selectListVO(Wrapper<DiscusstijiantaocanEntity> wrapper);
   	
   	DiscusstijiantaocanVO selectVO(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
   	
   	List<DiscusstijiantaocanView> selectListView(Wrapper<DiscusstijiantaocanEntity> wrapper);
   	
   	DiscusstijiantaocanView selectView(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstijiantaocanEntity> wrapper);
   	
}

