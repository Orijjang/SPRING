package kr.co.ch05.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User1DTO {
    private String uid;
    private String name;
    private String birth;
    private int age;
}