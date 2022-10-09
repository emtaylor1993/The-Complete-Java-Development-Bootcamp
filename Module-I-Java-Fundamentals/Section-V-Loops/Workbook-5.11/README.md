# Workbook 5.11 - Rolling Java
Rolling Java is a game of luck. If the user rolls:
- 6: the game stops.
- 4: nothing happens.
- anything else: 1 point.

The user wins if they collect at least 3 points before the game ends.

## Task 1
Print the introduction and rules.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F42f9e882-070a-44f9-bd39-4654a8a95d47?alt=media&token=0e1323bb-237f-42d5-b51c-f9d402253549)

## Task 2
Create a while loop that runs forever.

## Task 3
Create the rollDice() function based on the commented documentation.

## Task 4
During each run, call rollDice() and store the values. 

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fda2d821f-3e00-41f8-b6f2-7ef4f804a88a?alt=media&token=8ef6c1fd-d325-4cfb-93ee-9953aa2d8e84)

## Task 5
During each run:

If the user rolls a 6:
- Print: End of game.
- Stop the game.

If the user rolls a 4:
- Print: Zero points. Keep rolling.

If the user rolls anything else:
- Update the points variable by 1
- Print: One point. Keep rolling

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F2dac03b7-ff67-4738-82d0-296d4f4905aa?alt=media&token=db4cda64-8f17-439e-b481-67c67ffb716b)

## Task 6
After the game ends, check your user's points.
- If the score is greater than or equal to 3, print: Wow, that's lucky. You win!
- Otherwise, print: Tough luck, you lose :(

## Winning Scenario

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fe9d90fd7-fda0-4db2-bd6b-73dbd47dc93d?alt=media&token=3a06d786-812d-4508-a393-4f81391ce7aa)

## Losing Scenario

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb70e60ca-3bb9-401f-b967-8d3667a4bfc5?alt=media&token=d8250c00-4eac-4514-96e8-4853a1cf101f)
