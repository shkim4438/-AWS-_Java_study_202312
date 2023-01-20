/*
	DML
    C: insert / into	데이터 추가
    R: select / from	데이터 조회	 ~에서 선택, 가져 오겠다
	U: update / set		데이터 수정
    D: delete / from	데이터 삭제
*/

/*===================<< insert >>==========================*/

insert into
	`db_study2_explain`.`student_mst` 	/* 콘솔창에서 접근할때 db명을 입력해 원하는곳에 참조하여 접근해주는 문법 */
    (`student_id`, `student_name`, `mentor_id`)		/* 작성순서대로 values값을 나열해야 적용이됨 '순서중요' */
values(4, '손지호', 2);

insert into
	`db_study2_explain`.`student_mst`
    (`student_id`, `student_name`)
values(5, '서태웅');
select * from student_mst;


insert into student_mst
	(`student_id`, `student_name`, `mentor_id`)	
values
	(7, 			'이강인',			10),
	(8, 			'이과인', 		10),
	(9, 			'알론소', 		10),
	(10, 			'세스크',			10);
select * from student_mst;

insert into university_mst
	(`university_id`, `university_name`)
values
	(4, 				'호서대'),
	(5, 				'인하대'),
	(6,					'강원대');
select * from university_mst;


/*=======================<< update >>========================*/

update student_mst	/* 값을 수정하기 위해 씀. */
set
	student_name = '화이트',
	mentor_id = 15
where
	student_id = 5;
select * from student_mst;

/* 멘토아이디 10안 헉샹들의 메토 아이디를 1로 바꿔*/

update student_mst	/* student_mst에서 (set) mentor_id에 1값을 넣어라 어디에? mentor_id에다가*/
set /* set에서 =은 대입*/
	mentor_id = 1
where/* =: equals*/
	mentor_id = 10;
select * from student_mst;

/*=======================<< delete >>========================*/
/*	delete from student_mst -> 안에 있는값 다날라감*/
delete 
from 
	student_mst 
where 
	student_id = 4
and student_name = '손지호';
select * from student_mst;

delete
from
	university_mst
where
	university_id = 4
and university_name = '호서대';
select * from university_mst;

