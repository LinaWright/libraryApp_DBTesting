select count(*) from book_borrow
where is_returned=0;

select name from book_categories;


select name,author,isbn,description,year from books
where name ='Clean Code';

select count(id) from users;
select count(distinct id) from users;
select id from users;

