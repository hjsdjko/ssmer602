package com.dao;

import com.entity.DiscusstijiantaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstijiantaocanVO;
import com.entity.view.DiscusstijiantaocanView;


/**
 * 体检套餐评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface DiscusstijiantaocanDao extends BaseMapper<DiscusstijiantaocanEntity> {
	
	List<DiscusstijiantaocanVO> selectListVO(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
	
	DiscusstijiantaocanVO selectVO(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
	
	List<DiscusstijiantaocanView> selectListView(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);

	List<DiscusstijiantaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
	
	DiscusstijiantaocanView selectView(@Param("ew") Wrapper<DiscusstijiantaocanEntity> wrapper);
	
}
