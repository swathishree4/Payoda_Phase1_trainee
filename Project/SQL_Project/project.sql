--Using database
use sample;

--creating the table customer
CREATE TABLE Customer (
    CUSTOMER_ID VARCHAR(25) PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(25),
	AGE INT,
    GENDER VARCHAR(10),
    OCCUPATION VARCHAR(30),
    ANNUAL_INCOME Decimal,
    ADDRESS VARCHAR(255),
    PHONE_NUMBER BIGINT,
    EMAIL_ID VARCHAR(25)
);

--Inserting the values for the table Customer
insert into Customer values('Cust101','Swathi',21,'Female','Software Engineer',300000,'K.P.S Nagar,Thanjavur',8248596247,'swathi@gmail.com');
insert into Customer values('Cust102','Yuvaraj',22,'Male','Doctor',500000,'V.P.N Nagar,Kumbakonam',8248236247,'yuva@gmail.com');
insert into Customer values('Cust103','Sanjeev',24,'Male','Teacher',200000,'kadapa,Andhra',9442683621,'sanjeev@gmail.com');
insert into Customer values('Cust104','Keerthana',25,'Female','Software Developer',600000,'K.P.S Nagar,Coimbatore',3546938329,'Keerthi@gmail.com');
insert into Customer values('Cust105','Tapan',21,'Male','Director',700000,'Periyar Nagar,Chennai',9790467819,'tapan@gmail.com');

--Creating the table Policy
CREATE TABLE Policy_T (
    POLICY_ID VARCHAR(25) PRIMARY KEY, 
	CUSTOMER_ID VARCHAR(25),
    POLICY_NAME VARCHAR(50),
    POLICY_TYPE VARCHAR(30),
    MAX_NO_OF_YEARS INT,
    PREMIUM_RATE decimal,
    MAX_SUM_ASSURED INT
	FOREIGN KEY(CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID),
);

--Inserting the values for the policy customer

insert into Policy_T values('Policy101','Cust101','Life Insurance Plan','Life Insurance',5,0.05,500000);
insert into Policy_T values('Policy102','Cust102','Health Insurance Plan','Health Insurance',7,0.03,300000);
insert into Policy_T values('Policy103','Cust103','Vehicle Insurance Plan','Vehicle Insurance',2,0.08,200000);
insert into Policy_T values('Policy104','Cust104','Life Insurance Plan','Life Insurance',3,0.06,300000);
insert into Policy_T values('Policy105','Cust105','Travel Insurance Plan','Travel Insurance',1,0.04,100000);

--Creating the table for Payment
CREATE TABLE Payment (
    PAYMENT_ID VARCHAR(30) PRIMARY KEY,
    CUSTOMER_ID VARCHAR(25),
    AMOUNT DECIMAL,
    PAYMENT_DATE DATE,
    PAYMENT_MODE VARCHAR(30),
    FOREIGN KEY(CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID),
);

--Inserting the values for the Payment 
insert into Payment values('Pay101','Cust101',1000,'2024-07-23','Gpay');
insert into Payment values('Pay102','Cust102',2000,'2024-06-01','Phonepe');
insert into Payment values('Pay103','Cust103',3000,'2024-05-20','Amazon Pay');
insert into Payment values('Pay104','Cust104',4000,'2024-01-18','Gpay');
insert into Payment values('Pay105','Cust105',5000,'2024-03-23','Phonpe');

--Creating the table for claim
CREATE TABLE Claim (
    CLAIM_ID VARCHAR(30) PRIMARY KEY,
    CUSTOMER_ID VARCHAR(25),
    CLAIM_TYPE VARCHAR(30),
    CLAIM_AMOUNT DECIMAL,
    CLAIM_DATE DATE,
    FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID),   
);

--Inserting the values for the Claim table
insert into Claim values('Claim1','Cust101','Health',550000,'2025-06-03');
insert into Claim values('Claim2','Cust102','Life',350000,'2025-04-01');
insert into Claim values('Claim3','Cust103','Accident',220000,'2025-02-09');
insert into Claim values('Claim4','Cust104','Health',375000,'2025-01-13');
insert into Claim values('Claim5','Cust105','Health',130000,'2025-06-23');

--Retrieve records from the table
select * from Customer;
select * from Payment;
select * from Claim;
select * from Policy_T;

--Filter Records Based on a Condition
select CLAIM_ID from Claim
where CLAIM_DATE>'2025-02-09';

select  CUSTOMER_ID,CUSTOMER_NAME FROM Customer
where ANNUAL_INCOME>200000;

select  MAX_SUM_ASSURED*PREMIUM_RATE*MAX_NO_OF_YEARS AS Claim_Amount from Policy_T
where POLICY_NAME in('Life Insurance Plan');

select AMOUNT from Payment
where PAYMENT_ID like '%01%';

select * from Claim
where CLAIM_AMOUNT between 130000 and 375000;

select * from Customer
where  OCCUPATION='Software Engineer' and CUSTOMER_ID='Cust101';

select * from Customer
where  OCCUPATION='Software Engineer' or CUSTOMER_ID='Cust101';

select * from Customer
where OCCUPATION not in('Software Developer','Director');

--Join Two Tables
select c.CUSTOMER_ID,cc.CLAIM_ID,cc.CLAIM_TYPE,cc.CLAIM_AMOUNT,cc.CLAIM_DATE
from Customer c inner join Claim cc
on c.CUSTOMER_ID=cc.CUSTOMER_ID;

select * from
Customer c left join Payment p
on c.CUSTOMER_ID=p.CUSTOMER_ID;

select * from
Customer c right join Payment p
on c.CUSTOMER_ID=p.CUSTOMER_ID;

--Aggregate Data Using Group By
select POLICY_TYPE,count(CUSTOMER_ID) from Policy_T
group by POLICY_TYPE;

select CLAIM_TYPE,max(CLAIM_AMOUNT)
from Claim
group by CLAIM_TYPE;

select  POLICY_NAME,min(MAX_SUM_ASSURED)
from Policy_T
group by  POLICY_NAME;

--Filter Groups Using HAVING

select POLICY_TYPE,count(CUSTOMER_ID) from Policy_T
group by POLICY_TYPE
having count(CUSTOMER_ID)>1 ;



--Order Results Using ORDER BY
select * from Customer
order by CUSTOMER_ID desc;

--Retrieve Data with a Subquery
select * from policy_T
where MAX_SUM_ASSURED>=
(select MAX_SUM_ASSURED from Policy_T
where POLICY_ID='Policy101');

--Use CASE Statements
select CUSTOMER_ID,CUSTOMER_NAME,case
when ANNUAL_INCOME between 100000 and 300000
then 'Annual Income is between 100000 and 300000'
when  ANNUAL_INCOME between 300000 and 600000
then 'Annual Income is between 300000 and 600000'
else 
'Annual Income is greater than 600000' 
end as Income_level
from Customer;

