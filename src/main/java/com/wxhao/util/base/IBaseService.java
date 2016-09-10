package com.wxhao.util.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public interface IBaseService<T, ID extends Serializable> {
	
	/**
     * <保存实体>
     * <完整保存实体>
     * @param t 实体参数
     */
    public abstract ID save(T t);
 
    /**
     * <保存或者更新实体>
     * @param t 实体
     */
    public abstract void saveOrUpdate(T t);
 
    /**
     * <load>
     * <加载实体的load方法>
     * @param id 实体的id
     * @return 查询出来的实体
     */
    public abstract T load(ID id);
 
    /**
     * <get>
     * <查找的get方法>
     * @param id 实体的id
     * @return 查询出来的实体
     */
    public abstract T get(ID id);
 
    /**
     * <contains>
     * @param t 实体
     * @return 是否包含
     */
    public abstract boolean contains(T t);
 
    /**
     * <delete>
     * <删除表中的t数据>
     * @param t 实体
     */
    public abstract void delete(T t);
 
    /**
     * <根据ID删除数据>
     * @param Id 实体id
     * @return 是否删除成功
     */
    public abstract boolean deleteById(ID id);
 
    /**
     * <删除所有>
     * @param entities 实体的Collection集合
     */
    public abstract void deleteAll(Collection<T> entities);
     
 
    /**
     * <同步>
     */
    public void flush() ;
    
    /**
     * <持久化对象>
     */
    public void persist(T entity) ;
    
    /**
     * <查找所有实体>
     */
    public List<T> findAll();
    
}
