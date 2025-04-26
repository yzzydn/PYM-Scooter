DROP TABLE IF EXISTS scooter;
DROP TABLE IF EXISTS station;

CREATE TABLE station (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    latitude DOUBLE NOT NULL,
    longitude DOUBLE NOT NULL
);

CREATE TABLE scooter (
    id BIGINT PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    available BOOLEAN NOT NULL,
    battery_level INTEGER NOT NULL CHECK (battery_level >= 0 AND battery_level <= 100),
    station_id BIGINT,
    FOREIGN KEY (station_id) REFERENCES station(id)
);
