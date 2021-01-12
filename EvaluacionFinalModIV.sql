CREATE TABLE usuario (
    rutusuario          VARCHAR2(50) NOT NULL,
    nombre              VARCHAR2(50),
    fechanacimiento     VARCHAR2(50),
    tipo  NUMBER NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( rutusuario );

--Tabla administrativos
CREATE TABLE administrativos (
    runadministrativo   VARCHAR2(50) NOT NULL,
    nombres             VARCHAR2(50),
    apellidos           VARCHAR2(50),
    correo              VARCHAR2(100),
    area                VARCHAR2(100),
    usuario_runusuario  VARCHAR2(50) NOT NULL
);

ALTER TABLE administrativos ADD CONSTRAINT administrativos_pk PRIMARY KEY ( runadministrativo );

--Tabla cliente
CREATE TABLE cliente (
    rutcliente       VARCHAR2(50) NOT NULL,
    clinombre        VARCHAR2(30) NOT NULL,
    cliapellidos     VARCHAR2(50) NOT NULL,
    clitelefono      VARCHAR2(20) NOT NULL,
    cliafp           VARCHAR2(30),
    clisistemasalud  NUMBER(2),
    clidireccion     VARCHAR2(100) NOT NULL,
    clicomuna        VARCHAR2(50) NOT NULL,
    cliedad          NUMBER(3) NOT NULL,
    usuario_runusuario  VARCHAR2(50) NOT NULL       
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rutcliente );

--Tabla capacitación
CREATE TABLE capacitacion (
    idcapacitacion      NUMBER(9) NOT NULL,
    capfecha            VARCHAR2(50) NOT NULL,
    caphora             VARCHAR2(50) NOT NULL,
    caplugar            VARCHAR2(100) NOT NULL,
    capduracion         NUMBER(4),
    cliente_rutcliente  VARCHAR2(50) NOT NULL
);

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( idcapacitacion );

--Tabla profesionales
CREATE TABLE profesionales (
    runprofesional      VARCHAR2(50) NOT NULL,
    nombres             VARCHAR2(50),
    apellidos           VARCHAR2(50),
    telefono            VARCHAR2(50),
    titulo              VARCHAR2(50),
    proyecto            VARCHAR2(50),
    usuario_runusuario  VARCHAR2(50) NOT NULL
);

ALTER TABLE profesionales ADD CONSTRAINT profesionales_pk PRIMARY KEY ( runprofesional );

--Insertar registros a tablas
--Insercion de registros en tabla usuario
INSERT INTO usuario VALUES('1-1','Carlos Lopez','11/07/1954', 1);
INSERT INTO usuario VALUES('2-2','Camila Corral','25/09/1963',2);
INSERT INTO usuario VALUES('3-3','Camilo Corrales','25/09/1969',3);

--Insercion de registros en tabla administrativos
INSERT INTO administrativos VALUES('77777777','Julio Pablo','Iglesias Diaz','julio.iglesias@gmail.com',
'Servicio al cliente','44444444');
INSERT INTO administrativos VALUES('88888888','Paula Andrea','Rosas del Campo','paula.rosas@gmail.com',
'Logistica','55555555');
INSERT INTO administrativos VALUES('99999999','Jorge Ignacio','Campos Aldea','jorge.campos@gmail.com',
'Contabilidad','66666666');

--Insercion de registros en tabla cliente
INSERT INTO cliente VALUES('1-1', 'Juan','Castro Soto', '+569123453', 'Capital', 1, 'Avenida Las Rosas','Santiago',45,'123');
INSERT INTO cliente VALUES('2-2', 'Maria','Rojas Rojas','+569875442', 'Habitat', 2, 'Avenida Pajaritos', 'Maipú', 25,'345' );
INSERT INTO cliente VALUES('3-3', 'Adolfo','Soto Soto','+5699999727', 'Plan Vital',1,'Avenida Los Robles','Renca', 66,'666');

--Insercion de registros en tabla capacitacion
INSERT INTO capacitacion VALUES(1,'02/11/2020','20:30','Maipu',120,'11111111');
INSERT INTO capacitacion VALUES(2,'22/10/2020','15:00','Los Angeles',30,'2222222');
INSERT INTO capacitacion VALUES(3,'30/05/2020','10:30','Concepcion',90,'33333333');

--Insercion de registros en tabla profesionales
INSERT INTO profesionales VALUES('11112222','Romina Andrea', 'Rojas Jara','+5695123456',
'Prevencionista de riesgo', 'Proyecto 1','44444444');
INSERT INTO profesionales VALUES('11113333','Luis Alberto', 'Tapia Tapia','+5694326784',
'Ingeniero constructor', 'Proyecto 2','55555555');
INSERT INTO profesionales VALUES('11114444','Carolina Francisca', 'Rios del Sur','+56959876543',
'Prevencionista de riesgo', 'Proyecto 3','66666666');

COMMIT;