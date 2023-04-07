/*
* Block comment
*/

-- inline comment
-- SQL 문장은 세미콜론(;)으로 끝남.
-- Ctrl+Enter: 현재 커서가 있는 위치의 SQL 한 문장을 실행.
-- F5: 스크립트(확장자가 SQL인 파일) 전체를 실행.

select sysdate from dual;

-- EMP 테이블의 모든 내용을 검색
select * from emp;

-- SQL 명령어(키워드), 테이블 이름, 컬럼 이름은 대/소문자를 구분하지 않음.
SELECT * FROM EMP;