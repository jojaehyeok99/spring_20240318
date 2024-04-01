package com.example.board.entity;

import com.example.board.entity.pk.FavoritePk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "favorite")
@Table(name = "favorite")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
  // 데이터베이스 키가 복합키일 경우 id를 두개 지정
  @Id
  private Integer boardNumber;
  @Id
  private String userEmail;
}
