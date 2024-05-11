package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiantaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiantaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiantaocanView;


/**
 * 体检套餐
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface TijiantaocanService extends IService<TijiantaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiantaocanVO> selectListVO(Wrapper<TijiantaocanEntity> wrapper);
   	
   	TijiantaocanVO selectVO(@Param("ew") Wrapper<TijiantaocanEntity> wrapper);
   	
   	List<TijiantaocanView> selectListView(Wrapper<TijiantaocanEntity> wrapper);
   	
   	TijiantaocanView selectView(@Param("ew") Wrapper<TijiantaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiantaocanEntity> wrapper);
   	
}

