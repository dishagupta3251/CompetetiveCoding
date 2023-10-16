# Write your MySQL query statement below
select x,y,z, if(ABS(x+y)>ABS(z) and ABS(y+z)>ABS(x) and ABS(x+z)>ABS(y) ,"Yes","No") as triangle from triangle