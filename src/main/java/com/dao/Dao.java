package com.dao;

/**
 * @author zxfuc
 * @Title:
 * @Package
 * @Description:
 * @date 2020/5/215:33
 */
public interface Dao {
    void save(String sql, Object o);

    void delete(String sql, Object o);

    Object select(String sql, Object o);

    void update(String sql, Object o);
}
