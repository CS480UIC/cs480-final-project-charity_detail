Entity Name: charity_organization

Synonyms: Not For Profit (NFP), trust

Description: An organization whose goal is to provide services for social well-being.
A charity_organization will have a cause, address where they are located and the amount of donations they have raised.

Entity Name: Campaign

Synonyms: Mission, Movement

Description: Charity organizations can run many campaigns for different intended target_regions. Each campaign will have a name and the time the campaign is ran for (start_date and end_date)

Entity Name: Task

Synonyms: Job, duty

Description: Campaigns can consist of many different tasks. A task is the service that the campaign seeks to provide. A task will have an id, name, description, and a campaignId that represents the campaign the task is associated with.

Entity Name: task_status

Synonyms: activity, progress

Description: Each task will have one task_status. A task_status will describe the state of an associated task. A task_status will have an id, status, and the number of participants.

Entity Name: Donation

Synonyms: contribution, gift, assistance

Description: A donation is made to a charity_organization. A donation will consist of an id, the name of the donor, the id of the charity it is contributing to and the amount of the donation (in USD).

Entity Name: Volunteer

Synonyms: participant, social worker

Description: A volunteer can participate in a task. A volunteer is someone who gives their time to a charity_organization. A volunteer will consist of an id, the name of the volunteer, the id of the task they are associated with, and the level of the volunteer.

Entity Name: target_region

Synonyms: demographics, area

Description: Each campaign will be associated with a target_region. The target_region describes the area where the campaign is taking place. A target_region will consist of an id,  the population of the area, and the associated campaign id.

