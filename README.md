A simple social network application that runs in the console.

##Scenarios

###Posting: Alice can publish messages to a personal timeline

> Alice -> I love the weather today
> Bob -> Damn! We lost!
> Bob -> Good game though.

###Reading: Bob can view Alice’s timeline

> Alice
I love the weather today (5 minutes ago)
> Bob
Good game though. (1 minute ago)
Damn! We lost! (2 minutes ago)

###Following: Charlie can subscribe to Alice’s and Bob’s timelines, and view an aggregated list of all subscriptions

> Charlie -> I'm in New York today! Anyone wants to have a coffee?
> Charlie follows Alice
> Charlie wall
Charlie - I'm in New York today! Anyone wants to have a coffee? (2 seconds ago)
Alice - I love the weather today (5 minutes ago)

> Charlie follows Bob
> Charlie wall
Charlie - I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)
Bob - Good game though. (1 minute ago)
Bob - Damn! We lost! (2 minutes ago)
Alice - I love the weather today (5 minutes ago)

###Details
1. Application must use the console for input and output
2. Users submit commands to the application. There are four commands. “posting”, “reading”, etc. are not part of the commands; commands always start with the user’s name.
3. posting: <user name> -> <message>
4. reading: <user name>
5. following: <user name> follows <another user>
6. wall: <user name> wall

### Further Improvements Required
The application works only when input into the console is correct. I.e. Any mistakes made by the user will cause an error. Validation tests and helpful error messages should be added to fix this.