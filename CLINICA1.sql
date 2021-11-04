
create table TBLTurno
(
TurCodigo number(20,0) not null ,
TurNombre varchar2(25) not null,
TurHoraIni TIMESTAMP,
TurHoraFin TIMESTAMP,
CONSTRAINT pk_turno primary key(TurCodigo)
);


create table TBLMedico
(
MedCodigo number(20,0) not null,
MedNombre varchar2(25) not null,
MedDireccion varchar2(50) not null,
MedTelefono varchar2(25),
MedAtiendeE varchar2(5)not null,
MedFechaI date not null,
CONSTRAINT pk_Medico primary key(MedCodigo)
);

create table TBLMedicoCel(
MedCodigo number(20,0),
MedCelular number(20,0),
CONSTRAINT pk_MedicoCel primary key(MedCodigo,MedCelular),
CONSTRAINT fk_Medico foreign key(MedCodigo) references TBLMedico(MedCodigo)
);

create table TBLTurnoXMedico(
TMCodigo number(20,0) not null,
TurCodigo number(20,0),
MedCodigo number(20,0),
TMMesTurno varchar2(25),
TMDiaTurno varchar2(15),
CONSTRAINT pk_TurnoXMedico primary key(TMCodigo),
CONSTRAINT fk_Turnoxmedico foreign key(TurCodigo) references TBLTurno(TurCodigo) on delete cascade,
CONSTRAINT fk_Turnoxmedico1 foreign key(MedCodigo) references TBLMedico(MedCodigo) on delete cascade
);

create table TBLCirugias(
CirCodigo number(20,0),
CirDuracion varchar2(15),
CirDescripcion varchar2(70),
CirRiesgo varchar2(25),
CirNombre varchar2(25),
CirAnestesia char(8),
CONSTRAINT pk_Cirugias primary key(CirCodigo)
);

create table TBLDuenio(
DueCodigo number(20,0),
DueNombre varchar2(50),
DueIdentidad varchar2(50),
DueDireccion varchar2(100),
DueTelefono number(38,0),
CONSTRAINT pk_Duenio primary key(DueCodigo)
);

create table TBLDuenioCel(
DueCodigo number(20,0),
DueCelular number(20,0),
CONSTRAINT pk_dueniocel primary key(DueCodigo,DueCelular),
CONSTRAINT fk_duenio foreign key(DueCodigo) references TBLDuenio(DueCodigo)
);

create table TBLMedicinas(
MeCodigo number(20,0) not null,
MeNombre varchar2(25) not null,
MeDosis varchar2(50) not null,
MePeriodoT varchar2(25) not null,
CONSTRAINT pk_Medicinas primary key(MeCodigo)
);

create table TBLEspecie(
EsCodigo number(20,0) not null,
EsNombre varchar2(100) not null,
EsFamilia varchar2(70) not null,
CONSTRAINT pk_Especie primary key(EsCodigo)
);

create table TBLRaza(
RazCodigo number(20,0) not null,
RazNombre varchar2(25) not null,
EsCodigo number(20,0) not null,
RazLogevidad varchar2(25),
CONSTRAINT pk_raza primary key(RazCodigo),
CONSTRAINT fk_especie foreign key(EsCodigo) references TBLEspecie(EsCodigo) on delete cascade
);


create table TBLEnfermedad(
EnCodigo number(20,0) not null,
RazCodigo number(20,0) not null,
EnNombre varchar2(25) not null,
CONSTRAINT pk_enfermedad primary key(EnCodigo),
CONSTRAINT fk_raza foreign key(RazCodigo) references TBLRaza(RazCodigo) on delete cascade
);

create table TBLMediXEnfer(
MeCodigo number(20,0) not null,
EnCodigo number(20,0) not null,
CONSTRAINT pk_medixenfer primary key(MeCodigo,EnCodigo),
CONSTRAINT fk_medicinas foreign key(MeCodigo) references TBLMedicinas on delete cascade,
CONSTRAINT fk_enfermedad foreign key(EnCodigo) references TBLEnfermedad on delete cascade
);


create table TBLPaciente(
PacCodigo number(20,0) not null,
PacNombre varchar2(70) not null,
EsCodigo number(20,0) not null,
RazCodigo number(20,0) not null,
DueCodigo number(20,0),
MedCodigo number(20,0) not null,
PacFoto Blob,
PacFecha date,
CONSTRAINT pk_paciente primary key(PacCodigo),
 foreign key(EsCodigo) references TBLEspecie(EsCodigo) on delete cascade,
 foreign key(RazCodigo) references TBLRaza(RazCodigo) on delete cascade,
 foreign key(DueCodigo) References TBLDuenio(DueCodigo) on delete cascade,
 foreign key(MedCodigo) references TBLMedico(MedCodigo) on delete cascade
);

