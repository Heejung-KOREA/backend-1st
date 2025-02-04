package com.github.supercodinpj1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor  //파라미터가 없는 디폴트 생성자 생성
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 생성
public class UserDto {
    private String email;
    private String password;
}
