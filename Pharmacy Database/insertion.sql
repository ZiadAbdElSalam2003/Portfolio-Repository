# insertion
use pharmacy;
#insertion for the doctor 
insert into Doctor (first_name,last_name,phone) values ('ali','ahmed','01055598431') ;
insert into Doctor (first_name,last_name,phone) values ('rami','sabry','01247453071') ;
insert into doctor(first_name,last_name,phone)values('wael','mohamed','01202020120'); 
select *from Doctor;

#insertion for the patient
insert into patient (first_name,last_name,street,city,country) values('mahmoud','saad','el horia','alex','egypt');
insert into patient (first_name,last_name,street,city,country) values('ahmed','sameh','el mosher','alex','egypt');
select *from patient;

#insertion patient phone 
insert into patient_phones(patient_id,phone) values(1,'01225730585');
insert into patient_phones(patient_id,phone) values(2,'01555224989');
select *from patient_phones;

#insertion for the employee
insert into employee(first_name,last_name,street,city,country,phone,manager) values('omar','amir','sief street','alex','egypt','01510010338','1');
insert into employee(first_name,last_name,street,city,country,phone,manager) values('abdelrahman','zayed','el nasr street','alex','egypt','01120010338','1');
insert into employee (first_name,last_name,street,city,country,phone,manager)values('salma','fahmy','elnasr','alex','egypt','01202051655','1');
insert into employee (first_name,last_name,street,city,country,phone,manager)values('nour','mohamed','45 street','alex','egypt','01232051655','1');
select *from employee;

#insertion for supplier
insert into supplier (e_mail,company_name) values('farco@gmail.com','farco');
insert into supplier (e_mail,company_name) values('evafarma@gmail.com','eva farma');
insert into supplier (e_mail,company_name) values('medico@gmail.com','medico');
insert into supplier (e_mail,company_name) values('infinity@gmail.com','infinity');
select *from supplier;

#insert into supplier phone
insert into supplier_phone (supp_id,phone) values(1,'01225307657') ;
insert into supplier_phone (supp_id,phone) values(1,'5019864') ;
insert into supplier_phone (supp_id,phone) values(2,'01155082110') ;
insert into supplier_phone (supp_id,phone) values(3,'5190099') ;
insert into supplier_phone (supp_id,phone) values(3,'01205155550');
select *from supplier_phone;

#insert into medication
insert into medication (drug_name,dosage,price,description,manufacture,supp_id) values('pandol','tablet a day',30,'headache','pharco',1);
insert into medication (drug_name,dosage,price,description,manufacture,supp_id) values('comtrex',' 2 tablets a day',17,'flue','eva farma','2');
insert into medication (drug_name,dosage,price,description,manufacture,supp_id) values('genuphil','tablet a day',30,'bones ache','Boehringer Ingelheim',2);
insert into medication (drug_name, dosage,price,description,manufacture,supp_id)values('pansinol','3scm',120,'Reduces heat','medico',3);
select *from medication;

#insert into the Prescription
insert into Prescription (details,date,emp_id,doc_id,patient_id) values('take the medicine 3 times a day','2023/5/6','1','1','1');
insert into Prescription (details,date,emp_id,doc_id,patient_id) values('take the medicine once a week','2023/9/7','2','2','2');
insert into prescription (details ,date ,emp_id,doc_id,patient_id)values ('after breakfast','2023/12/3',3,3,2);
select *from Prescription;


#insert into Doc_Treats
insert into Doc_Treats(patient_id,doc_id) values(1,1);
insert into Doc_Treats(patient_id,doc_id) values(2,2);
insert into Doc_Treats(patient_id,doc_id) values(2,3);
select *from Doc_Treats;

#insert into Transaction
insert into Transaction(cost,date,emp_id,patient_id) values(150,'2023/5/6',1,1);
insert into Transaction(cost,date,emp_id,patient_id) values(37.5,'2023/9/7',2,2);
insert into Transaction(cost,date,emp_id,patient_id) values(120,'2023/12/3',3,2);
select *from Transaction;

#insert into Med_Prescripted
insert into Med_Prescripted(pre_id,drug_id)values(1,1);
insert into Med_Prescripted(pre_id,drug_id)values(2,2);
insert into Med_Prescripted(pre_id,drug_id)values(3,3);
select *from Med_Prescripted;

#insert into Med_Transaction
insert into Med_Transaction(drug_id,t_id,quantity)values(1,1,1); 
insert into Med_Transaction(drug_id,t_id,quantity)values(2,2,1);
select *from Med_Transaction;

#insert into Inventory
insert into Inventory(drug_id,quantity,exp_date,reorder) values(1,800,'2030/1/1',100);
insert into Inventory(drug_id,quantity,exp_date,reorder) values(2,700,'2027/5/25',100);
insert into Inventory(drug_id,quantity,exp_date,reorder) values(3,600,'2027/5/25',100);
insert into inventory(drug_id,quantity,exp_date,reorder) values(3,1000,'2030-12-12',150);
select *from Inventory;

# insert into Orderr
insert into Orderr(order_date,supp_id,emp_id) values('2022/8/6',1,1);
insert into Orderr(order_date,supp_id,emp_id) values('2021/12/12',3,1);
select *from orderr;

# insert into Order_Lined_transaction
insert into Order_Line(order_id,drug_id,quantity,cost) values(1,1,1000,5000);
insert into Order_Line(order_id,drug_id,quantity,cost) values(2,3,900,8000);
select *from Order_Line;


