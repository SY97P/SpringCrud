package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/board/write") //localhost:8090/board/write
    public String boardWriteForm() {
        // 어떤 view 파일을 보여줄 것인지 이름(확장자 제외)
        return "boardwrite";
    }
}
