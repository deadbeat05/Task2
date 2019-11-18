/*Query 1.*/
Select first_name from teacher inner join student_course on course_id = student_id group by course_id having count(student_id )>2000;
/*Query 2. Programming has id 1 in the table "courses"  */
select * from student inner join marks on student.id = marks.student_id where marks.course_id=1 and marks.mark>4 order by student.first_name;
/*Query 3. */
select first_name, last_name, `group`.name, m.mark from `group` inner join student s on `group`.id = s.id_group inner join marks m on s.id = m.student_id group by m.student_id having avg(m.mark) =5