create table TBLCitas(
CiCodigo number(20,0) not null,
CiFecha date,
CiHora TIMESTAMP,
PacCodigo number(20,0),
CiDescripcion varchar2(100),
CirCodigo number(20,0) not null,
MedCodigo number(20,0) not null,
CiFechaPro date,
CONSTRAINT pk_citas primary key(CiCodigo),
 foreign key(PacCodigo) references TBLPaciente(PacCodigo) on delete cascade,
foreign key(CirCodigo) references TBLCirugias(CirCodigo) on delete cascade,
 foreign key(MedCodigo) references TBLMedico(MedCodigo) on delete cascade 
);

create table auditoria(
nombreTabla varchar2(25),
fechaRegistro date,
hora TIMESTAMP,
usuario varchar2(20),
transaccion varchar2(25)
);

create table usuario(
usuario varchar2(25),
nombreCompleto varchar2(50),
telefono number(20,0),
direccion varchar2(100),
contrasenia varchar2(25)
);

--Directory image
create directory IMAGEN_DIR as 'c:\imagen';


/*
    sequence increment in start with 1 codigo
*/
CREATE SEQUENCE medicinas_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE enfermedad_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE raza_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE especie_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE paciente_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE duenio_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE citas_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE medico_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE cirugias_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE turnoxmedico_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE turno_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;



--procedimiento almacenado de inserción
/*
    Procedimiento almacenado de insercion de datos de la tabla de turno
    @param iturNombre tblturno.turnombre%Type
    @param iturHoraI tblturno.turhoraini%Type
    @param iturHoraF tblturno.turhorafin%TYpe
    */
create or replace procedure P_iTurno(
iturNombre tblturno.turnombre%Type,
iturHoraI tblturno.turhoraini%Type,
iturHoraF tblturno.turhorafin%TYpe
)
as begin
    insert into tblturno values(TURNO_SEQ.nextval,iturnombre,iturhorai,iturhoraf);
commit;
end;


/*
    procedimiento almacenado de insercion de datos en la tabla de medico
    @param imedNombre tblmedico.mednombre%TYpe
    @param imedDireccion tblmedico.meddireccion%Type
    @param imedTelefono tblmedico.medtelefono%Type
    @param imedAtiendeE tblmedico.medatiendee%Type
    @param imedFechaI tblmedico.medfechai%Type
    */
create or replace procedure  P_iMedico(
imedNombre tblmedico.mednombre%TYpe,
imedDireccion tblmedico.meddireccion%Type,
imedTelefono tblmedico.medtelefono%Type,
imedAtiendeE tblmedico.medatiendee%Type,
imedFechaI tblmedico.medfechai%Type
)
as begin 
    insert into tblmedico VALUES(MEDICO_SEQ.nextval,imednombre,imeddireccion,imedtelefono,imedatiendee,imedfechai);
commit;
end;

--drop procedure P_iMedicoCel;  
    /*
    procedimiento almacenado de insercion de datos de la tabla de medicocel
    @param imedCodigo tblmedicocel.medcodigo%Type
    @param imedCelular tblmedicocel.medcelular%Type
    */
create or replace procedure P_iMedicoCel(
imedCodigo tblmedicocel.medcodigo%Type,
imedCelular tblmedicocel.medcelular%Type
)
as begin
    INSERT into tblmedicocel VALUES(imedcodigo,imedcelular);
commit;
end;

--drop procedure P_iTurnoXMedico;
    /*
    procedimiento almacenado de inserción de turnoxmedico
    @param iturcodigo tblturnoxmedico.turcodigo%Type
    @param imedcodigo tblturnoxmedico.medcodigo%Type
    @param itmesturno tblturnoxmedico.tmmesturno%Type
    @param imdiaturno tblturnoxmedico.tmdiaturno%Type
    */
create or replace procedure P_iTurnoXMedico(
iturcodigo tblturnoxmedico.turcodigo%Type,
imedcodigo tblturnoxmedico.medcodigo%Type,
itmesturno tblturnoxmedico.tmmesturno%Type,
imdiaturno tblturnoxmedico.tmdiaturno%Type
)
as begin
    insert into tblturnoxmedico VALUES(TURNOXMEDICO_SEQ.nextval,iturcodigo,imedcodigo,itmesturno,imdiaturno);
