delete from route;
delete from route_tourist_attraction;
delete from tourist_attraction;

insert into tourist_attraction(id, description, latitude, longitude, name) values(10, 'All along Europaallee, Lagerstrasse and in the Europaallee passage, well-known brands rub shoulders with trendy boutiques featuring innovative concepts – ranging from flagship stores to small boutiques, from the established to the unconventional, and from outlets stocking items of everyday use to those selling out-of-the-ordinary wares. Whether you are looking for sustainably produced yoga outfits, up-and-coming Swiss fashion labels, sports and outdoor equipment, handmade leather shoes or urban gardening utensils – in the new Europaallee quarter, you will find fashion and lifestyle articles that you can look for elsewhere in vain.',47.378069,8.533666,'Europaallee');
insert into tourist_attraction(id, description, latitude, longitude, name) values(11,'Zoological Museum at the University of Zurich – a Journey Into the Animal Kingdom. There is quacking, shrieking, grunting and chirping at the University of Zurich’s Zoological Museum. The museum is home to 1.500 animals and many can be heard.',47.375224,8.548010,'Zoological Museum');
insert into tourist_attraction(id, description, latitude, longitude, name) values(12,'The Lindenhof in the old town of Zürich is the historical site of the Roman castle, and the later Carolingian Kaiserpfalz. It is situated on the Lindenhof hill, on the left side of the Limmat at the Schipfe.In 1747, a 2nd-century Roman tombstone was discovered at the site, bearing the oldest attestation of Turīcum, the Roman era name of Zürich, as STA[tio] TURIC[ensis], at the time a tax collecting point. The castle remained intact during the early phase of Alemannic immigration in the 5th to 6th century, but was derelict by the 9th century, when it was rebuilt as a residence for Louis the German, which in turn became dilapidated and used as a source of building stone by the 13th century. The Lindenhof remained a place of civil assembly into modern times. In 1798, the citizens of Zürich swore the oath to the constitution of the Helvetic Republic on the Lindenhof.',47.372181,8.541318, 'Lindenhof');
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


