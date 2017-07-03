insert into tourist_attraction(id, description, latitude, longitude, name) values(10, 'Europaallee',47.378069,8.533666,'Europaallee');
insert into tourist_attraction(id, description, latitude, longitude, name) values(11,'Specialty Museums',47.375224,8.548010,'Zoological Museum');
insert into tourist_attraction(id, description, latitude, longitude, name) values(12,'Best place',47.372181,8.541318, 'Lindenhof');
insert into route(id,difficulty, duration, name) values(1,3, 2.5, 'zurich center');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,10,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,12,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,11,3);

insert into route(id,difficulty, duration, name) values(2,4, 0.5, 'zurich walk');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,10,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,11,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,12,3);

insert into tourist_attraction(id, description, latitude, longitude, name) values(16, 'Trains stop and shopping”',47.377923,8.540190,'Hauptbahnhof');
insert into route(id,difficulty, duration, name) values(3,2, 4.5, 'zurich mountains');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,11,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,10,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,16,3);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,12,4);


