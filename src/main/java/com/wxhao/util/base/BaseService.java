package com.wxhao.util.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class BaseService<T, ID extends Serializable> implements IBaseService<T, ID>{

	private IBaseDao<T, ID> baseDao;

	public void setBaseDao(IBaseDao<T, ID> baseDao) {
		this.baseDao = baseDao;
	}
	
	 /**
     * <保存实体>
     * <完整保存实体>
     * @param t 实体参数
     * @see com.wxhao.util.base.dao#save(java.lang.Object)
     */
     
    public ID save(T t) {
    	return baseDao.save(t);
    }
     
    /**
     * <保存或者更新实体>
     * @param t 实体
     * @see com.wxhao.util.base.dao#saveOrUpdate(java.lang.Object)
     */
     
    public void saveOrUpdate(T t) {
        baseDao.saveOrUpdate(t);
    }
     
    /**
     * <load>
     * <加载实体的load方法>
     * @param id 实体的id
     * @return 查询出来的实体
     * @see com.wxhao.util.base.dao#load(java.io.Serializable)
     */
     
    public T load(ID id) {
        return baseDao.load( id);
    }
     
    /**
     * <get>
     * <查找的get方法>
     * @param id 实体的id
     * @return 查询出来的实体
     * @see com.wxhao.util.base.dao#get(java.io.Serializable)
     */
     
    public T get(ID id) {
        T load = (T) baseDao.get(id);
        return load;
    }
     
    /**
     * <contains>
     * @param t 实体
     * @return 是否包含
     * @see com.wxhao.util.base.dao#contains(java.lang.Object)
     */
     
    public boolean contains(T t) {
        return baseDao.contains(t);
    }
 
    /**
     * <delete>
     * <删除表中的t数据>
     * @param t 实体
     * @see com.wxhao.util.base.dao#delete(java.lang.Object)
     */
     
    public void delete(T t) {
        baseDao.delete(t);
    }
     
    /**
     * <根据ID删除数据>
     * @param Id 实体id
     * @return 是否删除成功
     * @see com.wxhao.util.base.dao#deleteById(java.io.Serializable)
     */
     
    public boolean deleteById(ID id) {
    	return baseDao.deleteById(id);
    }
 
    /**
     * <删除所有>
     * @param entities 实体的Collection集合
     * @see com.wxhao.util.base.dao#deleteAll(java.util.Collection)
     */
     
    public void deleteAll(Collection<T> entities) {
        baseDao.deleteAll(entities);
    }
 
    
    /**
     * <同步>
     */
    public void flush() {
    	baseDao.flush();
	}
     
    /**
     * <持久化对象>
     */
    public void persist(T entity) {
    	baseDao.persist(entity);
	}
    
    /**
     * <查找所有实体>
     */
    public List<T> findAll(){
    	return baseDao.findAll();
    }
     
}