package com.bitcamp.web.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import javassist.SerialVersionUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Bbs
 */
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name = "bbs")
public class Bbs implements Serializable{

    private static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bbsNum;
    @Column(name="writer") private String writer;
    @Column(name="password") private String password;
    @Column(name="title") private String title;
    @Column(name="contents") private String contents;

    @Override
    public String toString(){
        return "Bbs[bbsNum:"+bbsNum+",writer:"+writer+",password:"+password+",title:"+title+",contents:"+contents+",regdate:"+regdate+"]";
    }

    @Builder
    public Bbs(
        String writer, String password, String title, String contents, String regdate
    ){
        this.writer = writer;
        this.password = password;
        this.title = title;
        this.contents = contents;
    }

    @CreationTimestamp
    private Timestamp regdate;
}