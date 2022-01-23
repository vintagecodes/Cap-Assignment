
# MongoDB

basics (creation, insertion, finding the data according to the condition)

Q. Connect to a running mongo instance
-> In command prompt write the command 
`mongosh`

Q. use a database named mongo_practice.

 creating database inside the cluster
use the command `use mongo_practice`

Q. Insert the documents into a movies collection 

creating a new collection named as movie, write the command 
`db.createCollection('movies')`

inserting documents with the query `insertMany`
> `db.movies.insertMany`([
>
`{
title: 'Pulp Function',
writer: 'Quentin Tarantino',
year: 1994,
actors: ['John Travoita','Uma Thurman']
},`
etc adding more like this 

# Query/Find documents

get all documents
using the below query

`db.movies.find()`

get all documents with writer set to "Quentin Tarantino"

`db.movies.find({writer: "Quentin Tarantino"})`

get all documents where actors include "Brad Pitt"

`db.movies.find({actors: "Brad Pitt"})`

get all documents with franchise set to "The Hobbit"

`db.movies.find({franchise: "The Hobbit"})`

get all movies released in the 90s

`db.movies.find({$and:[{year: {$gte: 1900}},{year: {$lt: 2000}}]})`

get all movies released before the year 2000 or after 2010

`db.movies.find({
$or:[
{year: {$lt: 2000}},
{year: {$gt: 2010}},
]})
`
where `$lt` stands for less than and `$gt` for greater than and `$gte` for greater than equal to 
and `$lte` for less than equal to.






