package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

// JpaRepository 의 제너릭은 {key:value} = {entity: entity의 pk 타입}
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
