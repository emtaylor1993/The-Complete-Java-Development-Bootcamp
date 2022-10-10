# JAVAPEDIA
Javapedia is a free encyclopedia that anyone can edit. As a world-renowned editor, your task is to submit information about famous historical figures. Then, Javapedia will print the content from its "database" (in our case, a 2D array). Javapedia also lets the user search popular figures by name.

## Task 1
Ask the user: How many historical figures will you register? Store the value in an int variable.

![image](https://user-images.githubusercontent.com/93065901/194912771-b92d52bc-2c84-4050-98df-1375d3a95977.png)

## Task 2
Make a 2D array named: database. The data we're going to submit will take the form of a table.

![image](https://user-images.githubusercontent.com/93065901/194912835-147fd150-6abb-42a9-a881-b974195ac916.png)

So, our array must have as many rows as there are historical figures. Each row also needs 3 values.

## Task 3
Create a for loop that runs through every row in the database. The user needs to submit three values per row.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F1aae31d9-3ad6-43f3-a580-a868ea12103d?alt=media&token=5adadfec-6e52-4282-adc7-4dabc248d5ec)

As the user submits each value, you need to store it in the appropriate row. While doing this task, be carefuul of the nextLine pitfall.

## Task 4
Print the contents of database. Create a function called print2DArray.

## Task 5
The final task is to let the user search the database by name. If the search matches a name in database, print that row's information.
