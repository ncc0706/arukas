package io.arukas.service;

import io.arukas.entity.User;

import java.util.List;

/**
 * Created by Administrator on 20/06/2017.
 */
public interface IUserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    User findOne(Long id);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    /**
     * 返回所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 更新用户
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 根据用户ID删除用户
     * @param id
     */
    void deleteUserById(Long id);
}