commit;
end;

--drop procedure P_iCirugias;
    /*
    procedimiento almacenado de inserción de la tabla de cirugias
    
    @param icirDuracion tblcirugias.cirduracion%TYpe
    @param icirDescripcion tblcirugias.cirdescripcion%TYpe
    @param icirRiesgo tblcirugias.cirriesgo%Type
    @param icirNombre tblcirugias.cirnombre%Type
    @param icirAnestesia ciranestesia%TYpe
    */
create or replace procedure P_iCirugias(
icirDuracion tblcirugias.cirduracion%TYpe,
icirDescripcion tblcirugias.cirdescripcion%TYpe,
icirRiesgo tblcirugias.cirriesgo%Type,
icirNombre tblcirugias.cirnombre%Type,
icirAnestesia tblcirugias.ciranestesia%TYpe
)
as begin 
    insert into TBLCirugias VALUES(CIRUGIAS_SEQ.nextval,icirduracion,icirdescripcion,icirriesgo,icirnombre,iciranestesia);
commit;
end;

--drop procedure P_iDuenio;
    /*
    procedumiento almacenado de la tabla de duenio
    @param iDueNombre tblduenio.duenombre%Type
    @param iDueIdentidad tblduenio.dueidentidad%Type
    @param iDueDireccion tblduenio.duedireccion%Type
    @param iDueTelefono tblduenio.duetelefono%Type
    */
create or replace procedure P_iDuenio(
iDueNombre tblduenio.duenombre%Type,
iDueIdentidad tblduenio.dueidentidad%Type,
iDueDireccion tblduenio.duedireccion%Type,
iDueTelefono tblduenio.duetelefono%Type
)
as begin 
    insert into tblduenio VALUES(DUENIO_SEQ.nextval,iduenombre,idueidentidad,iduedireccion,iduetelefono);
commit;
end;

--exec P_iduenio('danie','564646','21 de octuber',65456465);
--select * from TBLDuenio;
--drop procedure P_iTBLDuenioCel;
/*
    procedimiento almacenado de insercion de la tabla dueniocel
    @param idueCodigo TBLDuenioCel.duecodigo%Type
    @param idueCelular TBLDuenioCel.duecelular%Type
    */

create or replace procedure P_iTBLDuenioCel(
idueCodigo TBLDuenioCel.duecodigo%Type,
idueCelular TBLDuenioCel.duecelular%Type
)
as begin
    insert into TBLDuenioCel VALUES(iduecodigo,iduecelular);
commit;
end;
    
 
 --drop procedure P_iTBLMedicinas;   
    /*
    procedimiento almacenado de insercion de la tabla de Medicinas 
    @param iMeNombre tblmedicinas.menombre%Type
    @param iMeDosis tblmedicinas.medosis%Type
    @param iMePeriodoT tblmedicinas.meperiodot%Type
    */
create or replace procedure P_iTBLMedicinas(
iMeNombre tblmedicinas.menombre%Type,
iMeDosis tblmedicinas.medosis%Type,
iMePeriodoT tblmedicinas.meperiodot%Type
)
as begin
    insert into TBLMedicinas VALUES(MEDICINAS_SEQ.nextval,imenombre,imedosis,imeperiodot);
commit;
end;

--drop procedure P_iTBLEspecie;
    /*
    procedimiento almacenado de insercion de la tabla de especie
    @param iEsNombre TBLEspecie.EsNombre%TYpe
    @param iEsFamilia TBLEspecie.EsFamilia%Type
    */
create or replace procedure P_iTBLEspecie(
iEsNombre TBLEspecie.EsNombre%TYpe,
iEsFamilia TBLEspecie.EsFamilia%Type
)
as begin
    insert into TBLEspecie VALUES(ESPECIE_SEQ.nextval,iesnombre,iesfamilia);
commit;
end;

--drop procedure P_iTBLRaza;
    /*
    procedimiento almacenado de insercion de la tabla de raza
    @param iRazNombre tblraza.raznombre%Type
    @param iEsCodigo tblraza.escodigo%Type
    @param iRazLongevidad tblraza.razlogevidad%Type
    */
create or replace procedure P_iTBLRaza(
iRazNombre tblraza.raznombre%Type,
iEsCodigo tblraza.escodigo%Type,
iRazLongevidad tblraza.razlogevidad%Type
)
as begin
    insert into TBLRaza VALUES(RAZA_SEQ.nextval,iraznombre,iescodigo,irazlongevidad);
commit;
end;

