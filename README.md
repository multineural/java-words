# java-words

The Java/Spring-boot version... A set of tools for random thoughts, ideas, discussions, anecdotes, settings, situations, plot twists, dad jokes, and maybe the best thing for unblocking writers' block.

## how to run

from the project root (I have mine in /Users/jim/projects/java-words)
`mvn clean install`

Then
`mvn spring-boot:run`

Please ignore the mongodb related errors - I have not added the db yet

and you can test the api with curl:
`curl localhost:8080/jokes/dad/random && echo ''`

or just use a browser at that address.
