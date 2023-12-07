package com.example.ver02.service

import com.example.ver02.entity.Board
import com.example.ver02.mapper.BoardMapper
import org.springframework.stereotype.Service

@Service
class BoardService(private val boardMapper : BoardMapper) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    /**
     * 각 Mapper별의 응답값을 불려오고, 앞으로의 로직을 짤 때는 Controller단이 아닌
     * Service 단에서 별도의 로직과 알고리즘을 구현 하는 형태로 진행합니다.
     */
    // 전체 조회 로직
    fun selectList(): List<Board?>? {
        return boardMapper.selectList()
    }



    // 게시물 삽입 로직
    fun insertBoard(title: String?, contents: String?): Int? {
        return boardMapper.insertBoard(title, contents)
    }

    // 게시물 수정 로직
    fun updateBoard(board: Board?): Int? {
        return boardMapper.updateBoard(board)
    }

    // 게시물 삭제 로직
    fun deleteBoard(bno: Long?): Int? {
        return boardMapper.deleteBoard(bno)
    }
}
