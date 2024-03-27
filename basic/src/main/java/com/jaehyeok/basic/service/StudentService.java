package com.jaehyeok.basic.service;

import org.springframework.http.ResponseEntity;

import com.jaehyeok.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
  ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}
