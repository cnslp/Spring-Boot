package com.Respotitory;

import com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cnslp on 2017/4/21.
 */
public interface UserRespository extends JpaRepository<User,Long>{
}
