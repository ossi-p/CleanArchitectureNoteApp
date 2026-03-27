# Use cases

A use case is a single action the user can perform in the app. 
It represents a specific functionality or feature of the app, such as adding a note, deleting a note, or fetching all notes.

A use case should only have a single public function, which is the function that will be called from the presentation layer (e.g. ViewModel) to execute the use case.

When app grows with more use cases, it's a good idea to group them in a class called `UseCases` that contains all the use cases as properties. 
This way, we can easily inject all the use cases into the ViewModel with a single dependency.

Checking if for example the note title is blank is business logic, and should be handled in the use case.