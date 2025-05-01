DROP TABLE IF EXISTS scooter;
DROP TABLE IF EXISTS station;

CREATE TABLE station (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    latitude DOUBLE NOT NULL,
    longitude DOUBLE NOT NULL
);

CREATE TABLE scooter (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255),
    station_id BIGINT,
    FOREIGN KEY (station_id) REFERENCES station(id)
);
