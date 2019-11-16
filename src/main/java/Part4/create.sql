drop database if exists university;
create database if not exists university;
use university;

/*create table course*/
create table course
(
  id int auto_increment primary key ,
  course_title varchar(30) not null
);

create unique index course_course_title_uindex
  on course (course_title);

create unique index course_id_uindex
  on course (id);

/* create table student*/
create table student
(
  id int auto_increment primary key ,
  first_name varchar(15) not null,
  last_name varchar(30) not null,
  id_group int not null
);

create unique index student_id_uindex
  on student (id);

/*create table teacher*/
create table teacher
(
  id int auto_increment primary key ,
  first_name varchar(10) not null,
  last_name varchar(30) not null,
  email varchar(15) not null
);

create unique index teacher_email_uindex
  on teacher (email);

create unique index teacher_id_uindex
  on teacher (id);

/*create table marks*/
create table marks
(
  course_id int not null,
  student_id int not null,
  mark int not null,
  constraint marks_course_id_fk
    foreign key (course_id) references course (id),
  constraint marks_student_id_fk
    foreign key (student_id) references student (id)
);

/*create table group*/
create table `group`
(
  id int auto_increment primary key ,
  name varchar(10) not null
);

create unique index group_id_uindex
  on `group` (id);

create unique index group_name_uindex
  on `group` (name);

/*create table for the ratio of teacher and course*/
create table course_teacher
(
  course_id int not null,
  teacher_id int not null,
  constraint course_teacher_course_id_fk
    foreign key (course_id) references course (id),
  constraint course_teacher_teacher_id_fk
    foreign key (teacher_id) references teacher (id)
);

create unique index course_teacher_course_id_uindex
  on course_teacher (course_id);

/*create table for ratio student and course*/
create table student_course
(
  student_id int not null,
  course_id int not null,
  constraint student_course_course_id_fk
    foreign key (course_id) references course (id),
  constraint student_course_student_id_fk
    foreign key (student_id) references student (id)
);

/*foreign key for student group*/
alter table student
  add constraint student_group_id_fk
    foreign key (id_group) references `group` (id);