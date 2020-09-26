select * from plan;
drop table plan cascade constraints;

create table plan
(ID varchar2(16),
do_date date default SYSDATE not null,
alarm varchar2(10) default '2100' not null,
do_list1 varchar2(150),
success1 number(10),
book_name varchar2(70),
page varchar2(70),
success number(10),
mission_score number(20),
constraints plan_iddate_pk primary key(ID,do_date),
constraints plan_id_fk foreign key(ID) references mmember(ID),
constraints plan_date_uk Unique(do_date)
);

select * from plan order by do_date desc;