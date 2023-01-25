/*=======================<< select >>========================*/

select * from student_mst; 

/* 전체 컬럼 조회 */
select
	*
from
	student_mst;
    
/* 저정 컬럼 조회 */
select
	student_id,
    student_name,
    mentor_id
from
	student_mst;

/* 임시 컬럼 추가 */
select
	1 as num,
    '김준일' as name;
    
select
	student_id,
    student_name,
	'김준일' as instructor_name
from	
	student_mst;


/* 컬럼명을 임시로 바꾸는 방법	as(alias) 알리아스 */
select
	sm.student_id as studentId /* java에서 쓸 변수명으로 바꿔주기위해 카멜표기법으로 사용.  //as: 뒷 내용으로 바꾸겠다.*/
from
	student_mst sm;
    
/* 조회조건 where */
/* student_mst에서 어디에? mentor_id에 있는 = 1인 칼럼을 찾아와라 */
/* from 학생 마스터 테이블에서 *안의 값들을 셀렉트 하겠다. from 멘토 마스터에서 where 멘토 네임인 값을 찾아서 셀렉트 메토 아이디를 뽑아네고 = 비교하겠다 셀렉트 멘토 아이디와.*/
select
	*
from
	student_mst
where
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where -- where은 조건식으로 select에서 쓰면 true or false중 true인 값만 출력함.
					mentor_name = '문자영');
				-- mentor_name = '문자영'인 값이 (form)mentor_mst에서 동일한 값만 조회한다.
                    
select 
	student_id,
	student_name,
	mentor_id,
    (select
		mentor_name
	 from 
		mentor_mst 
     where 
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;
    
/* 그룹으로 묶어서 조회하기 (연산 및 통계)*/

select
	count(mentor_id), -- 그룹중 동일한 id값의 총수
    min(student_id), -- 최소값 id값중 가장 낮은 id수
    max(student_id), -- 최대값 id값중 가장 높은 id수
    avg(student_id), -- 그룹중 id값의 평균
    sum(student_id), -- id값의 전체 합산
	mentor_id
from
	student_mst
group by
	mentor_id;
    
/* 그룹으로 조회한 결과에 조건주는 방업 */

select
	count(mentor_id) as mentor_count, -- 그룹중 동일한 id값의 총수 
    min(student_id), -- 최소값 id값중 가장 낮은 id수
    max(student_id), -- 최대값 id값중 가장 높은 id수
    avg(student_id), -- 그룹중 id값의 평균
    sum(student_id), -- id값의 전체 합산
	mentor_id
from
	student_mst
group by
	mentor_id
having -- 그룹을 지어준 다음 그 그룹들에 조건을 걸어서 쓸때 씀.
	mentor_count = 6 ;

/* 정렬 */
select
	*
from
	student_mst
order by -- 정렬이 오름차순
	mentor_id desc, -- 내림차순으로 바꿔줌
    student_id desc; -- 추가로 정렬
    
    
/* 중복제거 */
select distinct
	mentor_id
from
	student_mst;
    

/* 전체 조합 실습 */
select
	count(*) as student_count,
    mentor_id
from
	student_mst
where
	student_id > 2
group by
	mentor_id
having
	student_count = 1
order by
	mentor_id desc;
    /* from where group by having select order by 순서로 읽음 */
