CREATE TABLE cars(
  id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(255) NOT NULL,
  year    VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

CREATE TABLE sellers(
  id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(255) NOT NULL,
  adress    VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;
