package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianyuyueView;


/**
 * 体检预约
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface TijianyuyueService extends IService<TijianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianyuyueVO> selectListVO(Wrapper<TijianyuyueEntity> wrapper);
   	
   	TijianyuyueVO selectVO(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
   	
   	List<TijianyuyueView> selectListView(Wrapper<TijianyuyueEntity> wrapper);
   	
   	TijianyuyueView selectView(@Param("ew") Wrapper<TijianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianyuyueEntity> wrapper);
   	
}

