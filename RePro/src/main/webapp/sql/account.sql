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

--암호화를 위한 비밀번호 최대값변경

ALTER TABLE account MODIFY(u_pw varchar2(1000char));

select * from account;