--drop procedure P_iEnfermedad;
    /*
    @param iRazCodigo tblenfermedad.razcodigo%Type
    @param iEnNombre tblenfermedad.ennombre%Type
    @param iMeCodigo tblenfermedad.mecodigo%Type
    */

create or replace procedure P_iEnfermedad(
iRazCodigo tblenfermedad.razcodigo%Type,
iEnNombre tblenfermedad.ennombre%Type
)
as begin
    insert into tblenfermedad VALUES(ENFERMEDAD_SEQ.nextval,irazcodigo,iennombre);
commit;
end;


--drop procedure P_iPaciente;
    /*
    procedimiento almacenado de insercion de datos de la tabla de paciente
    @param iPacNombre tblpaciente.pacnombre%Type
    @param iEsCodigo tblpaciente.escodigo%Type
    @param iRazCodigo tblpaciente.razcodigo%TYpe
    @param iDueCodigo tblpaciente.duecodigo%Type
    @param iMedCodigo tblpaciente.medcodigo%Type
    @param iPacFoto tblpaciente.pacfoto%Type
    @param iPacFecha tblpaciente.pacfecha%Type
    */
create or replace procedure P_iPaciente(
iPacNombre tblpaciente.pacnombre%Type,
iEsCodigo tblpaciente.escodigo%Type,
iRazCodigo tblpaciente.razcodigo%TYpe,
iDueCodigo tblpaciente.duecodigo%Type,
iMedCodigo tblpaciente.medcodigo%Type,
iPacFoto tblpaciente.pacfoto%Type,
iPacFecha tblpaciente.pacfecha%Type
)
as begin
    insert into TBLPaciente VALUES(PACIENTE_SEQ.nextval,ipacnombre,iescodigo,irazcodigo,iduecodigo,imedcodigo,ipacfoto,ipacfecha);
commit;
end;


--drop procedure P_iCitas;
/*  
Procedimiento almacenado de insercion de datos de la tabla de citas
    @param iCiFecha tblcitas.cifecha%Type
    @param iCiHora tblcitas.cihora%Type
    @param iPacCodigo tblcitas.paccodigo%Type
    @param iCiDescripcion tblcitas.cidescripcion%Type
    @param iCirCodigo tblcitas.circodigo%Type
    @param iMedCodigo tblcitas.medcodigo%Type
    @param iCiFechaPro tblcitas.cifechapro%Type
    */

create or replace procedure P_iCitas(
iCiFecha tblcitas.cifecha%Type,
iCiHora tblcitas.cihora%Type,
iPacCodigo tblcitas.paccodigo%Type,
iCiDescripcion tblcitas.cidescripcion%Type,
iCirCodigo tblcitas.circodigo%Type,
iMedCodigo tblcitas.medcodigo%Type,
iCiFechaPro tblcitas.cifechapro%Type
)
as begin
    insert into TBLCitas VALUES(CITAS_SEQ.nextval,icifecha,icihora,ipaccodigo,icidescripcion,icircodigo,imedcodigo,icifechapro);
commit;
end;
    

create or replace procedure P_iTBLMediXEnfer(
imecodigo TBLMedicinas.mecodigo%Type,
iEnCodigo TBLEnfermedad.Encodigo%Type
)
as begin
    insert into TBLMediXEnfer VALUES(imecodigo,iencodigo);
commit;
end;
    
 -- drop procedure P_iUsuario;  
    /*
    Procedimiento almacenado de insercion de datos de la tabla usuario
    @param iUsuario usuario.usuario%Type
    @param inombreCompleto usuario.nombreCompleto%Type
    @param iTelefono usuario.telefono%Type
    @param iDireccion usuario.direccion%Type
    @param icontrasenia usuario.contrasenia%Type
    */
create or replace procedure P_iUsuario(
iUsuario usuario.usuario%Type,
inombreCompleto usuario.nombreCompleto%Type,
iTelefono usuario.telefono%Type,
iDireccion usuario.direccion%Type,
icontrasenia usuario.contrasenia%Type
)
as begin
    insert into usuario VALUES(iusuario,inombrecompleto,itelefono,idireccion,icontrasenia);
commit;
end;



--Procedimientos almacenados de actualización

