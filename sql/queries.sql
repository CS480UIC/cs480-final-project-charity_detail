create view ongroundcharity as
Select name,cause,target_region_id from charity_organization where target_region_id is not null order by id;

create view finishedcampaigns as
Select name,charity_id,target_region_id,start_date,end_date from campaign where end_date is not null and start_date > '2000-01-01' order by id;

create view taskvolunteers as
Select campaign_id,sum(number_of_participants) as total_volunteers from task group by campaign_id having sum(number_of_participants) > 1 ;

create view hungercampaigns as
Select name,charity_id,target_region_id,start_date,end_date from campaign where SUBSTRING(name,1,20) like '%Hunger%' and year(start_date) < 2022;

create view activecampaigns as 
Select co.id, co.name,cause,co.target_region_id 
from charity_organization co
where exists(
Select co.id, co.name,cause,co.target_region_id 
from charity_organization co
join campaign c
on co.id = c.charity_id);

create view donationsummary as 
Select * from charity_organization co 
where exists
( Select co.id, co.name,cause,sum(donation_amount) 
from charity_organization co 
join donation c 
on co.id = c.charity_id 
group by co.id, co.name,cause );
