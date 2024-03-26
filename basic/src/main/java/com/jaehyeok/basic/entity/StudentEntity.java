package com.jaehyeok.basic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Entity : RDBMS의 테이블과 매핑되는 클래스
// - 웹 애플리케이션 서버와 데이터베이스 서버간의 데이터 관리를 위한 객체
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @Entity : 
// - 해당 클래스를 Entity 클래스로 등록하는 어노테이션
// - JPA에서 데이터 관리를 위한 주된 객체
// - name 속성 : Entity 클래스의 이름을 지정

@Entity(name = "student")
// @Table :
// - 해당 Entity 클래스를 RDBMS의 어떤 테이블과 매핑할지 지정하는 어노테이션
// - name 속성 : 매핑할 RDBMS의 테이블명을 지정
// - 만약 클래스명 - Entity 명 -  Table 명이 동일하면 @Entity 생략 가능
@Table(name = "student")
public class StudentEntity {

  // @ID : Entity의 필드 중 Primary key로 사용되는 필드를 지정
  @Id
  // @GeneratedValue :
  // - Primary key의 자동 생성 전략을 지정
  // GenerationType의 주요 전략
  // - GenerationType.AUTO : JPA 프로바이더가 자동으로 값을 생성 
  //                         이 전략은 데이터베이스에 따라 적절한 전략을 선택(예: 시퀀스, IDENTITY, 테이블 등).
  // - GenerationType.IDENTITY : 데이터베이스의 IDENTITY 열을 사용하여 값을 생성 
  //                             데이터베이스가 자동 증가 열을 지원하는 경우 이 전략이 사용
  // - GenerationType.SEQUENCE: 데이터베이스의 시퀀스를 사용하여 값을 생성
  // - GenerationType.TABLE: 키 생성 테이블을 사용하여 값을 생성
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @Column :
  // - 해당 필드를 매핑한 테이블의 어떤 컬럼과 매핑할지 지정
  // - name 속성 : 실제 컬럼의 이름
  // - nullable 속성 : 열이 NULL 값을 허용하는지 여부를 지정
  // - unique 속성 : 열 값이 고유해야 하는지 여부를 지정
  // - length 속성 : 문자열 열의 최대 길이를 지정
  // - 만약, 테이블의 컬럼명과 클래스의 필드명이 같으면 @Column 생략 가능
  @Column(name="student_number", nullable = false, unique = true, insertable = false, updatable = false, length = 10)
  private Integer studentNumber;

  private String name;
  private Integer age;
  private String address;
  private Boolean graduation;
}
