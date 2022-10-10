# Challenge 6 - Tic Tac Toe
This is the most exciting challenge in this course. You're going to build a two-player game of Tic Tac Toe!

## Task 1: Create Array
The Tic Tac Toe board is a grid with three rows.

![image](https://user-images.githubusercontent.com/93065901/194965448-4d7a67d6-d46e-4e3a-8b94-7c76ff36dfa4.png)

Each row has three _ chracters. Your first task is to store these characters in an array.

## Task 2: Print Array
Write a function that prints the board. Call the function after creating the board.

## Task 3: Taking Turns
The maximum number of turns is 9. So set up a for loop that runs 9 times. X moves on even numbers and O moves on odd numbers.

![image](https://user-images.githubusercontent.com/93065901/194965617-7a16c907-0db3-42d6-bde9-bdd0103d75d3.png)

## Task 4: Choose Spot
Write a function that asks the user to choose a spot. As you write the function, call it for each turn.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb09715c0-efc6-46a7-b31d-dde1da1f4ea0?alt=media&token=30fdd100-9846-4a59-915f-6e87db26c580)

The user will write their numbers beside each question. Then, store both number sin the int[] array.

## Task 5: Populate Board
The function call returns the player's spot. Use that return value to index the board and populate it. Then, print the board:

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fed6c8f02-a925-43f9-bcff-b10263ce51cf?alt=media&token=3913fad2-893e-485e-99cf-de0660bf169c)

## Task 6: Check Win
Write a function that checks whether there is a winner. The function checks for straight row wins, straight column wins and diagonal wins.
