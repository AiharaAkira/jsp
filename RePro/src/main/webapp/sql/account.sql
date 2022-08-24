--유저
create table account(
u_id varchar2(200 char) primary key,
u_pw varchar2(20 char) not null,
u_name varchar2(20 char) not null,
u_nickname varchar2(200 char) not null,
u_profileImg varchar2(1000 char) not null,
u_typeOfManager varchar2(200 char) not null,
u_date date not null
);

insert into account values('아이디', '비번', '이름', '닉네임', '사진.jpg', '0', sysdate);

select * from account;