--drop procedure uTurno;
/*
procedimiento almacenado de actualizacion de la tabla turno
    @param uTurCodigo TBLTurno.turcodigo%Type
    @param uTurnoNombre tblturno.turnombre%Type
    @param uTurnoHoraI tblturno.turhoraini%Type
    @param uTurnoHoraF tblturno.turhorafin%TYPE
*/
create or replace procedure uTurno
(
    uTurCodigo TBLTurno.turcodigo%Type,
    uTurnoNombre tblturno.turnombre%Type,
    uTurnoHoraI tblturno.turhoraini%Type,
    uTurnoHoraF tblturno.turhorafin%TYPE
)
as begin 
update tblturno set
turnombre = uTurnoNombre,
turhoraini = uturnohorai,
turhorafin = uturnohoraf
where turcodigo = uturcodigo;
commit;
end;

--drop procedure uMedico;
/*    
procedimiento almacenado de actualizacion de la tabla de medico
    @param umedcodigo  TBLMedico.medcodigo%Type
    @param umednombre TBLMedico.mednombre%Type
    @param umeddireccion TBLMedico.meddireccion%Type
    @param umedtelefono TBLMedico.medtelefono%Type
    @param umedatiende TBLMedico.medatiendee%Type
    @param umedfecha  tblmedico.medfechai%Type
    */
create or replace procedure uMedico
(
    umedcodigo  TBLMedico.medcodigo%Type,
    umednombre TBLMedico.mednombre%Type,
    umeddireccion TBLMedico.meddireccion%Type,
    umedtelefono TBLMedico.medtelefono%Type,
    umedatiende TBLMedico.medatiendee%Type,
    umedfecha  tblmedico.medfechai%Type
)
as begin 
update tblmedico set
mednombre = umednombre,
meddireccion = umeddireccion,
medtelefono = umedtelefono,
medatiendee = umedatiende,
medfechai = umedfecha
where medcodigo = umedcodigo;
commit;
end;

--Drop procedure uMedicoCel;
/*  
procedimiento almacenado de actualizacion de la tabla medicocel
    @param umedcodigo tblmedicocel.medcodigo%TYPE
    @param umedcelular tblmedicocel.medcelular%TYPE
    */
create or replace procedure uMedicoCel
(
umedcodigo tblmedicocel.medcodigo%TYPE,
umedcelular tblmedicocel.medcelular%TYPE
)
as begin 
update TBLMedicoCel set
medcelular = umedcelular
where medcodigo = umedcodigo;
commit;
end;

--drop procedure uTurnoXMedico;
create or replace procedure uTurnoXMedico
(
utmcodigo tblturnoxmedico.tmcodigo%Type,
uturcodigo tblturnoxmedico.turcodigo%Type,
umedcodigo tblturnoxmedico.medcodigo%Type,
utmesturno tblturnoxmedico.tmmesturno%Type,
umdiaturno tblturnoxmedico.tmdiaturno%Type

)
as begin 
update tblturnoxmedico set
turcodigo = uturcodigo,
medcodigo = umedcodigo,
tmmesturno = utmesturno,
tmdiaturno = umdiaturno
where tmcodigo = utmcodigo;
commit;
end;


--drop procedure uCirugias;
create or replace procedure uCirugias
(
ucircodigo tblcirugias.circodigo%Type,
ucirDuracion tblcirugias.cirduracion%TYpe,
ucirDescripcion tblcirugias.cirdescripcion%TYpe,
ucirRiesgo tblcirugias.cirriesgo%Type,
ucirNombre tblcirugias.cirnombre%Type,
ucirAnestesia tblcirugias.ciranestesia%TYpe
)
as begin 
update TBLCirugias set
cirduracion = ucirduracion,
cirdescripcion = ucirdescripcion,
cirriesgo = ucirriesgo,
cirnombre = ucirnombre,
ciranestesia = uciranestesia
where circodigo = ucircodigo;
commit;
end;

--drop procedure uDuenio;
create or replace procedure uDuenio
(
uduecodigo tblduenio.duecodigo%Type,
uDueNombre tblduenio.duenombre%Type,
uDueIdentidad tblduenio.dueidentidad%Type,
uDueDireccion tblduenio.duedireccion%Type,
uDueTelefono tblduenio.duetelefono%Type
)
as begin 
update tblduenio set
duenombre = uDueNombre,
dueidentidad = uDueIdentidad,
duedireccion = uDueDireccion,
duetelefono = uDueTelefono 
where duecodigo = uduecodigo;
commit;
end;


--drop procedure uDuenioCel;
create or replace procedure uDuenioCel
(
uDueCodigo TBLDuenioCel.DueCodigo%Type,
uDueCelular TBLDuenioCel.duecelular%Type
)
as begin 
update tbldueniocel set
duecelular = uduecelular 
where DueCodigo = uDueCodigo;
commit;
end;

