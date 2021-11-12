CREATE PROCEDURE BIG_DONATORS_EMAILS(IN filteramount integer)
BEGIN
    SELECT user.email
    FROM donation
    inner join user
    on user.id = donation.id
    where donation.donation_amount>filteramount;
END

CREATE PROCEDURE NO_UNIQUE_DONORS(OUT donor_count integer)
BEGIN
	SELECT COUNT(DISTINCT ID)
    INTO donor_count
    FROM DONATION;
END

CREATE  FUNCTION CAMPAIGN_TOTAL_DONATION(campaignid INTEGER) RETURNS float
    READS SQL DATA
BEGIN
    DECLARE total FLOAT;
    SELECT SUM(donation_amount)
    INTO total
    FROM donation
    WHERE charity_id=campaignid;
    RETURN total;

END

CREATE FUNCTION `FUTURE_EVENTS_COUNT`() RETURNS int
    READS SQL DATA
BEGIN
    DECLARE ct INTEGER;
    SELECT COUNT(*)
    INTO ct
    FROM campaign
    WHERE start_date>CURRENT_DATE();
    RETURN ct;
END