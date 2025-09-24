package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@RequiredArgsConstructor
@Repository
@Component
public class User1DAO {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public void insert(User1DTO user1DTO) {

        String sql = "INSERT INTO USER1 VALUES (?,?,?,?)";
        Object[] params = {
                user1DTO.getUid(),
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge()
        };
        jdbcTemplate.update(sql, params);  //executeUpdate() 실행
    }

    public User1DTO select(String uid) {
        String sql = "SELECT * FROM USER1 WHERE uid = ?";
        return JdbcTemplate.queryForObject(sql,new User1RowMapper(),uid);;
    }

    public List<User1DTO> selectAll(){
        String sql = "SELECT * FROM USER1";
        return jdbcTemplate.query(sql,new User1RowMapper());
    }

    public void update(User1DTO user1DTO) {
        String sql = "UPDATE USER1 SET name = ?, age = ? WHERE uid = ?";
        Object[] params = {
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge(),
                user1DTO.getUid()
        };
        jdbcTemplate.update(sql, params);  //executeUpdate() 실행
    }

    public void delete(String uid) {
        String sql = "DELETE FROM USER1 WHERE uid = ?";
        jdbcTemplate.update(sql, uid);
    }

}
