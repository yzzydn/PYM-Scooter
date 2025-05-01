-- Stations
INSERT INTO station (id, name, latitude, longitude) VALUES (1, 'Basel SBB', 47.547, 7.589);
INSERT INTO station (id, name, latitude, longitude) VALUES (2, 'Basel Badischer Bahnhof', 47.576, 7.609);
INSERT INTO station (id, name, latitude, longitude) VALUES (3, 'Basel Bankveria', 47.561, 7.597);
INSERT INTO station (id, name, latitude, longitude) VALUES (4, 'Basel Claraplatz', 47.562, 7.600);

-- Scooters (5 LONG + 5 SHORT per station)
-- Basel SBB
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 1);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 1);

-- Basel Badischer Bahnhof
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 2);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 2);

-- Basel Bankveria
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 3);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 3);

-- Basel Claraplatz
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('LONG_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 4);
INSERT INTO scooter (type, station_id) VALUES ('SHORT_DISTANCE', 4);
