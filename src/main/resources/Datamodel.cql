
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

