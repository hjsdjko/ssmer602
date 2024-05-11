package com.entity.view;

import com.entity.TijianyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体检预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
@TableName("tijianyuyue")
public class TijianyuyueView  extends TijianyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijianyuyueView(){
	}
 
 	public TijianyuyueView(TijianyuyueEntity tijianyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, tijianyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
