DROP TABLE USUARIOS;

DROP TABLE ASIG_PERFIL;

DROP TABLE PERFILES;

DROP TABLE PAIS;
DROP TABLE DEPARTAMENTO;

DROP TABLE CIUDAD;

DROP TABLE TIPO_DOCUMENTO;
DROP TABLE SANGRE;
DROP TABLE RH;
DROP TABLE PROFESIONES;
DROP TABLE CARGO;
DROP TABLE TIPO_CONTRATO;

CREATE TABLE USUARIOS
(NUM_DOC		INTEGER,
TIPO_DOC		INTEGER,
NOMBRES		VARCHAR2(100),
APELLIDO1		VARCHAR2(80),
APELLIDO2		VARCHAR2(80),
FECHA_NAC		DATE,
DEPARTAMENTO		INTEGER,
CIUDAD			INTEGER,
TIPO_SANGRE		INTEGER,
TIPO_RH			INTEGER,
ESTADO			INTEGER,
DIRECCION		VARCHAR2(150),
TELEFONO		NUMBER,
TEL_MOVIL		NUMBER,
EMAIL			VARCHAR2(150),
PROFESION		INTEGER,
FECHA_OBT_TITULO	DATE,
CARGO			INTEGER,
FECHA_CONTRATO	DATE,
TIPO_CONTR		INTEGER)
TABLESPACE WILBUR;

CREATE TABLE ASIG_PERFIL
(COD_PERF		INTEGER,
NUM_DOC		INTEGER,
TIPO_DOC		INTEGER,
NOMBRE_APELL		VARCHAR2(260),
PERFIL			INTEGER,
NOMBRE_USER		VARCHAR2(100),
CONTRASENA		VARCHAR2(100))
TABLESPACE WILBUR;

CREATE TABLE PERFILES
(COD_PERF		INTEGER,
NOM_PERFIL		VARCHAR2(100))
TABLESPACE WILBUR;

CREATE TABLE PAIS
(COD_PAIS		INTEGER,
NOM_PAIS		VARCHAR2(100))
TABLESPACE WILBUR;

CREATE TABLE DEPARTAMENTO
(COD_DEP		INTEGER,
NOM_DEPART		VARCHAR2(100),
COD_PAIS		INTEGER)
TABLESPACE WILBUR;

CREATE TABLE CIUDAD
(COD_CIUD		INTEGER,
NOM_CIUD		VARCHAR2(100),
COD_DEPART		INTEGER)
TABLESPACE WILBUR;

CREATE TABLE TIPO_DOCUMENTO
(COD_TDOC		INTEGER,
NOM_TDOC		VARCHAR2(100))
TABLESPACE WILBUR;

CREATE TABLE SANGRE
(COD_SANGRE		INTEGER,
TIPO_SANGRE		VARCHAR2(4))
TABLESPACE WILBUR;

CREATE TABLE RH
(COD_RH		INTEGER,
NOM_RH			VARCHAR2(4))
TABLESPACE WILBUR;

CREATE TABLE PROFESIONES
(COD_PROF		INTEGER,
NOM_PROF		VARCHAR2(150))
TABLESPACE WILBUR;

CREATE TABLE CARGO
(COD_CARG		INTEGER,
NOM_CARGO		VARCHAR2(150))
TABLESPACE WILBUR;

CREATE TABLE TIPO_CONTRATO
(COD_CONTR		INTEGER,
NOM_CONTRATO		VARCHAR2(150))
TABLESPACE WILBUR;