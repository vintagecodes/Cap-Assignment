
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

# Query/Update Documents

add a synopsis to "The Hobbit: An Unexpected Journey" : "A reluctant hobbit, 
Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of 
dwarves to reclaim their mountain home - and the gold within it - from the 
dragon Smaug."

` db.movies.updateOne({ title: "The Hobbit: An Unexpected Journey" }, { $set: { "synopsis": "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home- and the gold within it- from the dragon Smaug."}}`


add a synopsis to "The Hobbit: The Desolation of Smaug" : "The dwarves, 
along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim 
Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a 
mysterious and magical ring

`db.movies.updateOne({ title: "The Hobbit: The Desolation of Smaug" }, { $set: { "synopsis": "The dwarves, along with Bilbo Baggins and Gandhalf the Grey, continue their quest to reclaim Erebror, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring." } })`

add an actor named "Samuel L. Jackson" to the movie "Pulp Fiction"

`db.movies.updateOne({title: "Pulp Function"},{$set: {"actors":"Samuel L. Jackson"}})`


# TextSearch

find all movies that have a synopsis that contains the word "Bilbo

 > db.movies.find({synopsis:{$regex:"Bilbo"}})

find all movies that have a synopsis that contains the word "Gandalf"

 > db.movies.find({synopsis:{$regex:"Gandalf"}})

find all movies that have a synopsis that contains the word "Bilbo" and not the 
word "Gandalf"

 > db.movies.find({$and:[{synopsis:{$regex:"Bilbo"}}, {synopsis:{$not:/Gandalf/}}]})

find all movies that have a synopsis that contains the word "dwarves" or 
"hobbit"

 > db.movies.find({$or:[{synopsis:{$regex:"dwarves"}}, {synopsis:{$regex:"hobbit"}}]})

find all movies that have a synopsis that contains the word "gold" and 
"dragon"

 > db.movies.find({$and:[{synopsis:{$regex:"gold"}}, {synopsis:{$regex:"dragon"}}]})


# Delete Documents

delete the movie "Pee Wee Herman's Big Adventure"

`db.movies.deleteOne({"title":"Pee Wee Herman's Big Adventures"})`

delete the movie "Avatar"

`db.movies.deleteOne({"title":"Avatar"})`


# Relationships

### Insert the following documents into a `users` collection

```
username : GoodGuyGreg
first_name : "Good Guy"
last_name : "Greg"
```
```
db.users.insert({_id:1,username:"GoodGuyGreg", first_name:"Good Guy", last_name:"Greg"})
```

```
username : ScumbagSteve
full_name :
  first : "Scumbag"
  last : "Steve"

```
```
db.users.insert({_id:2, username:"ScumbagSteve", fullname:{first: "Scumbag", last:"Steve"}})
```
### Insert the following documents into a `posts` collection

```
username : GoodGuyGreg
title : Passes out at party
body : Wakes up early and cleans house
```
```
db.posts.insert({username:"GoodGuyGreg", title:"Passes out at Party", body:"Raises your credit score"})
```
```
username : GoodGuyGreg
title : Steals your identity
body : Raises your credit score
```
```
db.posts.insert({ username:"GoodGuyGreg", title:"Steals your identity", body:"Raises your credit score"})
```

```
username : GoodGuyGreg
title : Reports a bug in your code
body : Sends you a Pull Request
```
```
db.posts.insert({username:"GoodGuyGreg", title:"Reports a bug in your code", body:"Sends you a pull request"})
```

```
username : ScumbagSteve
title : Borrows something
body : Sells it
```
```
db.posts.insert({ username:"ScumbagSteve", title:"Borrows something", body:"Sells it"})
```

```
username : ScumbagSteve
title : Borrows everything
body : The end
```
```
db.posts.insert({ username:"ScumbagSteve", title:"Borrows everything", body:"The end"})
```

```
username : ScumbagSteve
title : Forks your repo on github
body : Sets to private
```
```
db.posts.insert({username:"ScumbagSteve", title:"Forks your repo on github", body:"Sets to private"})
```


# comments

inserting comments

username : GoodGuyGreg
comment : Hope you got a good deal!
post : [post_obj_id]
where [post_obj_id] is the ObjectId of the posts document: "Borrows something"

`db.comments.insert({ username:"GoodGuyGreg", comment:"Hope you got a good deal!", post:ObjectId("5ca0b7e96435f98b5901f463")})`

username : GoodGuyGreg
comment : What's mine is yours!
post : [post_obj_id]
where [post_obj_id] is the ObjectId of the posts document: "Borrows everything"

` db.comments.insert({ username:"GoodGuyGreg", comment:"what's mine in yours!", post:ObjectId("61f1401dfa139b3303a6f516")})`

username : GoodGuyGreg
comment : Don't violate the licensing agreement!
post : [post_obj_id]
where [post_obj_id] is the ObjectId of the posts document: "Forks your repo on 
github

