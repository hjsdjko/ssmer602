package com.dao;

import com.entity.TijianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianyuyueVO;
import com.entity.view.TijianyuyueView;


/**
 * 体检预约
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface TijianyuyueDao extends BaseMapper<TijianyuyueEntity> {
	
	List<TijianyuyueVO> selectListVO(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
	
	TijianyuyueVO selectVO(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
	
	List<TijianyuyueView> selectListView(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);

	List<TijianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
	
	TijianyuyueView selectView(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
	
}
