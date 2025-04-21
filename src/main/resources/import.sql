INSERT INTO station (id, name, location) VALUES (1, 'Basel SBB', 'Central Basel');
INSERT INTO station (id, name, location) VALUES (2, 'Basel Badischer Bahnhof', 'North Basel');
INSERT INTO station (id, name, location) VALUES (3, 'Basel Claraplatz', 'East Basel');

INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (1, 'Standard', true, 85, 1);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (2, 'Electric', true, 65, 1);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (3, 'Standard', true, 92, 2);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (4, 'Electric', false, 30, 2);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (5, 'Standard', true, 77, 3);
