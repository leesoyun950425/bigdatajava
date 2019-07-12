create table member(
	id varchar2(20),
	pw varchar2(20),
	name varchar2(20),
	tel varchar2(20)
)
-- 블록 후, alt + x
insert into member values('park','park','park','park')
insert into member values('kim','kim','kim','kim')
insert into member values('lee','lee','lee','lee')

select * from member