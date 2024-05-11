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


import com.dao.TijianfenleiDao;
import com.entity.TijianfenleiEntity;
import com.service.TijianfenleiService;
import com.entity.vo.TijianfenleiVO;
import com.entity.view.TijianfenleiView;

@Service("tijianfenleiService")
public class TijianfenleiServiceImpl extends ServiceImpl<TijianfenleiDao, TijianfenleiEntity> implements TijianfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianfenleiEntity> page = this.selectPage(
                new Query<TijianfenleiEntity>(params).getPage(),
                new EntityWrapper<TijianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianfenleiEntity> wrapper) {
		  Page<TijianfenleiView> page =new Query<TijianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijianfenleiVO> selectListVO(Wrapper<TijianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianfenleiVO selectVO(Wrapper<TijianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianfenleiView> selectListView(Wrapper<TijianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianfenleiView selectView(Wrapper<TijianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
