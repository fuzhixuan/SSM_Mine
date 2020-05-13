package com.service.impl;

import com.dao.DaoSupport;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zxfuc
 * @Title:
 * @Package
 * @Description:
 * @date 2020/5/215:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private DaoSupport daoSupport;

    @Override
    public Map getAll() {
        return (Map) daoSupport.select("UserMapper.getAll", null);
    }
}
