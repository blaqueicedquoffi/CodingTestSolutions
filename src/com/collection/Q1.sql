SELECT e.FIRST_NAME, c.COMPANY_NAME
FROM EMPLOYEE e,COMPANY c,EMPLOYEE_COMPANY ec
where e.ID=ec.ID_EMPLOYEE and c.ID=ec.ID_COMPANY;

select name from superhero where length(name)<7 order by id