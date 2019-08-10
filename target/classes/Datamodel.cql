
//Create keyspace query
CREATE KEYSPACE forme
WITH REPLICATION = {
'class' : 'SimpleStrategy',
'replication_factor' : 1
};


//Create table query

CREATE TABLE forme.companies ( id UUID PRIMARY KEY,
company_name text,
status text,
result text,
created_by text,
updated_by text,
create_ts timestamp);


//Insert into sample queries:


insert into forme.companies(id, company_name, create_ts, result, status, updated_by)
values(8e274350-bb83-11e9-9cb5-2a2ae2dbcce4, 'Amazon', toTimeStamp(toDate(now())), 'reject', 'complete', 'Pratik');

insert into forme.companies(id, company_name, create_ts, result, status, updated_by)
values(8e274350-bb83-11e9-9cb5-2a2ae2dbcce5, 'Remitly', toTimeStamp(toDate(now())), 'reject', 'complete', 'Pratik');


id uuid PRIMARY KEY,
company_name text,
create_ts timestamp,
created_by text,
result text,
status text,
updated_by text