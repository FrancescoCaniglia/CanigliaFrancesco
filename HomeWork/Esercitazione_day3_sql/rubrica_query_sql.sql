#insert new contatto

insert into contatto(id, name, cognome, numero, smartphone, indirizzo, citta, provincia, email) values 
(null, 'uiip', '32', '0852156325', 12, 'via del palazzo forte', 'ariano irpino', 'av', 'uiip@biogem.it' );

#show anagraphics informations and all smartphones info owned by users

select c.id, c.name as nomeContatto, c.cognome as cognomeContatto, c.numero as telefono, c.indirizzo, c.citta, c.provincia, c.email,
 s.name as modello_smartphone, s.ram, s.cpu, s.displayPpi, s.displaySize, s.displayResolution, s.size as dimensioni,
 s.weight, s.notes, b.name as nome_brand, b.country as country_brand, co.code as country_code,
 co.name as country_name, o.description as tipo_op_system, o.company,
 o.openSource as open_source
	from contatto as c 
		inner join smartphone as s on c.smartphone=s.id
			inner join brand as b on s.brand=b.id
				inner join country as co on b.country= co.code
					inner join opsys as o on s.opsys=o.id
          order by c.id;
          
#show anagraphics informations and name of smartphones owned by users
select c.id, c.name as nomeContatto, c.cognome as cognomeContatto, c.numero as telefono, c.indirizzo, c.citta, c.provincia, c.email,
 s.name as modello_smartphone
 from contatto as c 
		inner join smartphone as s on c.smartphone=s.id;
        
#update of anagraphic info and smartphone info, with query that controll the result
update contatto as c, smartphone as s  
	set c.indirizzo='piazza a. gentileschi', c.citta= 'brindisi', c.email='laura.caniglia@gmail.com',
	s.name ='sony xperia xz', s.brand = 8, s.opsys=1 where c.id=12 AND c.smartphone=s.id;

select * from contatto as c inner join smartphone as s on c.id=12 and c.smartphone=s.id;

#smartphones used by my accounts order by Smartphone's id and account name

select s.id as idTelefono, s.name as ModelloTelefono, c.name as NomeContatto, c.cognome as CognomeContatto 
	from smartphone as s 
		inner join contatto as c on s.id=c.smartphone order by s.id, c.name;
        
#select of all smartphones that doesn't have users, with left join
select s.id, s.name as ModelloSmartphone 
	from smartphone as s 
		left join contatto as c on s.id=c.smartphone 
			where c.smartphone is null order by s.id;
            
# select all smartphone that are possesed by more than one accounts
select count(c.id) as count, s.name from contatto as c inner join smartphone as s on c.smartphone=s.id
	where c.smartphone in (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19)
    group by c.smartphone having count>=2
    order by count;