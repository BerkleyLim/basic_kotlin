package com.example.ver02.controller

import com.example.ver02.entity.Board
import com.example.ver02.service.BoardService
import org.springframework.web.bind.annotation.*


// 컨트롤러 단
// 현재는 Default API는
// "/api/board"
@RestController
@RequestMapping("/api/board")
class BoardController(private var boardService: BoardService) {
    // API : /api/board/select/list
    // 전체 조회를 이용한 API 기능
    @GetMapping("/select/list")
    fun selectList(): List<Board?>? {
        return boardService!!.selectList()
    }

    // API : /api/board/insert/board
    // 게시판 삽입을 이용한 API 기능
    @PostMapping("/insert/board")
    fun insertBoard(@RequestBody board: Board): Int? {
        println(board.toString())
        return boardService!!.insertBoard(board.title, board.contents)
    }

    // API : /api/board/update/board
    // 게시판 수정을 이용한 API 기능
    @PostMapping("/update/board")
    fun updateBoard(@RequestBody board: Board): Int? {
        println("수정")
        println(board.toString())
        return boardService!!.updateBoard(board)
    }

    // API : /api/board/delete/board
    // 게시판 삭제를 이용한 API 기능
    @PostMapping("/delete/board")
    fun deleteBoard(@RequestBody board: Board): Int? {
        return boardService!!.deleteBoard(board.bno)
    }
}