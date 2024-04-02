package com.example.board.service.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.board.GetLatestListResponseDto;
import com.example.board.dto.response.board.item.BoardListItem;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImplementation implements BoardService{
  private final BoardRepository boardRepository;

  @Override
  public ResponseEntity<? super GetLatestListResponseDto> getLatestList() {

    try {
      // 1. 데이터베이스에서 최신순으로 데이터를 조회


    } catch (Exception exception) {
      // 따로 만들지 않고 원래 방식대로 한 결과(밑에 코드)
      // ResponseDto body = new ResponseDto(ResponseCode.DATABASE_ERROR,ResponseMessage.DATABASE_ERROR);
      // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
      return ResponseDto.databaseError();
    }

    // 2. 조회결과를 BoardListItem의 리스트로 변경 = BoardListItem과 BoardEntity의 리스트 내용이 달라서 변경하는 작업
    List<BoardListItem> latestList = new ArrayList<>();

    // 3. 변경 후 DTO로 성공 데이터를 Controller에 반환
    // 따로 만들지 않고 원래 방식대로 한 결과(밑에 코드)
    // GetLatestListResponseDto body = new GetLatestListResponseDto(latestList);
    // return ResponseEntity.status(HttpStatus.OK).body(body);
    return GetLatestListResponseDto.success(latestList);
  }
}
