# Write your MySQL query statement below
select unique_id, name from employees as a left join employeeuni as u on a.id=u.id 