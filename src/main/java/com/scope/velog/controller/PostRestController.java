package com.scope.velog.controller;

import com.scope.velog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostRestController {
    private final PostService postService;
}
