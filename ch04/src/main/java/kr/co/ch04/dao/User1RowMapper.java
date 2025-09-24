package kr.co.ch04.dao;


import kr.co.ch04.dto.User1DTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User1RowMapper implements RowMapper<User1DTO> {


    @Override
    public User1DTO mapRow(ResultSet rs, int rowNum) throws SQLException {

        User1DTO user = new User1DTO();
        user.setUid(rs.getString(1));
        user.setName(rs.getString(2));
        user.setBirth(rs.getString(3));
        user.setAge(rs.getInt(4));

        return user;
    }
}
