# Write your MySQL query statement below
SELECT event_day as day, emp_id,SUM(out_time-in_time) as total_time
From Employees
Group by day, emp_id