# ViewModel

The responsibility of the ViewModel is to make use of the use cases to update and handle the state of the UI. 

A ViewModel often have a state data class that contains information necessary for the UI, such as a list of notes, the current note being edited, or any error messages.

Think about all possible user interactions that can happen in the UI, these needs to be sent from composables to the ViewModels.
It is good to create sealed classes for these events to make them easier to handle.

Can keep track of potential jobs that should be cancelled if triggered again, for example if we have a search feature that triggers a search every time the user types something, we can keep track of the search job and cancel it if the user types something new before the previous search is completed.
Do this with a nullable `Job` variable that is assigned the search job, and cancel it before starting a new search job.