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

  // 성공
  public static ResponseEntity<ResponseDto> success(){
    ResponseDto body = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    return ResponseEntity.status(HttpStatus.OK).body(body);
  }

  // 유효성 검증 실패
  public static ResponseEntity<ResponseDto> validationFail(){
    ResponseDto body = new ResponseDto(ResponseCode.VALIDATION_FAIL, ResponseMessage.VALIDATION_FAIL);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 중복된 이메일
  public static ResponseEntity<ResponseDto> duplicateEmail(){
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_EMAIL, ResponseMessage.DUPLICATE_EMAIL);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 중복된 닉네임
  public static ResponseEntity<ResponseDto> duplicateNickname(){
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_NICKNAME, ResponseMessage.DUPLICATE_NICKNAME);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

  // 중복된 휴대전화
  public static ResponseEntity<ResponseDto> duplicateTelNumber(){
    ResponseDto body = new ResponseDto(ResponseCode.DUPLICATE_TEL_NUMBER, ResponseMessage.DUPLICATE_TEL_NUMBER);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
  }

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