--drop procedure uMedicinas;
create or replace procedure uMedicinas
(
umecodigo tblmedicinas.mecodigo%Type,
umenombre tblmedicinas.menombre%Type,
umedosis  tblmedicinas.medosis%Type,
umePeriodoT tblmedicinas.meperiodot%Type
)
as begin 
update TBLMedicinas set
    menombre = umenombre,
    medosis = umedosis,
    mePeriodoT = umeperiodot
where mecodigo = umecodigo;
commit;
end;


--drop procedure uEspecie;
create or replace procedure uEspecie
(
    uescodigo tblespecie.escodigo%Type,
    uesnombre tblespecie.esnombre%Type,
    uesfamilia tblespecie.esfamilia%Type
)
as begin 
update TBLEspecie set
esnombre = uesnombre,
esfamilia = uesfamilia
where escodigo = uescodigo;
commit;
end;

--drop procedure uRaza;
create or replace procedure uRaza
(
    urazcodigo tblraza.razcodigo%Type,
    uraznombre tblraza.raznombre%Type,
    uescodigo tblraza.escodigo%Type,
    urazlongevi tblraza.razlogevidad%Type
)
as begin 
update TBLRaza set
raznombre = uraznombre,
escodigo = uescodigo,
razlogevidad = urazlongevi
where razcodigo = urazcodigo;
commit;
end;



--drop procedure uEnfermedad;

/*
    @param uencodigo tblenfermedad.encodigo%Type
    @param urazcodigo tblenfermedad.razcodigo%Type
    @param uennombre tblenfermedad.ennombre%Type
    */

create or replace procedure uEnfermedad
(
    uencodigo tblenfermedad.encodigo%Type,
    urazcodigo tblenfermedad.razcodigo%Type,
    uennombre tblenfermedad.ennombre%Type
)
as begin 
update TBLEnfermedad set
razcodigo = urazcodigo,
ennombre = uennombre
where encodigo = uencodigo;
commit;
end;
    
    
    /*
    @param uPacCodigo tblpaciente.paccodigo%Type
    @param uPacNombre tblpaciente.pacnombre%Type
    @param uEsCodigo tblpaciente.escodigo%Type
    @param uRazCodigo tblpaciente.razcodigo%TYpe
    @param uDueCodigo tblpaciente.duecodigo%Type
    @param uMedCodigo tblpaciente.medcodigo%Type
    @param uPacFoto tblpaciente.pacfoto%Type
    @param uPacFecha tblpaciente.pacfecha%Type
    */
    
    --drop procedure upaciente;
create or replace procedure uPaciente
(
uPacCodigo tblpaciente.paccodigo%Type,
uPacNombre tblpaciente.pacnombre%Type,
uEsCodigo tblpaciente.escodigo%Type,
uRazCodigo tblpaciente.razcodigo%TYpe,
uDueCodigo tblpaciente.duecodigo%Type,
uMedCodigo tblpaciente.medcodigo%Type,
uPacFoto tblpaciente.pacfoto%Type,
uPacFecha tblpaciente.pacfecha%Type
)
as begin 
update TBLPaciente set
pacnombre = upacnombre,
escodigo = uescodigo,
razcodigo = urazcodigo,
duecodigo = uduecodigo,
medcodigo = umedcodigo,
pacfoto = upacfoto,
pacfecha = upacfecha
where upaccodigo = paccodigo;
commit;
end;


create or replace procedure uCitas(
uCiCodigo TBLCitas.cicodigo%Type,
uCifecha TBLCitas.cifecha%Type,
uCiHora TBLCitas.cihora%Type,
upacCodigo TBLCitas.paccodigo%Type,
uciDescripcion TBLCitas.cidescripcion%Type,
ucircodigo TBLCitas.circodigo%Type,
umedcodigo TBLCitas.medcodigo%Type,
ucifechapro TBLCitas.cifechapro%Type
)
as begin
update TBLCitas set
cifecha=uCifecha, 
cihora=uCiHora,
paccodigo=upacCodigo, 
cidescripcion=uciDescripcion, 
circodigo=ucircodigo, 
medcodigo=umedcodigo, 
cifechapro=ucifechapro
where cicodigo = ucicodigo;
commit;
end;



create or replace procedure uMediXEnfer(
umecodigo TBLMediXEnfer.mecodigo%Type,
uencodigo TBLMediXEnfer.encodigo%Type
)
as begin
update TBLMediXEnfer set
mecodigo= umecodigo,
encodigo = uencodigo
where mecodigo = umecodigo 
and encodigo = uencodigo;
commit;
end;



