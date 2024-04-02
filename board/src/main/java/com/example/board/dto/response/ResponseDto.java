package com.example.board.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {
  private String code;
  private String message;

  // 데이터베이스 오류
  public static ResponseEntity<ResponseDto> databaseError(){
    ResponseDto body = new ResponseDto(ResponseCode.DATABASE_ERROR,ResponseMessage.DATABASE_ERROR);
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
  }

  // 존재하지 않는 유저
  public static ResponseEntity<ResponseDto> notExistUser(){
    ResponseDto body = new ResponseDto(ResponseCode.NOT_EXIST_USER,ResponseMessage.NOT_EXIST_USER);
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(body);
  }
}
