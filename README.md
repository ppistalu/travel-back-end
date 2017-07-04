#### Api's:

```javascript 
GET  /home/search?query={search} 
```

retrives a list of routes (with id, name and picture), searched by name or part of the name, ignoring upper or lower case
```javascript       
GET  /home
```

retrieves a list of all routes (with id, name and picture)
```javascript
GET /routes/{id}
```

retrives an ordered list with all the tourist attractions for a specific route - it is a list of objects with id, latitude, longitude, name, description
```javascript       
GET  /routes/attraction/{10}
```
retrives a list with all the routes that contain a tourist attraction - it is a list of objects with id, name, description, difficulty, duration
