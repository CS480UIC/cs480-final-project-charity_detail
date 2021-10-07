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

campaigns_contains_tasks (1(1) to M(0))

volunteers_assignedto_tasks (M(0) to 1(0))

donations_contributedto_charities ( M(0) to 1(1))

tasks_have_task_status ( 1(1) to 1(1))

campaign_stationedat_target_region (M(0) to M(1))

organization_hasa_login_user (M(1) to 1(1))

donor_hasa_login_user (M(0) to 1(1))

volunteer_hasa_login_user (M(0) to 1(1))

# Attributes

i. login_user : user_id 1-1(1), user_name 1-1(1) ,password 1-1(1), user_type M-1(1)

ii. charity_organization: id 1-1(1), name 1-1(1), cause 1-1(1), address 1-1(0), donation_raised M-1(0)

iii. campaign: id 1-1(1), charity_id M-1(1), name M-1(1), start_date M-1(1), end_date M-1(0)

iv. task: id 1-1(1), name M-1(1), campaign_id M-1(1), description M-1(0)

v. task_status: id 1-1(1), status M-1(1), number_of_participant M-1(0)

vi. donation: id 1-1(1), donor_name M-1(1), charity_id M-1(1), donation_amount M-1(1)

vii. volunteer: id 1-1(1), name M-1(1), task_id M-1(1), level M-1(1)

viii. target_region: id 1-1(1), population M-1(1), campaign_id M-1(1), region_name 1-1(1)

