package com.it.springboot.dao.jpa;

import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into user values(#{user.id},#{user.age},#{user.createTime},'张三')",nativeQuery = true)
    public void insertUser(@RequestBody User user);
}
