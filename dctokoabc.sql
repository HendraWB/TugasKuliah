CREATE TABLE tbbarang (
	KodeBarang char(10) PRIMARY KEY,
    NamaBarang varchar (30),
    SatuanBarang varchar (15),
    HargaBarang int,
    StockBarang int
);

CREATE TABLE tbcustomer (
	KodeCustomer char(10) PRIMARY KEY,
    NamaCustomer varchar (30),
    AlamatCustomer varchar (100),
    NoTelepon varchar (15),
    Email varchar (40)
);

CREATE TABLE tbuser (
	IDUser char(30) PRIMARY KEY,
    NamaUser varchar (30),
    PasswordUser char (64),
    HakAkses char (20)
);

CREATE TABLE tbpenjualan (
  NoNota char(10) PRIMARY KEY,
  Tanggal datetime,
  KodeCustomer char (10),
  IDUser char (30),
  FOREIGN KEY (IDUser) REFERENCES tbuser(IDUser), FOREIGN KEY (KodeCustomer) REFERENCES tbcustomer(KodeCustomer) );

CREATE TABLE tbdetilpenjualan (
  NoNota char(10),
  KodeBarang char(10),
  Harga int,
  Qty int,
  FOREIGN KEY (NoNota) REFERENCES tbpenjualan(NoNota), FOREIGN KEY (KodeBarang) REFERENCES tbbarang(KodeBarang) );