--Delete
create or replace procedure eTurno
(eTurCodigo TBLTurno.turcodigo%Type)
as begin
delete from TBLTurno
where TurCodigo = eTurCodigo;
commit;
end;



create or replace procedure eMedico
(emedcodigo TBLMedico.medcodigo%Type)
as begin
delete from tblmedico
where medcodigo = emedcodigo;
commit;
end;


create or replace procedure eMedicoCel
(emedcodigo tblmedicocel.medcodigo%type,
emedcelular tblmedicocel.medcelular%Type
)
as begin
delete from tblmedicocel
where medcodigo = emedcodigo
and medcelular = emedcelular;
commit;
end;



create or replace procedure eTurnoXMedico
(eTMCodigo TBLTurnoXMedico.TMCodigo%Type)
as begin
delete from tblturnoxmedico
where tmcodigo = etmcodigo;
commit;
end;


create or replace procedure eCirugias
(ecircodigo tblcirugias.circodigo%Type)
as begin
delete from tblcirugias
where circodigo = ecircodigo;
commit;
end;


create or replace procedure eCitas
(ecicodigo TBLCitas.cicodigo%Type)
as begin
delete from TBLCitas
where cicodigo = ecicodigo;
commit;
end;



create or replace procedure ePaciente
(epaccodigo TBLPaciente.paccodigo%Type)
as begin
delete from TBLPaciente
where paccodigo = epaccodigo;
commit;
end;


create or replace procedure eDuenio
(eDueCodigo tblduenio.duecodigo%Type)
as begin
delete from tblduenio
where duecodigo = eduecodigo;
commit;
end;



create or replace procedure eDuenioCel
(eDueCodigo tbldueniocel.duecodigo%Type,
eDueCelular tbldueniocel.duecelular%Type
)
as begin
delete from tbldueniocel
where duecodigo = eduecodigo
and duecelular = eduecelular;
commit;
end;



create or replace procedure eEspecie
(eEsCodigo TBLEspecie.Escodigo%Type)
as begin
delete from TBLEspecie
where escodigo = eescodigo;
commit;
end;


create or replace procedure eRaza
(eRazCodigo tblraza.razcodigo%Type
)
as begin
delete from TBLRaza
where razcodigo = erazcodigo;
commit;
end;



create or replace procedure eEnfermedad
(eEncodigo tblenfermedad.encodigo%Type)
as begin
delete from TBLEnfermedad
where encodigo = eencodigo;
commit;
end;



create or replace procedure eMedicinas
(emecodigo tblmedicinas.mecodigo%Type)
as begin
delete from TBLMedicinas
where mecodigo = emecodigo;
commit;
end;


create or replace procedure eMediXEnfer
(emecodigo tblmedixenfer.mecodigo%Type,
eencodigo tblmedixenfer.encodigo%Type
)
as begin
delete from TBLMediXEnfer
where mecodigo = emecodigo
and encodigo = eencodigo;
commit;
end;


create or replace procedure P_iAuditoria(
inombreTabla auditoria.nombreTabla%Type,
ifechaRegistro auditoria.fechaRegistro%Type,
ihora auditoria.hora%Type,
iusuario auditoria.usuario%Type,
itransaccion auditoria.transaccion%Type 
)
as begin
    insert into auditoria VALUES(inombreTabla,ifechaRegistro,ihora,iusuario,itransaccion);
commit;
end;


--ADD IMAGE TO TBLPACIENTE TYPE BLOB
CREATE OR REPLACE PROCEDURE agregaImagen

   (directorio IN varchar2, 
   archivoImagen IN varchar2) as

   f_lob bfile;

   b_lob blob;

BEGIN

   f_lob := bfilename(directorio, archivoImagen);

   INSERT INTO tblpaciente VALUES ( 'id1', empty_blob() )

   RETURNING pacfoto into b_lob;

   --Abrir archivo

   dbms_lob.fileopen(f_lob,dbms_lob.file_readonly);

   --Leer archivo

   dbms_lob.loadfromfile(b_lob, f_lob, dbms_lob.getlength(f_lob));

   --Cerrar archivo

   dbms_lob.fileclose(f_lob);

   commit;

END;




select * from TBLDuenio;



create or replace trigger insertar_Bpaciente
after insert 
on TBLPaciente 
for each row 
declare 
usuario varchar (15); 
hora varchar (15);
fecha date; 
begin 
select to_char(sysdate, 'HH24:MI:SS')INTO hora FROM DUAL;
select to_date (sysdate, 'DD/MM/YY') into fecha from dual; 
select user into usuario from dual ; 
P_iAuditoria ('TBLPaciente', fecha, hora,usuario,'insercion');  
end;


