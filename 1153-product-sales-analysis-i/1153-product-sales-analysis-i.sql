# Write your MySQL query statement below
Select product_name, year, price from Sales as s INNER JOIN Product as p WHERE s.product_id=p.product_id
