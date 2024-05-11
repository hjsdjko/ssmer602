package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianfenleiView;


/**
 * 体检分类
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
public interface TijianfenleiService extends IService<TijianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianfenleiVO> selectListVO(Wrapper<TijianfenleiEntity> wrapper);
   	
   	TijianfenleiVO selectVO(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
   	
   	List<TijianfenleiView> selectListView(Wrapper<TijianfenleiEntity> wrapper);
   	
   	TijianfenleiView selectView(@Param("ew") Wrapper<TijianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianfenleiEntity> wrapper);
   	
}

