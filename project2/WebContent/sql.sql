
create table board(
	num number,
	title varchar2(200),
	writer varchar2(200),
	fileName varchar2(200),
	content varchar2(1000),
	day date
)



create sequence num start with 1 increment by 1;

insert into board values(num.nextval, '좋은점심', '김현진',NULL,'좋은점심입니다 하하핫',sysdate)

insert into board values(num.nextval, '여러분~~지문찍으세요~', '손지영',NULL,'제발~ 지문좀 찍으세요',sysdate)

select * from board;

delete board;