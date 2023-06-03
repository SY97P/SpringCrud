package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") //localhost:8090/board/write
    public String boardWriteForm() {
        // 어떤 view 파일을 보여줄 것인지 이름(확장자 제외)
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boarWritePro(Board board) {
        boardService.write(board);
        return "";
    }
}
