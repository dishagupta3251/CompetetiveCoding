# Write your MySQL query statement below
Select date_id,make_name, Count(distinct lead_id) as unique_leads, Count(distinct partner_id) as unique_partners from dailysales group by  date_id,make_name