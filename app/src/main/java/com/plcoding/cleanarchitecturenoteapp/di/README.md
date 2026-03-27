# Dependency injection

When app grows you can have one module for each feature instead of a single AppModule.

When providing repository that uses a database, have the database as a parameter and not only the dao. 
The database contains information about the dao already.

If multiple use cases have been combined in a single class, you can provide that class as a dependency instead of providing each use case separately.