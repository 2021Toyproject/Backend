package com.scope.velog.controller;

import com.example.backend.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentRestController {
    private final CommentService commentService;

}
