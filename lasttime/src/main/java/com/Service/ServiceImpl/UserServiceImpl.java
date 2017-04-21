package com.Service.ServiceImpl;

import com.Respotitory.UserRespository;
import com.Service.UserService;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cnslp on 2017/4/21.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;
    @Override
    public List<User> findAll() {
        return userRespository.findAll();
    }
}
