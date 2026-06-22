drop table customer;
drop table loan;

create table customer (
    custId int,
    name varchar(20),
    age int,
    bal int,
    vip char(1),
    rate int
);

create table loan(
    loanId int,
    custId int,
    duedate date
);

insert into customer values
(1,'Ajay',56,2000,'N',12),
(2,'Bob',70,50000,'N',15),
(3,'Catherine',65,3500,'N',10),
(4,'Della',60,45000,'N',11),
(5,'Ethiraj',20,55000,'N',7);

insert into loan values
(1,2,sysdate+16),
(2,4,sysdate+31),
(3,5,sysdate+40);

begin
    for cus in (select * from customer) LOOP
      if cus.age>60 THEN
         update customer
         set rate=cus.rate-1
         where custId=cus.custId;
         dbms_output.put_line(cus.name || 'new intrest rate = ' || (cus.rate-1));
       end if;
    end loop;
end;
/

begin 
    for cus in (select * from customer) loop
      if cus.bal>10000 then 
        update customer 
        set vip='Y'
        where custId=cus.custId;
        dbms_output.put_line(cus.name || ' is promoted to VIP');
    end if;
end loop;
end;
/

begin 
    for lo in (select al.custId,al.duedate  from loan al join customer bl on 
    al.custId=bl.custId where al.duedate<=sysdate+30)loop
      dbms_output.put_line('For ID '|| lo.custId|| ' the loan is due on '|| to_char(lo.duedate,'DD-MM-YYYY'));
    end loop;
end;
/ 

select * from customer;
