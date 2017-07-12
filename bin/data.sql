insert into tourist_attraction(id, description, latitude, longitude, name, photo) values(10, 'All along Europaallee, Lagerstrasse and in the Europaallee passage, well-known brands rub shoulders with trendy boutiques featuring innovative concepts – ranging from flagship stores to small boutiques, from the established to the unconventional, and from outlets stocking items of everyday use to those selling out-of-the-ordinary wares. Whether you are looking for sustainably produced yoga outfits, up-and-coming Swiss fashion labels, sports and outdoor equipment, handmade leather shoes or urban gardening utensils – in the new Europaallee quarter, you will find fashion and lifestyle articles that you can look for elsewhere in vain.',47.378069,8.533666,'Europaallee', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpW20UXr4nqQc5z8uoaz0Bwt56PzmUvV-10oVs1IZNjTGiWPnlejRsldU');
insert into tourist_attraction(id, description, latitude, longitude, name, photo) values(11,'Zoological Museum at the University of Zurich – a Journey Into the Animal Kingdom. There is quacking, shrieking, grunting and chirping at the University of Zurich’s Zoological Museum. The museum is home to 1.500 animals and many can be heard.',47.375224,8.548010,'Zoological Museum','https://cdn.zuerich.com/sites/default/files/styles/split_screen_big/public/keyvisual/web_zurich_museum_zoologischesmuseum_01.jpg?itok=Xm7-rX98&timestamp=1447940046');
insert into tourist_attraction(id, description, latitude, longitude, name, photo) values(12,'The Lindenhof in the old town of Zürich is the historical site of the Roman castle, and the later Carolingian Kaiserpfalz.',47.372181,8.541318, 'Lindenhof','https://cdn.zuerich.com/sites/default/files/styles/split_screen_big/public/keyvisual/web_zuerich_lindenhof.jpg?itok=rqvHGmJR&timestamp=1482159152');
insert into route(id, description, difficulty, duration, name, photo) values(1,'Much of the ancient centre, with its winding lanes and tall church steeples, has been kept lovingly intact. ',3, 2.5, 'Zurich center', 'http://img.myswitzerland.com/mys/n26179/images/buehne/8_barfussbar.jpg');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,10,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,12,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(1,11,3);

insert into route(id, description, difficulty, duration, name, photo) values(2, 'Culturally vibrant, efficiently run and attractively set at the meeting of river and lake, Zürich is regularly recognised as one of the world s most liveable cities. ', 4, 0.5, 'Zurich walk', 'http://img.myswitzerland.com/mys/n64489/images/buehne/st0032657_zuerich_nacht-1.jpg');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,10,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,11,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(2,12,3);

insert into tourist_attraction(id, description, latitude, longitude, name) values(16, 'Trains stop and shopping”',47.377923,8.540190,'Hauptbahnhof');
insert into route(id, description, difficulty, duration, name, photo) values(3, ' Long known as a savvy, hard-working financial centre, Switzerland s largest and wealthiest metropolis has also emerged in the 21st century as one of central Europe s hippest destinations, with an artsy, post-industrial edge that is epitomised in its exuberant summer Street Parade.', 2, 4.5, 'Zurich mountains', 'https://artborghi.files.wordpress.com/2013/08/dsc_5866.jpg');
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,11,1);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,10,2);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,16,3);
insert into route_tourist_attraction(route_id,tourist_attraction_id, order_travel) values(3,12,4);


insert into route (id, description, difficulty, duration, name, photo) values (4, 'test', 2, 4, 'Bucharest',' https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0pGjEj82EjMse9IsKmjIOYRwE0VM0owV_PMTnamQi-YDrCbAfAA');
insert into route (id, description, difficulty, duration, name, photo) values (5, 'test', 5, 5, 'Madrid', 'https://www.herbertsmithfreehills.com/sites/contenthub_mothership/files/styles/latest_thinking_images__950x650_/public/Locations-Madrid.jpg?itok=PDBtF6ov');
insert into route (id, description, difficulty, duration, name, photo) values (6,'test', 4, 6, 'Lisbon', 'http://www.orangesmile.com/common/img_cities_original/lisbon--2167973-2.jpg');
insert into route (id, description, difficulty, duration, name, photo) values (7,'test', 2, 7, 'Sintra', 'https://cache-graphicslib.viator.com/graphicslib/thumbs360x240/7776/SITours/private-sightseeing-tour-to-sintra-and-cascais-from-lisbon-in-lisbon-228667.jpg');
insert into route (id, description, difficulty, duration, name, photo) values (8,'test', 2, 8, 'Basel', 'http://cdn.traveler.es/uploads/images/thumbs/es/trav/2/s/2016/19/la_ciudad_suiza_a_caballo_entre_francia_y_alemania_5269_630x.jpg');


