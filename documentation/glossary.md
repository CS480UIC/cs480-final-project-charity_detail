## Glossary

# Entities

Entity Name: login_user

Synonyms: account, login, user

Description: A login_user is an account that represents an user of the website. A login_user will consist of an user id, an username, a password, and the user type.

Entity Name: charity_organization

Synonyms: not for profit (NFP), trust

Description: An organization whose goal is to provide services for social well-being.
A charity_organization will have a cause, address where they are located and the amount of donations they have raised.

Entity Name: campaign

Synonyms: mission, movement

Description: Charity organizations can run many campaigns for different intended target_regions. Each campaign will have a name and the time the campaign is ran for (start_date and end_date)

Entity Name: task

Synonyms: job, duty

Description: Campaigns can consist of many different tasks. A task is the service that the campaign seeks to provide. A task will have an id, name, description, and a campaignId that represents the campaign the task is associated with.

Entity Name: task_status

Synonyms: activity, progress

Description: Each task will have one task_status. A task_status will describe the state of an associated task. A task_status will have an id, status, and the number of participants.

Entity Name: donation

Synonyms: contribution, gift, assistance

Description: A donation is made to a charity_organization. A donation will consist of an id, the name of the donor, the id of the charity it is contributing to and the amount of the donation (in USD).

Entity Name: volunteer

Synonyms: participant, social worker

Description: A volunteer can participate in a task. A volunteer is someone who gives their time to a charity_organization. A volunteer will consist of an id, the name of the volunteer, the id of the task they are associated with, and the level of the volunteer.

Entity Name: target_region

Synonyms: demographics, area

Description: Each campaign will be associated with a target_region. The target_region describes the area where the campaign is taking place. A target_region will consist of an id,  the population of the area, and the associated campaign id.

# Relationships

charity_organization_runs_campaign (1(1) to M(0))

campaign_contains_task (1(1) to M(0))

volunteer_assignedto_task (M(0) to 1(0))

donation_contributedto_charity_organization ( M(0) to 1(1))

task_have_task_status (1(1) to 1(1))

campaign_stationedat_target_region (M(1) to M(0))

charity_organization_hasa_login_user (M(1) to 1(1))

donation_hasa_login_user (M(0) to 1(1))

volunteer_hasa_login_user (M(0) to 1(1))

# Attributes

i. login_user : user_id 1-1(1), user_name 1-1(1) ,password 1-1(1), user_type M-1(1)

ii. charity_organization: id 1-1(1), name 1-1(1), cause 1-1(1), address 1-1(0), target_region_id M-1(0)

iii. campaign: id 1-1(1), charity_id M-1(1), name M-1(1), start_date M-1(1), end_date M-1(0), target_region_id M-1(0)

iv. task: id 1-1(1), name M-1(1), campaign_id M-1(1), description M-1(0), number_of_participant M-1(0)  

v. task_status: id 1-1(1), status M-1(1), remark 1-1(0)  

vi. donation: id 1-1(1), donor_name M-1(1), charity_id M-1(1), donation_amount M-1(1)  

vii. volunteer: id 1-1(1), name M-1(1), task_id M-1(1), level M-1(1)  

viii. target_region: id 1-1(1), population M-1(1), region_name 1-1(1)  

# Dependent Entities
charity_organization, target_region

# Independent Entities
campaign, task, volunteer, charity_organization, campaign, login_user, donation


# Dependency Relationships

campaign  dependsOn  charity_organization

donation dependsOn charity_organization

task  dependsOn   campaign

volunteer  dependsOn  tasks

task   dependsOn   task_status

campaign    dependsOn   target_region

login_user dependsOn charity_organization, donation, volunteer

# Supertypes, Subtypes and Partitions

No Supertypes, Subtypes and Partitions in design

# cascade and restrict actions for dependency relationships

campaign    dependsOn   charity_organization :  on delete cascade, on update cascade

donation dependsOn charity_organization : on delete set null , on update cascade

task  dependsOn  campaigns :  on delete cascade , on update cascade

volunteer  dependsOn  task :  on delete cascade , on update cascade

task   dependsOn   task_status :  on delete cascade, on update cascade

campaign    dependsOn   target_region :  on delete set null , on update cascade

login_user dependsOn charity_organization, donation, volunteer on delete cascade , on update cascade


# cascade and restrict rules on foreign keys that implement dependency

campaign foreign key charity_id references charity_organization (id)

doantion foreign key charity_id references charity_organization (id)

task foreign key campaign_id references campaign (id)

volunteer foreign key task_id references task (id)

campaign foreign key target_region_id references target_region (id)

login_user foreign key user_id references charity_organization (id) , donation (id), volunteer (id)

# Attribute types

i. login_user : user_id Integer, user_name varchar(30),password varchar(30), user_type char(1)

ii. charity_organization: id Integer, name varchar(20), cause varchar(40), address varchar(30), target_region_id Integer

iii. campaign: id Integer, charity_id Integer, name varchar(20), start_date Date, end_date Date, target_region_id Integer

iv. task: id Integer, name varchar(20), campaign_id Integer, description varchar(50), number_of_participant Integer  

v. task_status: id Integer, status varchar(10), remark varchar(20)

vi. donation: id Integer, donor_name varchar(20), charity_id varchar(20), donation_amount double 

vii. volunteer: id Integer, name varchar(20), task_id Integer, level varchar(20)  

viii. target_region: id Integer, population Integer, region_name varchar(20) 
