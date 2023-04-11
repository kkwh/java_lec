/*
SQL 종류ㅣ
1. DQL(Data Query Language): 데이터 질의 언어. select 문장.
2. DML(Data Manipulation Language): 데이터 조작 언어
    - insert, update, delete.
    - 테이블에 행(row)을 추가, 변경, 삭제하는 SQL 문장.
3. DDL(Data Definition Language): 데이터 정의 선언.
    - create, alter, truncate, drop.
    - 테이블, 사용자 계정을 생성, 변경, 삭제하는 SQL 문장.
4. TCL(Transaction Control Language): 트랜잭션 관리(제어) 문장.
    - commit: 데이터베이스의 변경 내용을 영구 저장.
    - rollback: 직전의 commit 상태로 되돌리기.
*/

/*
테이블 생성:
create table 테이블이름 (
    컬럼이름 데이터타입 [제약조건, 기본값],
    ...
);

데이터 타입의 이름(키워드)은 데이터베이스 종류에 따라서 다름!
Oracle의 데이터 타입: number, varchar2, date, timestamp, clob, blob
*/

/*
테이블 이름: students
컬럼:
    - stuno: 학생 아이디. 학번. 숫자(6자리 정수).
    - stuname: 학생 이름. 문자열(10글자).
    - birthday: 학생 생일. 날짜. 
*/
create table students (
    stuno     number(6),
    stuname   varchar2(10 char),
    birthday  date
);

/*
테이블에 행(row) 추가(삽입):
insert into 테이블 (컬럼1, 컬럼2, ...) values (값1, 값2, ...);

insert into 테이블 values(값1, ...);
- values에서 나열하는 값의 개수는 테이블의 컬럼 수와 같아야, 값의 순서는 컬럼의 순서와 같아야 함.
*/

insert into students
values (1, '홍길동', '2023/04/11');

insert into students
values (2, '홍길동'); 
--SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다

insert into students
values (2, '홍길동', null);

insert into students(stuno, stuname)
values (3, '홍길동');

insert into students
values ('홍길동', 4, to_date('2000/01/01'));
-- ORA-01722: 수치가 부적합합니다

insert into students(stuname, stuno, birthday)
values ('김길동', 4, to_date('2000/01/01'));

insert into students (stuno)
values (1234567); -- 컬럼 자릿수보다 더 큰 수를 insert하려는 에러.
-- ORA-01438: 이 열에 대해 지정된 전체 자릿수보다 큰 값이 허용됩니다

insert into students (stuname)
values('abcdefghijk');
-- ORA-12899: "SCOTT"."STUDENTS"."STUNAME" 열에 대한 값이 너무 큼(실제: 11, 최대값: 10)

select * from students;

commit; -- 현재까지 작업 내용을 DB에 영구 저장.

-- 테이블 생성할 때 컬럼의 기본값 설정하기:

