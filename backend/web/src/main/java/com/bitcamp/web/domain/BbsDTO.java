package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * BbsDTO
 */
@Data @Component @Lazy
public class BbsDTO {

    private int bbsNum, hit;
    private String writer, password, title, contents, regdate;
}