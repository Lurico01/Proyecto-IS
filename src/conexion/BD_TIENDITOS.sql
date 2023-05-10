	-- crear base de datos
create database Tienditos;
use Tienditos;

-- crear tabla usuarios
CREATE TABLE tb_Usuario(
  Id_Usuario INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  usuario VARCHAR(15) NOT NULL,
  password VARCHAR(15) NOT NULL,
  telefono VARCHAR(15) NOT NULL,
  estado int not null
);

insert into tb_Usuario (nombre,apellido,usuario,password,telefono,estado) values ("Juan","Garnizo","Juan23","12345",'833-416-5123',1);
select * from tb_Usuario;
select usuario, password from tb_Usuario where usuario = "Juan23" and password = "12345";

-- crear tabla Cliente
CREATE TABLE tb_Cliente (
  Id_Cliente int auto_increment primary key,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  cedula VARCHAR(15) NOT NULL,
  telefono VARCHAR(15) NOT NULL,
  direccion VARCHAR(100) not null,
  estado int not null
);

-- crear tabla Proveedor
CREATE TABLE tb_Proveedor (
  Id_Proveedor INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  empresa VARCHAR(50) not null,
  tel_trabajo VARCHAR(15) not null,
  correo VARCHAR(50) not null,
  tel_Company VARCHAR(20) not null, 
  direcc_Company VARCHAR(255),
  estado int not null
);
	insert into tb_Proveedor (nombre,apellido,empresa,tel_trabajo,correo,tel_Company,direcc_Company,estado) values ("Luis","Cruz","COCA COLA","8334151234","coca_cola@gmail.com","7831113334", "Col.Lomas calle Lucio #441 Tampico,Tamps", 1);
	insert into tb_Proveedor (nombre,apellido,empresa,tel_trabajo,correo,tel_Company,direcc_Company,estado) values ("Javier","Duarte","LALA","8334161234","lala@gmail.com","7831123334", "Col.Rosa calle Marte #403 Altamira,Tamps", 1);
	
    select * from tb_Proveedor;
    select * from tb_Producto;
    truncate table tb_Proveedor;
    truncate table tb_Producto;
    truncate table tb_categoria;
-- crear tabla Categoria
CREATE TABLE tb_Categoria(
  Id_Categoria INT AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(200) NOT NULL,
  estado int not null
);

-- crear tabla Producto
CREATE TABLE tb_Producto (
  Id_Producto INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  Id_Proveedor int not null,
  cantidad int not null,
  precio decimal(10,2) NOT NULL,
  descripcion varchar(200) not null,
  porcentajeIva int not null,
  Id_Categoria int not null,
  estado int not null
);

-- crear tabla cabecera de ventas
CREATE TABLE tb_cabecera_venta (
  Id_cabecera_venta INT AUTO_INCREMENT PRIMARY KEY,
  Id_Cliente int not null,
  valorPagar decimal(10,2) not null,
  fechaVenta date not null,
  estado int not null
);
	
 -- crear tabla detalle de venta
CREATE TABLE tb_detalle_venta (
  Id_detalle_venta INT AUTO_INCREMENT PRIMARY KEY,
  Id_cabecera_venta INT not null,
  Id_Producto INT not null,
  cantidad INT NOT NULL,
  precio_unitario DECIMAL(10,2) NOT NULL,
  subtotal DECIMAL(10,2) NOT NULL,
  descuento DECIMAL(10,2) NOT NULL,
  iva DECIMAL(10,2) NOT NULL,
  total_pagar DECIMAL(10,2) NOT NULL,
  estado int not null 
);

select * from tb_categoria;
select descripcion from tb_categoria where descripcion = 'bebidas';
truncate table tb_categoria;