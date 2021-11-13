DROP TABLE IF EXISTS cars;

CREATE TABLE cars(
             id INT AUTO_INCREMENT  PRIMARY KEY,
             brand VARCHAR(250) NOT NULL,
             model VARCHAR(250) NOT NULL,
             yearOfProduction INT DEFAULT NULL
);

INSERT INTO cars (brand, model, yearOfProduction) VALUES
            ('Ford', 'Mustang', 2017),
            ('Toyota', 'Aygo', 2022),
            ('BMW', 'M2', 2023);