`db.comments.insert({ username:"GoodGuyGreg", comment:"Don't violate the licensing agreement!", post:ObjectId("61f14022fa139b3303a6f517")})`

username : ScumbagSteve
comment : It still isn't clean
post : [post_obj_id]
where [post_obj_id] is the ObjectId of the posts document: "Passes out at party"

`db.comments.insert({ username:"ScumbagSteve", comment:"It still isn't clean", post:ObjectId("61f14005fa139b3303a6f512")})`

username : ScumbagSteve
comment : Denied your PR cause I found a hack
post : [post_obj_id]
where [post_obj_id] is the ObjectId of the posts document: "Reports a bug in your 
code"


`db.comments.insert({ username:"ScumbagSteve", comment:"Denied your PR cause I found a hack", post:ObjectId("61f14012fa139b3303a6f514")})`


# Quering related collections

1. find all users
```
db.users.find().pretty()
```

2. find all posts
```
db.posts.find().pretty()
```
3. find all posts that was authored by "GoodGuyGreg"
```
db.posts.find({username:"GoodGuyGreg"})
```
4. find all posts that was authored by "ScumbagSteve"
```
db.posts.find({username:"ScumbagSteve"})
```
5. find all comments
```
db.comments.find().pretty()
```
6. find all comments that was authored by "GoodGuyGreg"
```
db.comments.find({username:"GoodGuyGreg"})
```
7. find all comments that was authored by "ScumbagSteve"
```
db.comments.find({username:"ScumbagSteve"})
```
8. find all comments belonging to the post "Reports a bug in your code"

```
db.comments.find({post: ObjectId("61f14012fa139b3303a6f514")})
```


# Assignment-2 Aggregration

### Atlanta Population

1. use db.zipcodes.find() to filter results to only the results where city is ATLANTA
and state is GA.
```
db.zipcodes.find({
... $and: [
... {city:"ATLANTA"},
... {state:"GA"},
... ]
... })
```


2. use db.zipcodes.aggregate with $match to do the same as above.
```
db.zipcodes.aggregate( [ { $match: { city: "ATLANTA" } },{$match:{state:"GA"}}])
```


3. use $group to count the number of zip codes in Atlanta.

4. use $group to find the total population in Atlanta.
```
db.zipcodes.aggregate( [ { $match: { city: "ATLANTA" } }, { $group: { _id:"$city","Total Population":{$sum:"$pop"}}}])
```

### Populations By State

1. use aggregate to calculate the total population for each state
```
db.zipcodes.aggregate( [ { $group: { _id:"$state","Total Population of each state":{$sum:"$pop"}}}])  
```
>The above I have written Total Population of each state but it doen't applicable when you are doing sort in it so refer to use `Total`.

2. sort the results by population, highest first
```
db.zipcodes.aggregate( [ { $group: { _id:"$state","Total":{$sum:"$pop"}}},{$sort:{Total:-1}}])
```


3. limit the results to just the first 3 results. What are the top 3 states in
population?
```
db.zipcodes.aggregate( [ { $group: { _id:"$state","Total":{$sum:"$pop"}}},{$sort:{Total:-1}},{$limit:3}])
```

### Populations by City

1. use aggregate to calculate the total population for each city (you have to use
city/state combination). You can use a combination for the _id of the $group: {
city: '$city', state: '$state' }
```
db.zipcodes.aggregate( [ { $group: { _id:{state:"$state", city:"$city"},"Total":{$sum:"$pop"}}}])
```


2. sort the results by population, highest first
```
db.zipcodes.aggregate( [ { $group: { _id:{state:"$state", city:"$city"},"Total":{$sum:"$pop"}}},{$sort:{Total:-1}}])
```



3. limit the results to just the first 3 results. What are the top 3 cities in
population?
```
db.zipcodes.aggregate( [ { $group: { _id:{state:"$state", city:"$city"},"Total":{$sum:"$pop"}}},{$sort:{Total:-1}},{$limit:3}])
```


4. What are the top 3 cities in population in Texas?
```
db.zipcodes.aggregate( [{$match:{state:"TX"}}, { $group: { _id:{state:"$state", city:"$city"},"Total":{$sum:"$pop"}}},{$sort:{Total:-1}},{$limit:3}])
```

### Bonus

1. Write a query to get the average city population for each state.
```
db.zipcodes.aggregate( [ { $group: { _id:{state:"$state"},"AVergae":{$avg:"$pop"}}}])
```
> Mistakenly Average spelling is wrong. So I have used this name in this query.



2. What are the top 3 states in terms of average city population?
```
db.zipcodes.aggregate( [ { $group: { _id:{state:"$state"},"AVergae":{$avg:"$pop"}}},{$sort:{AVergae:-1}},{$limit:3}])
```










