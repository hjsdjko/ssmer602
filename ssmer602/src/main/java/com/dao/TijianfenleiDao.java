package com.dao;

import com.entity.TijianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianfenleiVO;
import com.entity.view.TijianfenleiView;


/**
 * 体检分类
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface TijianfenleiDao extends BaseMapper<TijianfenleiEntity> {
	
	List<TijianfenleiVO> selectListVO(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	
	TijianfenleiVO selectVO(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	
	List<TijianfenleiView> selectListView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);

	List<TijianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	
	TijianfenleiView selectView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
	
}
