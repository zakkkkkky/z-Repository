
--コード

DROP SCHEMA IF EXISTS コード CASCADE;
CREATE SCHEMA コード;

CREATE TABLE コード.コードID (
    コードID UUID PRIMARY KEY,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE コード.コードトーン (
    コードID UUID PRIMARY KEY REFERENCES コード.コードID(コードID),
    root VARCHAR(3) NOT NULL,
    third VARCHAR(3) NOT NULL,
    fifth VARCHAR(3) NOT NULL,
    seventh VARCHAR(3) NOT NULL,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE コード.テンションノート (
    コードID UUID PRIMARY KEY REFERENCES コード.コードID(コードID),
    ninth VARCHAR(3) NOT NULL,
    eleventh VARCHAR(3) NOT NULL,
    thirteenth VARCHAR(3) NOT NULL,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE コード.付加音程 (
    コードID UUID PRIMARY KEY REFERENCES コード.コードID(コードID),
    second VARCHAR(3) NOT NULL,
    forth VARCHAR(3) NOT NULL,
    sixth VARCHAR(3) NOT NULL,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

--プレイヤー

DROP SCHEMA IF EXISTS プレイヤー CASCADE;
CREATE SCHEMA プレイヤー;

CREATE TABLE プレイヤー.プレイヤーID (
    プレイヤーID UUID PRIMARY KEY,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE プレイヤー.パート (
    パート名 VARCHAR(4) PRIMARY KEY,
);

INSERT INTO プレイヤー.パート
    (パート名)
VALUES
     ('Lead')
    ,('1st')
    ,('2nd')
    ,('3rd')
    ,('Bass')
;

CREATE TABLE プレイヤー.プロフィール (
    プレイヤーID UUID PRIMARY KEY REFERENCES コード.コードID(コードID),
    氏名 VARCHAR(50) NOT NULL,
    パート名 VARCHAR(4) NOT NULL REFERENCES プレイヤー.パート(パート名),
    声域_上限 VARCHAR(3) NOT NULL,
    声域_下限 VARCHAR(3) NOT NULL,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

--ボイシング

DROP SCHEMA IF EXISTS ボイシング CASCADE;
CREATE SCHEMA ボイシング;

CREATE TABLE ボイシング.配置(
    配置 VARCHAR(5) NOT NULL,
);

INSERT INTO ボイシング.配置
    (配置)
VALUES
     ('密集')
    ,('離離')
    ,('オクターブ')
;

CREATE TABLE ボイシング.ボイシングID (
    ボイシングID UUID PRIMARY KEY,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ボイシング.条件 (
    ボイシングID UUID NOT NULL REFERENCES ボイシング.ボイシングID(ボイシングID),
    条件ID UUID NOT NULL,
    PRIMARY KEY (ボイシングID, 条件ID),
    配置 VARCHAR(5) NOT NULL REFERENCES ボイシング.配置(配置),
    転回 INT NOT NULL,
    -- TODO Top Note?
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ボイシング.ボイシング (
    ボイシングID UUID NOT NULL REFERENCES ボイシング.ボイシングID(ボイシングID),
    プレイヤーID UUID NOT NULL REFERENCES プレイヤー.プレイヤーID(プレイヤーID),
    PRIMARY KEY (ボイシングID, プレイヤーID),
    音程 VARCHAR(3) NOT NULL,
    UNIQUE (プレイヤーID, 音程),
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


--TODO リーディング（連結）
