# GraphQL Demo

Based [on this tutorial from pluralsight](https://www.pluralsight.com/guides/java-and-j2ee/building-a-graphql-server-with-spring-boot?status=in-review).

## Stack

* Spring Boot
* GraphQL tools
* H2 embedded via JPA
* JDK 1.8

## Use

* start the application
    ```bash
    ./gradlew clean bootRun
    ```
* [visit the database console](http://localhost:9000/console)
* [visit the graphqli console](http://localhost:9000/graphiql)
* [see the json schema for graphql](http://localhost:9000/graphql/schema.json)

## Data

Some exampled data you can use for the graphql console.

```graphql
{
  findAllBooks {
    id title author
    {
    	firstName lastName
    }
  }
}

mutation {
  newAuthor(
    firstName: "JRR",
    lastName: "Tolkien"
  )
}

{ 
  findAllAuthors {
    firstName
    lastName
    id
  }
  
}

mutation {
  newBook(
    title: "The Fellowship of the Ring",
    isbn: "978-0395489314",
    pageCount: 432,
    author:2
  ) {
    id
  }
}
```