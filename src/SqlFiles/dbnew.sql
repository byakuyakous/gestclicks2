/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Abdelkrim
 * Created: Jan 24, 2019
 */





drop table if exists ADMINISTRATEUR;

drop table if exists ALLERGIE;

drop table if exists ANTECEDANT;



drop table if exists AVOIR_ALLERGIE;



drop table if exists AVOIR_ANTECEDANT;



drop table if exists COMPTE;


drop table if exists DENTISTE;



drop table if exists DONNER_CERTIFICAT;



drop table if exists DONNER_ORD;



drop table if exists OPERER;



drop table if exists PATIENT;


drop table if exists RECEPTIONISTE;


drop table if exists RENDEZ_VOUS;

/*==============================================================*/
/* Table: ADMINISTRATEUR                                        */
/*==============================================================*/
create table ADMINISTRATEUR
(
   ID_ADMIN                       varchar(20)                    not null,
   LOGIN                          varchar(20),
   CIN                            varchar(20),
   NOM                            varchar(20),
   PRENOM                         varchar(20),
   SEXE                           varchar(10),
   ADRESS                         varchar(100),
   TELEPHONE                      varchar(20),
   EMAIL                          varchar(20),
   DATE_NAISSANCE                 date,
   DATE_EMBAUCHE                  date,
   primary key (ID_ADMIN)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AUTHENTIFICATIONA2_FK                                 */
/*==============================================================*/
create index AUTHENTIFICATIONA2_FK on ADMINISTRATEUR
(
   LOGIN
);

/*==============================================================*/
/* Table: ALLERGIE                                              */
/*==============================================================*/
create table ALLERGIE
(
   DESIGNATION                    varchar(20)                    not null,
   DEGRE                          varchar(20),
   primary key (DESIGNATION)
)
ENGINE = Innodb;

/*==============================================================*/
/* Table: ANTECEDANT                                            */
/*==============================================================*/
create table ANTECEDANT
(
   DESIGNATION                    varchar(20)                    not null,
   DESCRIPTION                    varchar(100),
   primary key (DESIGNATION)
)
ENGINE = Innodb;

/*==============================================================*/
/* Table: AVOIR_ALLERGIE                                        */
/*==============================================================*/
create table AVOIR_ALLERGIE
(
   ID_PATIENT                     varchar(20)                    not null,
   DESIGNATION                    varchar(20)                    not null,
   primary key (ID_PATIENT, DESIGNATION)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AVOIR_ALLERGIE_FK                                     */
/*==============================================================*/
create index AVOIR_ALLERGIE_FK on AVOIR_ALLERGIE
(
   ID_PATIENT
);

/*==============================================================*/
/* Index: AVOIR_ALLERGIE2_FK                                    */
/*==============================================================*/
create index AVOIR_ALLERGIE2_FK on AVOIR_ALLERGIE
(
   DESIGNATION
);

/*==============================================================*/
/* Table: AVOIR_ANTECEDANT                                      */
/*==============================================================*/
create table AVOIR_ANTECEDANT
(
   ID_PATIENT                     varchar(20)                    not null,
   DESIGNATION                    varchar(20)                    not null,
   primary key (ID_PATIENT, DESIGNATION)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AVOIR_ANTECEDANT_FK                                   */
/*==============================================================*/
create index AVOIR_ANTECEDANT_FK on AVOIR_ANTECEDANT
(
   ID_PATIENT
);

/*==============================================================*/
/* Index: AVOIR_ANTECEDANT2_FK                                  */
/*==============================================================*/
create index AVOIR_ANTECEDANT2_FK on AVOIR_ANTECEDANT
(
   DESIGNATION
);

/*==============================================================*/
/* Table: COMPTE                                                */
/*==============================================================*/
create table COMPTE
(
   LOGIN                          varchar(20)                    not null,
   IID_ADMIN                      varchar(20)                    not null,
   MDP                            varchar(20),
   primary key (LOGIN)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AUTHENTIFICATIOND_FK                                  */
/*==============================================================*/

/*==============================================================*/
/* Index: CREER_FK                                              */
/*==============================================================*/
create index CREER_FK on COMPTE
(
   IID_ADMIN
);

/*==============================================================*/
/* Table: DENTISTE                                              */
/*==============================================================*/
create table DENTISTE
(
   ID_DENTISTE                    varchar(20)                    not null,
   LOGIN                          varchar(20),
   CIN                            varchar(20),
   NOM                            varchar(20),
   PRENOM                         varchar(20),
   SEXE                           varchar(20),
   ADRESS                         varchar(100),
   TELEPHONE                      varchar(20),
   EMAIL                          varchar(20),
   DATE_NAISSANCE                 date,
   DATE_EMBAUCHE                  date,
   primary key (ID_DENTISTE)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AUTHENTIFICATIOND2_FK                                 */
/*==============================================================*/
create index AUTHENTIFICATIOND2_FK on DENTISTE
(
   LOGIN
);

/*==============================================================*/
/* Table: DONNER_CERTIFICAT                                     */
/*==============================================================*/
create table DONNER_CERTIFICAT
(
   ID_PATIENT                     varchar(20)                    not null,
   ID_DENTISTE                    varchar(20)                    not null,
   DATECERTIFICAT                 date,
   DESCRIPTION                    varchar(300),
   primary key (ID_PATIENT, ID_DENTISTE)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: DONNER_CERTIFICAT_FK                                  */
/*==============================================================*/
create index DONNER_CERTIFICAT_FK on DONNER_CERTIFICAT
(
   ID_PATIENT
);

/*==============================================================*/
/* Index: DONNER_CERTIFICAT2_FK                                 */
/*==============================================================*/
create index DONNER_CERTIFICAT2_FK on DONNER_CERTIFICAT
(
   ID_DENTISTE
);

/*==============================================================*/
/* Table: DONNER_ORD                                            */
/*==============================================================*/
create table DONNER_ORD
(
   ID_PATIENT                     varchar(20)                    not null,
   ID_DENTISTE                    varchar(20)                    not null,
   DATEORD                        date,
   DESCRIPTION                    varchar(300),
   primary key (ID_PATIENT, ID_DENTISTE)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: DONNER_ORD_FK                                         */
/*==============================================================*/
create index DONNER_ORD_FK on DONNER_ORD
(
   ID_PATIENT
);

/*==============================================================*/
/* Index: DONNER_ORD2_FK                                        */
/*==============================================================*/
create index DONNER_ORD2_FK on DONNER_ORD
(
   ID_DENTISTE
);

/*==============================================================*/
/* Table: OPERER                                                */
/*==============================================================*/
create table OPERER
(
   ID_PATIENT                     varchar(20)                    not null,
   ID_DENTISTE                    varchar(20)                    not null,
   TYPEOP                         varchar(30),
   DATEOP                         date,
   REMARQUES                      varchar(200),
   primary key (ID_PATIENT, ID_DENTISTE)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: OPERER_FK                                             */
/*==============================================================*/
create index OPERER_FK on OPERER
(
   ID_PATIENT
);

/*==============================================================*/
/* Index: OPERER2_FK                                            */
/*==============================================================*/
create index OPERER2_FK on OPERER
(
   ID_DENTISTE
);

/*==============================================================*/
/* Table: PATIENT                                               */
/*==============================================================*/
create table PATIENT
(
   ID_PATIENT                     varchar(20)                    not null,
   ID_DENTISTE                    varchar(20)                    not null,
   ID_RECEPTIONNISTE              varchar(20)                    not null,
   NOM                            varchar(20),
   PRENOM                         varchar(20),
   CIN                            varchar(20),
   SEXE                           varchar(10),
   DATE_NAISSANCE                 date,
   ADRESS                         varchar(80),
   TELEPHONE                      varchar(20),
   EMAIL                          varchar(25),
   TYPE_DE_SANG                   varchar(20),
   DATEINSCRIPTION                date,
   primary key (ID_PATIENT)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: CREER_DOSSIER_FK                                      */
/*==============================================================*/
create index CREER_DOSSIER_FK on PATIENT
(
   ID_RECEPTIONNISTE
);

/*==============================================================*/
/* Index: ASSISTER_FK                                           */
/*==============================================================*/
create index ASSISTER_FK on PATIENT
(
   ID_DENTISTE
);

/*==============================================================*/
/* Table: RECEPTIONISTE                                         */
/*==============================================================*/
create table RECEPTIONISTE
(
   ID_RECEPTIONNISTE              varchar(20)                    not null,
   LOGIN                          varchar(20),
   CIN                            varchar(20),
   NOM                            varchar(20),
   PRENOM                         varchar(20),
   SEXE                           varchar(20),
   ADRESS                         varchar(100),
   TELEPHONE                      varchar(20),
   EMAIL                          longtext,
   DATE_NAISSANCE                 date,
   DATE_EMBAUCHE                  date,
   primary key (ID_RECEPTIONNISTE)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: AUTHENTIFICATIONR2_FK                                 */
/*==============================================================*/
create index AUTHENTIFICATIONR2_FK on RECEPTIONISTE
(
   LOGIN
);

/*==============================================================*/
/* Table: RENDEZ_VOUS                                           */
/*==============================================================*/
create table RENDEZ_VOUS
(
   ID_RECEPTIONNISTE              varchar(20)                    not null,
   ID_PATIENT                     varchar(20)                    not null,
   DATERDV                        date,
   HEURERDV                       date,
   ANNULATION                     bool,
   primary key (ID_RECEPTIONNISTE, ID_PATIENT)
)
ENGINE = Innodb;

/*==============================================================*/
/* Index: RENDEZ_VOUS_FK                                        */
/*==============================================================*/
create index RENDEZ_VOUS_FK on RENDEZ_VOUS
(
   ID_RECEPTIONNISTE
);

/*==============================================================*/
/* Index: RENDEZ_VOUS2_FK                                       */
/*==============================================================*/
create index RENDEZ_VOUS2_FK on RENDEZ_VOUS
(
   ID_PATIENT
);

alter table ADMINISTRATEUR add constraint FK_AUTHENTIFICATIONA2 foreign key (LOGIN)
      references COMPTE (LOGIN) on delete restrict on update restrict;

alter table AVOIR_ALLERGIE add constraint FK_AVOIR_ALLERGIE foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;

alter table AVOIR_ALLERGIE add constraint FK_AVOIR_ALLERGIE2 foreign key (DESIGNATION)
      references ALLERGIE (DESIGNATION) on delete restrict on update restrict;

alter table AVOIR_ANTECEDANT add constraint FK_AVOIR_ANTECEDANT foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;

alter table AVOIR_ANTECEDANT add constraint FK_AVOIR_ANTECEDANT2 foreign key (DESIGNATION)
      references ANTECEDANT (DESIGNATION) on delete restrict on update restrict;


alter table COMPTE add constraint FK_CREER foreign key (IID_ADMIN)
      references ADMINISTRATEUR (ID_ADMIN) on delete restrict on update restrict;

alter table DENTISTE add constraint FK_AUTHENTIFICATIOND2 foreign key (LOGIN)
      references COMPTE (LOGIN) on delete restrict on update restrict;

alter table DONNER_CERTIFICAT add constraint FK_DONNER_CERTIFICAT foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;

alter table DONNER_CERTIFICAT add constraint FK_DONNER_CERTIFICAT2 foreign key (ID_DENTISTE)
      references DENTISTE (ID_DENTISTE) on delete restrict on update restrict;

alter table DONNER_ORD add constraint FK_DONNER_ORD foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;

alter table DONNER_ORD add constraint FK_DONNER_ORD2 foreign key (ID_DENTISTE)
      references DENTISTE (ID_DENTISTE) on delete restrict on update restrict;

alter table OPERER add constraint FK_OPERER foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;

alter table OPERER add constraint FK_OPERER2 foreign key (ID_DENTISTE)
      references DENTISTE (ID_DENTISTE) on delete restrict on update restrict;

alter table PATIENT add constraint FK_ASSISTER foreign key (ID_DENTISTE)
      references DENTISTE (ID_DENTISTE) on delete restrict on update restrict;

alter table PATIENT add constraint FK_CREER_DOSSIER foreign key (ID_RECEPTIONNISTE)
      references RECEPTIONISTE (ID_RECEPTIONNISTE) on delete restrict on update restrict;

alter table RECEPTIONISTE add constraint FK_AUTHENTIFICATIONR2 foreign key (LOGIN)
      references COMPTE (LOGIN) on delete restrict on update restrict;

alter table RENDEZ_VOUS add constraint FK_RENDEZ_VOUS foreign key (ID_RECEPTIONNISTE)
      references RECEPTIONISTE (ID_RECEPTIONNISTE) on delete restrict on update restrict;

alter table RENDEZ_VOUS add constraint FK_RENDEZ_VOUS2 foreign key (ID_PATIENT)
      references PATIENT (ID_PATIENT) on delete restrict on update restrict;
