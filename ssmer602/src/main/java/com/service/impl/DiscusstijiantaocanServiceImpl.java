package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstijiantaocanDao;
import com.entity.DiscusstijiantaocanEntity;
import com.service.DiscusstijiantaocanService;
import com.entity.vo.DiscusstijiantaocanVO;
import com.entity.view.DiscusstijiantaocanView;

@Service("discusstijiantaocanService")
public class DiscusstijiantaocanServiceImpl extends ServiceImpl<DiscusstijiantaocanDao, DiscusstijiantaocanEntity> implements DiscusstijiantaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstijiantaocanEntity> page = this.selectPage(
                new Query<DiscusstijiantaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusstijiantaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstijiantaocanEntity> wrapper) {
		  Page<DiscusstijiantaocanView> page =new Query<DiscusstijiantaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstijiantaocanVO> selectListVO(Wrapper<DiscusstijiantaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstijiantaocanVO selectVO(Wrapper<DiscusstijiantaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstijiantaocanView> selectListView(Wrapper<DiscusstijiantaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstijiantaocanView selectView(Wrapper<DiscusstijiantaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
