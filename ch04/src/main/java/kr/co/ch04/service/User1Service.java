package kr.co.ch04.service;

import kr.co.ch04.dao.User1DAO;
import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.mapper.User1Mapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User1Service {

    private final User1Mapper mapper;

    private final User1DAO dao;
    public List<User1DTO> getUsers() {
        //return mapper.selectAll();
        return Select
    }

    public User1DTO getUser(String uid) {
        return mapper.select(uid);
    }

    public void save(User1DTO user) {

        //MyBatis 처리
        //mapper.insert(user);

        //Spring JDBC 처리
        dao.insert(user);
    }

    public void update(User1DTO user) {
        //mapper.update(user);
        dao.update(user);
    }

    public void delete(String uid) {
        //mapper.delete(uid);
        dao.delete(uid);
    }
}