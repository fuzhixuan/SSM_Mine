package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author zxfuc
 * @Title:
 * @Package
 * @Description:
 * @date 2020/5/215:33
 */
@Repository("daoSupport")
public class DaoSupport implements Dao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public void save(String sql, Object o) {
        sqlSessionTemplate.insert(sql, o);
    }

    @Override
    public void delete(String sql, Object o) {
        sqlSessionTemplate.delete(sql, o);
    }

    @Override
    public Object select(String sql, Object o) {
        return sqlSessionTemplate.selectOne(sql, o);
    }

    @Override
    public void update(String sql, Object o) {
        sqlSessionTemplate.update(sql, o);
    }
}
