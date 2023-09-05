# Write your MySQL query statement below
select w.id from weather as w, weather as y where datediff(w.recordDate,y.recordDate)=1 and w.temperature>y.temperature