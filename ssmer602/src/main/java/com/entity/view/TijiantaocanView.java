package com.entity.view;

import com.entity.TijiantaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体检套餐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 18:00:58
 */
@TableName("tijiantaocan")
public class TijiantaocanView  extends TijiantaocanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijiantaocanView(){
	}
 
 	public TijiantaocanView(TijiantaocanEntity tijiantaocanEntity){
 	try {
			BeanUtils.copyProperties(this, tijiantaocanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
