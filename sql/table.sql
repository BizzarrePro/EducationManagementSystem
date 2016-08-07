prompt PL/SQL Developer import file
prompt Created on 2016年8月7日 by Aiyawocao
set feedback off
set define off
prompt Creating TEACHER_ATTR...
create table TEACHER_ATTR
(
  tea_num         VARCHAR2(10) not null,
  tea_name        VARCHAR2(10) not null,
  tea_sex         VARCHAR2(2) not null,
  tea_age         NUMBER(3) not null,
  tea_birth       DATE not null,
  tea_minority    VARCHAR2(8) not null,
  tea_degree      VARCHAR2(5) not null,
  tea_pro_title   VARCHAR2(5) not null,
  tea_contact_way VARCHAR2(15),
  tea_password    VARCHAR2(15) default (123456),
  type            NUMBER(1) default (0) not null
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table TEACHER_ATTR
  is 'Teacher attributes';
comment on column TEACHER_ATTR.tea_num
  is 'Number of teacher';
comment on column TEACHER_ATTR.tea_name
  is 'Name of teacher';
comment on column TEACHER_ATTR.tea_sex
  is 'Sex of teacher';
comment on column TEACHER_ATTR.tea_age
  is 'Age of teacher';
comment on column TEACHER_ATTR.tea_birth
  is 'Birth date of teacher | Format: XXXX-XX-XX';
comment on column TEACHER_ATTR.tea_minority
  is 'Minority of teacher';
comment on column TEACHER_ATTR.tea_degree
  is 'Degree of teacher';
comment on column TEACHER_ATTR.tea_pro_title
  is 'Professional title of teacher';
comment on column TEACHER_ATTR.tea_contact_way
  is 'Contact way of teacher';
alter table TEACHER_ATTR
  add constraint PK_TEACHER_NUM primary key (TEA_NUM)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table TEACHER_ATTR
  add constraint TEA_AGE_CHECK
  check (TEA_AGE > 15 AND TEA_AGE < 200);
alter table TEACHER_ATTR
  add constraint TEA_CONTACT_CHECK
  check (regexp_like(TEA_CONTACT_WAY, '^*{6,20}$'));
alter table TEACHER_ATTR
  add constraint TEA_DEGREE_CHECK
  check (TEA_DEGREE IN ('大专', '学士', '硕士', '博士'));
alter table TEACHER_ATTR
  add constraint TEA_NUM_CHECK
  check (regexp_like(TEA_NUM, '^[0-9]{6}$'));
alter table TEACHER_ATTR
  add constraint TEA_SEX_CHECK
  check (TEA_SEX IN ('男', '女'));
alter table TEACHER_ATTR
  add constraint TEA_TYPE_CHECK
  check (TYPE IN ('0', '1'));

prompt Creating COURSE_ATTR...
create table COURSE_ATTR
(
  cour_num         VARCHAR2(20) not null,
  cour_name        VARCHAR2(15) not null,
  cour_limited_num NUMBER(4) not null,
  cour_start_date  DATE not null,
  tea_num          VARCHAR2(20) not null,
  cour_credits     NUMBER(2) not null,
  cour_type        VARCHAR2(10) not null,
  choosed_num      NUMBER(3) default (0),
  course_semester  NUMBER(2)
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table COURSE_ATTR
  is 'Course attribute';
alter table COURSE_ATTR
  add constraint PK_COURSE_NUM primary key (COUR_NUM)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table COURSE_ATTR
  add constraint FK_TEACHER_NUM foreign key (TEA_NUM)
  references TEACHER_ATTR (TEA_NUM) on delete set null;
alter table COURSE_ATTR
  add constraint COUR_CREDITS_CHECK
  check (COUR_CREDITS<8 AND COUR_CREDITS > 0);
alter table COURSE_ATTR
  add constraint COUR_LIMITED_CHECK
  check (COUR_LIMITED_NUM < 500 AND COUR_LIMITED_NUM > 0);
alter table COURSE_ATTR
  add constraint COUR_NUM_CHECK
  check (COUR_NUM='[[:digit:]]{3}');
alter table COURSE_ATTR
  add constraint COUR_TYPE_CHECK
  check (COUR_TYPE IN ('必修', '选修'));

prompt Creating STUDENT_ATTR...
create table STUDENT_ATTR
(
  stu_num              VARCHAR2(20) not null,
  stu_name             VARCHAR2(10) not null,
  stu_sex              VARCHAR2(8) not null,
  stu_age              NUMBER(3) not null,
  stu_birth            DATE not null,
  stu_minority         VARCHAR2(10) not null,
  stu_root             VARCHAR2(20) not null,
  stu_academy          VARCHAR2(20) not null,
  stu_major            VARCHAR2(20) not null,
  stu_class            VARCHAR2(2) not null,
  stu_political_status VARCHAR2(10) not null,
  stu_enrollment_date  DATE not null,
  stu_contact_way      VARCHAR2(15) default (null),
  semester             NUMBER(2) default (1),
  password             VARCHAR2(15) default (123456)
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on column STUDENT_ATTR.stu_num
  is 'Number of student';
comment on column STUDENT_ATTR.stu_name
  is 'Name of student';
comment on column STUDENT_ATTR.stu_sex
  is 'Sex of student';
comment on column STUDENT_ATTR.stu_age
  is 'Age of student';
comment on column STUDENT_ATTR.stu_birth
  is 'Birth date of student| The fomat of date:xxxx-xx-xx';
comment on column STUDENT_ATTR.stu_minority
  is 'Minority of student';
comment on column STUDENT_ATTR.stu_root
  is 'Root province of student';
comment on column STUDENT_ATTR.stu_academy
  is 'Academy of student';
comment on column STUDENT_ATTR.stu_major
  is 'Major of student';
comment on column STUDENT_ATTR.stu_class
  is 'Class of student';
comment on column STUDENT_ATTR.stu_political_status
  is 'Political status of student';
comment on column STUDENT_ATTR.stu_enrollment_date
  is 'Date of enrollment of sudent';
comment on column STUDENT_ATTR.stu_contact_way
  is 'Contact way of student';
alter table STUDENT_ATTR
  add constraint PK_STU primary key (STU_NUM)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table STUDENT_ATTR
  add constraint STU_AGE_CHECK
  check (STU_AGE >5 AND STU_AGE<200);
alter table STUDENT_ATTR
  add constraint STU_CONTACT_CHECK
  check (regexp_like(STU_CONTACT_WAY, '^*{6,20}$'));
alter table STUDENT_ATTR
  add constraint STU_NUM_CHECK
  check (regexp_like(STU_NUM, '^[0-9]{12}$'));
alter table STUDENT_ATTR
  add constraint STU_PASSWORD_CHECK
  check (regexp_like(PASSWORD, '^[a-zA-Z0-9]{6,15}$'));
alter table STUDENT_ATTR
  add constraint STU_POLITICAL_CHECK
  check (STU_POLITICAL_STATUS IN ('党员','预备党员', '共青团员', '无党派人士','群众'));
alter table STUDENT_ATTR
  add constraint STU_SEX_CHECK
  check (STU_SEX IN ('男','女'));

prompt Creating COURSE_SELECTION...
create table COURSE_SELECTION
(
  stu_num  VARCHAR2(20) not null,
  cour_num VARCHAR2(20) not null,
  tea_num  VARCHAR2(10) not null
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on table COURSE_SELECTION
  is 'Course selection table';
alter table COURSE_SELECTION
  add constraint FK_COUR_SEL_NUM foreign key (COUR_NUM)
  references COURSE_ATTR (COUR_NUM) on delete set null;
alter table COURSE_SELECTION
  add constraint FK_STU_SEL_NUM foreign key (STU_NUM)
  references STUDENT_ATTR (STU_NUM) on delete cascade;
alter table COURSE_SELECTION
  add constraint FK_TEA_SEL_NUM foreign key (TEA_NUM)
  references TEACHER_ATTR (TEA_NUM) on delete set null;

prompt Creating EXAM_ARRANGEMENT...
create table EXAM_ARRANGEMENT
(
  cour_num  VARCHAR2(20) not null,
  exam_addr VARCHAR2(30) not null,
  seat_id   NUMBER(3) not null,
  stu_num   VARCHAR2(20) not null,
  exam_time VARCHAR2(20) not null
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table EXAM_ARRANGEMENT
  is 'Arrangement table of final exam ';
comment on column EXAM_ARRANGEMENT.seat_id
  is 'Identify of seat in the exam';
comment on column EXAM_ARRANGEMENT.exam_time
  is 'Time of exam';
alter table EXAM_ARRANGEMENT
  add constraint FK_COURSE_NUM foreign key (COUR_NUM)
  references COURSE_ATTR (COUR_NUM) on delete cascade;
alter table EXAM_ARRANGEMENT
  add constraint FK_STUDENT_NUM foreign key (STU_NUM)
  references STUDENT_ATTR (STU_NUM) on delete cascade;
alter table EXAM_ARRANGEMENT
  add constraint SEAT_ID_CHECK
  check (SEAT_ID > 0);

prompt Creating STUDENT_SCORE...
create table STUDENT_SCORE
(
  stu_num  VARCHAR2(20) not null,
  cour_num VARCHAR2(10) not null,
  semester NUMBER(2) not null,
  score    NUMBER(2)
)
tablespace EDU_MANAGE_INFO
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on table STUDENT_SCORE
  is 'Student score';
alter table STUDENT_SCORE
  add constraint FK_SCORE_COUR_NUM foreign key (COUR_NUM)
  references COURSE_ATTR (COUR_NUM);
alter table STUDENT_SCORE
  add constraint FK_SCORE_STU_NUM foreign key (STU_NUM)
  references STUDENT_ATTR (STU_NUM);

prompt Disabling triggers for TEACHER_ATTR...
alter table TEACHER_ATTR disable all triggers;
prompt Disabling triggers for COURSE_ATTR...
alter table COURSE_ATTR disable all triggers;
prompt Disabling triggers for STUDENT_ATTR...
alter table STUDENT_ATTR disable all triggers;
prompt Disabling triggers for COURSE_SELECTION...
alter table COURSE_SELECTION disable all triggers;
prompt Disabling triggers for EXAM_ARRANGEMENT...
alter table EXAM_ARRANGEMENT disable all triggers;
prompt Disabling triggers for STUDENT_SCORE...
alter table STUDENT_SCORE disable all triggers;
prompt Disabling foreign key constraints for COURSE_ATTR...
alter table COURSE_ATTR disable constraint FK_TEACHER_NUM;
prompt Disabling foreign key constraints for COURSE_SELECTION...
alter table COURSE_SELECTION disable constraint FK_COUR_SEL_NUM;
alter table COURSE_SELECTION disable constraint FK_STU_SEL_NUM;
alter table COURSE_SELECTION disable constraint FK_TEA_SEL_NUM;
prompt Disabling foreign key constraints for EXAM_ARRANGEMENT...
alter table EXAM_ARRANGEMENT disable constraint FK_COURSE_NUM;
alter table EXAM_ARRANGEMENT disable constraint FK_STUDENT_NUM;
prompt Disabling foreign key constraints for STUDENT_SCORE...
alter table STUDENT_SCORE disable constraint FK_SCORE_COUR_NUM;
alter table STUDENT_SCORE disable constraint FK_SCORE_STU_NUM;
prompt Deleting STUDENT_SCORE...
delete from STUDENT_SCORE;
commit;
prompt Deleting EXAM_ARRANGEMENT...
delete from EXAM_ARRANGEMENT;
commit;
prompt Deleting COURSE_SELECTION...
delete from COURSE_SELECTION;
commit;
prompt Deleting STUDENT_ATTR...
delete from STUDENT_ATTR;
commit;
prompt Deleting COURSE_ATTR...
delete from COURSE_ATTR;
commit;
prompt Deleting TEACHER_ATTR...
delete from TEACHER_ATTR;
commit;
prompt Loading TEACHER_ATTR...
insert into TEACHER_ATTR (tea_num, tea_name, tea_sex, tea_age, tea_birth, tea_minority, tea_degree, tea_pro_title, tea_contact_way, tea_password, type)
values ('120001', '殷树', '男', 37, to_date('01-08-1974', 'dd-mm-yyyy'), '苗', '博士', '教授', '13523563246', '12345678', 0);
insert into TEACHER_ATTR (tea_num, tea_name, tea_sex, tea_age, tea_birth, tea_minority, tea_degree, tea_pro_title, tea_contact_way, tea_password, type)
values ('120002', '王东', '男', 45, to_date('15-11-1976', 'dd-mm-yyyy'), '汉', '博士', '教授', '13423124123', '12345678', 0);
commit;
prompt 2 records loaded
prompt Loading COURSE_ATTR...
prompt Table is empty
prompt Loading STUDENT_ATTR...
insert into STUDENT_ATTR (stu_num, stu_name, stu_sex, stu_age, stu_birth, stu_minority, stu_root, stu_academy, stu_major, stu_class, stu_political_status, stu_enrollment_date, stu_contact_way, semester, password)
values ('201308010301', '刘晓旭', '男', 21, to_date('01-07-1994', 'dd-mm-yyyy'), '汉', '河北', '土木工程院', '给排水工程', '3', '党员', to_date('01-09-2013', 'dd-mm-yyyy'), '13454215878', 1, '123456789');
insert into STUDENT_ATTR (stu_num, stu_name, stu_sex, stu_age, stu_birth, stu_minority, stu_root, stu_academy, stu_major, stu_class, stu_political_status, stu_enrollment_date, stu_contact_way, semester, password)
values ('201308010302', '周淳轩', '女', 21, to_date('01-08-1994', 'dd-mm-yyyy'), '满', '辽宁', '信息科学与工程院', '计算机科学技术', '3', '群众', to_date('01-09-2013', 'dd-mm-yyyy'), '14134531654', 1, '123456789');
insert into STUDENT_ATTR (stu_num, stu_name, stu_sex, stu_age, stu_birth, stu_minority, stu_root, stu_academy, stu_major, stu_class, stu_political_status, stu_enrollment_date, stu_contact_way, semester, password)
values ('201308010304', '陈敏军', '男', 22, to_date('13-12-1995', 'dd-mm-yyyy'), '汉', '江苏', '信息科学与工程学院', '计算机科学与技术', '3', '党员', to_date('01-09-2013', 'dd-mm-yyyy'), '13234235234', 0, '123456');
commit;
prompt 3 records loaded
prompt Loading COURSE_SELECTION...
prompt Table is empty
prompt Loading EXAM_ARRANGEMENT...
prompt Table is empty
prompt Loading STUDENT_SCORE...
prompt Table is empty
prompt Enabling foreign key constraints for COURSE_ATTR...
alter table COURSE_ATTR enable constraint FK_TEACHER_NUM;
prompt Enabling foreign key constraints for COURSE_SELECTION...
alter table COURSE_SELECTION enable constraint FK_COUR_SEL_NUM;
alter table COURSE_SELECTION enable constraint FK_STU_SEL_NUM;
alter table COURSE_SELECTION enable constraint FK_TEA_SEL_NUM;
prompt Enabling foreign key constraints for EXAM_ARRANGEMENT...
alter table EXAM_ARRANGEMENT enable constraint FK_COURSE_NUM;
alter table EXAM_ARRANGEMENT enable constraint FK_STUDENT_NUM;
prompt Enabling foreign key constraints for STUDENT_SCORE...
alter table STUDENT_SCORE enable constraint FK_SCORE_COUR_NUM;
alter table STUDENT_SCORE enable constraint FK_SCORE_STU_NUM;
prompt Enabling triggers for TEACHER_ATTR...
alter table TEACHER_ATTR enable all triggers;
prompt Enabling triggers for COURSE_ATTR...
alter table COURSE_ATTR enable all triggers;
prompt Enabling triggers for STUDENT_ATTR...
alter table STUDENT_ATTR enable all triggers;
prompt Enabling triggers for COURSE_SELECTION...
alter table COURSE_SELECTION enable all triggers;
prompt Enabling triggers for EXAM_ARRANGEMENT...
alter table EXAM_ARRANGEMENT enable all triggers;
prompt Enabling triggers for STUDENT_SCORE...
alter table STUDENT_SCORE enable all triggers;
set feedback on
set define on
prompt Done.
