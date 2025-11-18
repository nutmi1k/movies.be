CREATE database moviedb_docker;

CREATE TABLE movie(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    director VARCHAR (255),
    year INT,
    rating INT,
    dvd TINYINT(1),
    blue_ray TINYINT(1)
);