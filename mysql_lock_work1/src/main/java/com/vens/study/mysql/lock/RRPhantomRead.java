package com.vens.study.mysql.lock;

import com.vens.study.mapper.UserMapper;
import com.vens.study.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/12
 */
@Service("rRPhantomRead")
public class RRPhantomRead{
    private static final Logger logger = LoggerFactory.getLogger(RRPhantomRead.class);
    @Autowired
    UserMapper userMapper;
    /**
     * 验证rr解决的不可重复读问题
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = {MyException.class})
    public void verifyRepeatedRead() {
        User user=new User("new","110","120");
        user.setId(3);
        userMapper.updateUser(user);
        logger.info("update ok");
    }
}
