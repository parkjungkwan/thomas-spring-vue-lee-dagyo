DROP TABLE IF EXISTS BBS;
CREATE TABLE BBS (
BBS_NUM INT AUTO_INCREMENT PRIMARY KEY,
WRITER VARCHAR(50) NOT NULL,
PASSWORD VARCHAR(50) NOT NULL,
TITLE VARCHAR(150) NOT NULL,
CONTENTS VARCHAR(2048) NOT NULL,
REGDATE DATETIME NOT NULL,
HIT INT(11) NOT NULL DEFAULT 0
);
/* insert into bbs (bbs_num, contents, hit, password, regdate, title, writer) values (
1, '내용', 0, '1234', parsedatetime(sysdate, 'yyyy-MM-dd hh:mm:ss.SS'), '제목', '홍길동'
);
insert into bbs (bbs_num, contents, hit, password, regdate, title, writer) values (
2, '내용', 0, '1234', parsedatetime(sysdate, 'yyyy-MM-dd hh:mm:ss.SS'), '제목', '홍길동'
);
insert into bbs (bbs_num, contents, hit, password, regdate, title, writer) values (
3, '내용', 0, '1234', parsedatetime(sysdate, 'yyyy-MM-dd hh:mm:ss.SS'), '제목', '홍길동'
);
insert into bbs (bbs_num, contents, hit, password, regdate, title, writer) values (
4, '내용', 0, '1234', parsedatetime(sysdate, 'yyyy-MM-dd hh:mm:ss.SS'), '제목', '홍길동'
);
insert into bbs (bbs_num, contents, hit, password, regdate, title, writer) values (
5, '내용', 0, '1234', parsedatetime(sysdate, 'yyyy-MM-dd hh:mm:ss.SS'), '제목', '홍길동'
); */
COMMIT;