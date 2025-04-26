-- Insert stations first
INSERT INTO station (id, name, latitude, longitude) VALUES (1, 'Central Park Station', 40.785091, -73.968285);
INSERT INTO station (id, name, latitude, longitude) VALUES (2, 'Downtown Station', 40.712776, -74.005974);
INSERT INTO station (id, name, latitude, longitude) VALUES (3, 'Uptown Station', 40.787011, -73.975368);

-- Insert scooters
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (1, 'Standard', true, 85, 1);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (2, 'Electric', true, 65, 1);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (3, 'Standard', true, 92, 2);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (4, 'Electric', false, 30, 2);
INSERT INTO scooter (id, type, available, battery_level, station_id) VALUES (5, 'Standard', true, 77, 3);
