package com.abo.service.impl;

import com.abo.dao.IUserDao;
import com.abo.domain.User;
import com.abo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
