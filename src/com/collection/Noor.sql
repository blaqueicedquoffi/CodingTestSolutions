SELECT c.name from customers c, user_role u where c.id=u.user_id
and c.email like '%@gmail.com' and u.role_id>80;

----------------------------
select families.name from families , bills
where families.bill_id=bills.id  and bills.amount  in (select max(amount) from bills);

