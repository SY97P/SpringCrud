package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository 의 제너릭은 {key:value} = {entity: entity의 pk 타입}
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

    /** JPARepository 검색 메소드
     *
     *  * findBy(컬럼 이름) : 정확하게 일치하는 키워드만 데이터 검색
     *  * findBy(컬럼 이름)Containing : 키워드를 포함하는 데이터 검색
     */

    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
