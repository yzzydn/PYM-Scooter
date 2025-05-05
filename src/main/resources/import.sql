-- Stations
INSERT INTO station (id, name) VALUES (1, 'Basel SBB') ;
INSERT INTO station (id, name) VALUES (2, 'Basel Badischer Bahnhof');
INSERT INTO station (id, name) VALUES (3, 'Basel Bankveria');
INSERT INTO station (id, name) VALUES (4, 'Basel Claraplatz');

-- Scooters (5 LONG + 5 SHORT per station)
-- Basel SBB

INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 1, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 1, TRUE);

-- Basel Badischer Bahnhof
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 2, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 2, TRUE);

-- Basel Bankveria
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 3, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 3, TRUE);

-- Basel Claraplatz
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('LONG_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 4, TRUE);
INSERT INTO scooter (type, station_id, available) VALUES ('SHORT_DISTANCE', 4, TRUE);