create or replace trigger insertar_BMedico
after insert 
on TBLMedico 
for each row 
declare 
usuario varchar (15); 
hora varchar (15);
fecha date; 
begin 
select to_char(sysdate, 'HH24:MI:SS')INTO hora FROM DUAL;
select to_date (sysdate, 'DD/MM/YY') into fecha from dual; 
select user into usuario from dual ; 
P_iAuditoria ('TBLMedico', fecha, hora,usuario,'insercion');  
end;


create or replace trigger insertar_BDuenio
after insert 
on TBLDuenio
for each row 
declare 
usuario varchar (15); 
hora varchar (15);
fecha date; 
begin 
select to_char(sysdate, 'HH24:MI:SS')INTO hora FROM DUAL;
select to_date (sysdate, 'DD/MM/YY') into fecha from dual; 
select user into usuario from dual ; 
P_iAuditoria ('TBLDuenio', fecha, hora,usuario,'insercion');  
end;



create or replace trigger insertar_BCitas
after insert 
on TBLCitas 
for each row 
declare 
usuario varchar (15); 
hora varchar (15);
fecha date; 
begin 
select to_char(sysdate, 'HH24:MI:SS')INTO hora FROM DUAL;
select to_date (sysdate, 'DD/MM/YY') into fecha from dual; 
select user into usuario from dual ; 
P_iAuditoria ('TBLCitas', fecha, hora,usuario,'insercion');  
end;





create or replace trigger eliminar_Paciente
    after delete on TBLPaciente
    for each row   
    Declare
    usuario varchar(15);
    hora varchar(15);
    fecha date;
    Begin
    select to_char(sysdate,'HH24:MI:SS') into hora from dual;
    select to_date(sysdate, 'DD/MM/YYYY') into fecha from dual;
    Select user into usuario from dual;
     P_iAuditoria ('TBLCitas', fecha, hora,usuario,'eliminacion');  
    commit;
    end;


create or replace trigger eliminar_Medicos
    after delete on TBLMedico
    for each row   
    Declare
    usuario varchar(15);
    hora varchar(15);
    fecha date;
    Begin
    select to_char(sysdate,'HH24:MI:SS') into hora from dual;
    select to_date(sysdate, 'DD/MM/YYYY') into fecha from dual;
    Select user into usuario from dual;
     P_iAuditoria ('TBLMedico', fecha, hora,usuario,'Eliminacion');  
    commit;
    end;



create or replace trigger eliminar_Duenio
    after delete on TBLDuenio
    for each row   
    Declare
    usuario varchar(15);
    hora varchar(15);
    fecha date;
    Begin
    select to_char(sysdate,'HH24:MI:SS') into hora from dual;
    select to_date(sysdate, 'DD/MM/YYYY') into fecha from dual;
    Select user into usuario from dual;
     P_iAuditoria ('TBLDuenio', fecha, hora,usuario,'Eliminacion');  
    commit;
    end;


create or replace trigger eliminar_Citas
    after delete on TBLCitas
    for each row   
    Declare
    usuario varchar(15);
    hora varchar(15);
    fecha date;
    Begin
    select to_char(sysdate,'HH24:MI:SS') into hora from dual;
    select to_date(sysdate, 'DD/MM/YYYY') into fecha from dual;
    Select user into usuario from dual;
     P_iAuditoria ('TBLCitas', fecha, hora,usuario,'Eliminacion');  
    commit;
    end;


create table fecha_sistema(
fecha_actual date,
primary key (fecha_actual)
);

--procedimiento jobs
create or replace procedure iFecha_sistema as
  mi_fecha date;
  begin
  select to_date(to_char(sysdate, 'DD/MM/YYYY HH24:MI:SS'), 'DD/MM/YYYY HH24:MI:SS')  into mi_fecha from dual;
  insert into fecha_sistema (fecha_actual) values (mi_fecha);
  commit;
  end;


select c.CiFechaPro,d.DueNombre,r.DueCelular,p.PacNombre,f.EsNombre,c.CiFechaPro,m.MedNombre
from TBLCitas c,TBLDuenio d,TBLDuenioCel r,TBLPaciente p,tblespecie f,TBLMedico m
where c.medcodigo = m.medcodigo
and c.paccodigo = p.paccodigo
and p.duecodigo = d.duecodigo
order by c.cifechapro

