-- 치킨 주문 분석:

-- 1. https://github.com/JakeOh/20230228_itwill_java140_lab_java/blob/master/lab-oracle/call_chicken.csv
-- 파일의 내용을 저장할 수 있는 테이블을 생성하는 SQL 문을 작성하세요.
-- CSV(comma-separated values) 파일:
-- 행의 데이터들을 쉼표(,)로 구분해서 표 형태의 데이터를 저장한 텍스트 파일.
-- 일반적으로는 구분자로 쉼표(comma)를 많이 사용하지만, 쉼표 이외의 다른 구분자를 사용하기도 함.
-- 다른 종류의 컴퓨터(OS)들 간에 테이블 형태의 데이터들을 주고받을 때 많이 사용하는 파일 형식.
create table call_chicken(
    call_date date,
    call_day varchar2(1 char),
    district varchar2(4 char),
    ages varchar2(5 char),
    gender varchar2(1 char),
    calls number(4)
);

-- 2. SQLDeveloper에서 '데이터 임포트' 기능을 사용해서 CSV 파일의 내용을 테이블에 저장하세요.
--> 접속 창 -> 계정(Scott) -> 테이블 -> CALL_CHICKEN -> 오른쪽 클릭

-- 3. 통화건수의 최솟값, 최댓값을 찾으세요.
select max(calls), min(calls)
from chicken;

-- 4. 통화건수가 최솟값이거나 최댓값인 레코드(행 전체)를 출력하세요.
select *
from chicken
where calls = (
    select max(calls)
    from chicken
) or
    calls = (
    select min(calls)
    from chicken
);

select *
from chicken
where calls 
in ((
    select max(calls)
    from chicken
),
    (
    select min(calls)
    from chicken
));

-- 5. 평균적으로 어떤 요일에서 치킨 주문이 많을까요? ?
select day, round(avg(calls), 2) "통화건수"
from chicken
group by day
order by "통화건수" desc;

-- 6. 평균적으로 어떤 연령대가 치킨 주문을 많이 할까요?
select age, round(avg(calls), 2) "통화건수"
from chicken
group by age
order by "통화건수" desc;

-- 7. 평균적으로 어느 지역에서 치킨 주문을 많이 할까요?
select location , round(avg(calls), 2) "통화건수"
from chicken
group by location
order by "통화건수" desc;

-- 8. 치킨 주문에 성별 차이가 있을까요?
select gender, round(avg(calls), 2) "통화건수"
from chicken
group by gender
order by gender;

-- 9. 요일별, 연령대별 통화건수의 평균을 찾으세요.
select day, age, round(avg(calls), 2) "통화건수"
from chicken
group by day, age
order by "통화건수" desc;;

-- 10. 구별, 성별 통화건수의 평균을 찾으세요.
select location, gender, round(avg(calls), 2) "통화건수"
from chicken
group by location, gender
order by "통화건수" desc;

-- 11. 요일별, 구별, 연령대별 통화건수의 평균을 찾으세요.
select day, location, age, round(avg(calls), 2) "통화건수"
from chicken
group by day, location, age
order by "통화건수" desc;



-- 3 ~ 11 문제의 출력은 통화건수 평균의 내림차순 정렬, 소숫점 2자리까지 반올림.