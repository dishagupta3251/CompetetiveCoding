# Write your MySQL query statement below
Select firstname, lastname, city, state from person as p LEFT JOIN address as a ON p.personId=a.personId