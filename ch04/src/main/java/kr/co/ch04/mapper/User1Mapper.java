package kr.co.ch04.mapper;

import kr.co.ch04.dto.User1DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User1Mapper {

    public void insert(User1DTO user1DTO);
    public User1DTO select(String uid);
    public List<User1DTO> selectAll();
    public void update(User1DTO user1DTO);
    public void delete(String uid);

}