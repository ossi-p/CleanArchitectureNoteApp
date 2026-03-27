# Domain model

The entities in the application.

It is sometimes good to have a suitable exception related to the model, for example if we want to throw an exception when the note title is blank, we can create a `InvalidNoteException` that extends `Exception` and throw it in the use case when the note title is blank.