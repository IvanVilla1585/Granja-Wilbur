CREATE TABLESPACE wilbur LOGGING
DATAFILE '/home/ivan/WilburWeb/wilbur.dbf' size 1024M
extent management local segment space management auto; 

create user jeag profile default 
identified by 1234
default tablespace wilbur
temporary tablespace temp 
account unlock; 

--permisos 

grant connect, resource,dba to jeag;