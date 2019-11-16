/*Query 1.*/

/*Query 2. Programming has id 1 in the table "courses"  */
select * from student inner join marks on student.id = marks.student_id where marks.course_id=1 and marks.mark>4 order by student.first_name;