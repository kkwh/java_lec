/* Join: 2개 이상의 테이블에서 검색하는 것.

join 문법:
  (1) ANSI 표준 문법: 
      SELECT 컬럼, ...
      FROM 테이블1
            join 종류 테이블2 on join 조건;    
  (2) Oracle 문법:
      SELECT 컬럼, ...
      FROM 테이블1, 테이블2, ...
      WHERE join 조건;
join 종류 :
    (1) inner join
    (2) outer joim
        - left outer join
        - right outer join
        - full outer join
*/

-- 사번, 이름, 부서번호, 부서이름을 검색. inner join
select e.empno, e.ename, e.deptno, d.dname
from emp e
    inner join dept d on e.deptno = d.deptno;
    
select e.empno, e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;