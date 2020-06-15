create table stock(
ref VARCHAR(50) PRIMARY KEY,
quantity TINYINT NOT NULL,
FOREIGN KEY (ref)
        REFERENCES products (ref)
        ON UPDATE RESTRICT ON DELETE CASCADE
);

create table products(
  ref VARCHAR(50) PRIMARY KEY,
  product VARCHAR(50) NOT NULL
)ENGINE=INNODB;

create table registers_history(
  Id INT PRIMARY KEY,
  ref VARCHAR(50),
  product VARCHAR(50) NOT NULL,
  cost TINYINT NOT NULL,
  quantity TINYINT NOT NULL,
  acting VARCHAR(50) NOT NULL,
  provider_id INT,
  FOREIGN KEY (ref)
        REFERENCES products (ref )
        ON UPDATE RESTRICT ON DELETE CASCADE,
  FOREIGN KEY (provider_id)
        REFERENCES providers (provider_id )
        ON UPDATE RESTRICT ON DELETE CASCADE,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create table providers(
provider_id INT AUTO_INCREMENT PRIMARY KEY,
provider_name VARCHAR(50) NOT NULL
);  