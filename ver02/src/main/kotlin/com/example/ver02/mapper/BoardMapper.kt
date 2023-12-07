package com.example.ver02.mapper

import com.example.ver02.entity.Board
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository


@Repository
@Mapper
interface BoardMapper {
    /**
     * 각 메소드 이름은 BoardMapper.xml에서 지정한 메소드 별로 반드시 지어줘야 합니다.
     */
    // 전체 파라미터 조회 관련 게시글
    fun selectList(): List<Board?>?

    // 생성 sql문
    fun insertBoard(title: String?, contents: String?): Int?

    // 현재 내용 수정 sql문
    fun updateBoard(board: Board?): Int?

    // 현재 내용을 삭제하는 sql문
    fun deleteBoard(bno: Long?): Int?
}

