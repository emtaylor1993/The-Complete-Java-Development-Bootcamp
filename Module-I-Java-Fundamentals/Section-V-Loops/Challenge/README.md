# Blackjack
Blackjack is the most popular table game at casinos. We're going to build a simple version of Blackjack.

## Task 1
Define the drawRandomCard function.

## Task 2
Make a function that receives a card number and returns the String drawing.

## Task 3
Write code that waits for the user to press enter.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F27a6512b-c2ca-4541-919f-1bfb6ef57539?alt=media&token=1896e076-78ba-4813-9a3d-4247a1ba85b1)

## Task 4
When the game starts, the dealer will give you two cards faceup. Get the code to deal you two random cards and print them.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F7b49ec9b-774c-43cc-8962-5788a71d5df9?alt=media&token=75ccec2e-370f-432b-874c-dad2148c8f3b)

## Task 5
After you print your cards, print the hand value. The hand value is the sum of your card values. In Blackjack, the face cards (Jack, Queen, and King) have values of 10.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Ff2f3655b-bbe9-4d1b-9657-51dbbf4549e3?alt=media&token=4d6b8516-8860-4931-b0f0-6741b7eeed6d)

## Task 6
The dealer gets two cards as well. Print the dealer's first card, and print the next one facedown.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F427749b6-4fd7-4cf3-824a-c72d6a28640c?alt=media&token=826ac8b9-47c9-42f5-9c31-f31312350f39)

## Task 7
Make a function that asks the user to hit or stay. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing: Please write 'hit' or 'stay'. The condition for this while loop is kind of tricky. I recommend using a while loop that runs foreve rand breaking it when it's appropriate.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4def7840-d792-4366-b0e1-9617e3c33497?alt=media&token=2aa0f178-46dd-4c36-91a6-59cd54f8d224)

## Task 8
You will keep asking the player to hit or stay. In other words, make a while loop that runs forever. Then, call your function inside the while loop. Every time the player hits, draw an ew card and calculate their new total.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F2a057fac-7aae-4507-8fc6-3be0a7315ff9?alt=media&token=88113175-aaa0-4508-8f26-66725eeabbac)

## Task 9
While the player is hitting, if they go bust (total exceeds 21) print: Bust! Player loses". Then shut down the game with System.exit(0).

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F997ca750-bd0a-45e5-b490-3fbb34fedad3?alt=media&token=b0bf8ad9-9788-4c53-a179-dd1a6bbb307a)

## Task 10
After the player chooses to stay, it becomes the dealer's turn. First, reveal the dealer's hidden card.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F0b530327-85a8-4898-bf05-b32db51b8f4c?alt=media&token=6545478f-ff33-481b-aed5-70691677a117)

## Task 11
The dealer must keep "hitting" until their total gets to 17. Every time the dealer hits, print: Dealer gets a new card. At 17 points or higher, end the dealer's turn.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F240e9da8-ade9-416f-bfab-4e410b80e0b6?alt=media&token=0387b555-cbe2-4468-9a56-5e457cac50c9)

## Task 12
If the dealer's total is higher than 21, print: "Bust! Dealer loses" and end the game with System.exit(0).

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F9fa97e5c-0c34-453c-9e57-636e75b1d6a1?alt=media&token=ce799ff8-8c20-4d98-93e2-b0aab4798f72)

## Task 13
If at this point, the program didn't terminate, compare the dealer and player's hand values. 

## FINAL OUTPUT

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F3f3d6c9e-c7b2-48dc-97e7-2a895ff6b654?alt=media&token=4af2bff2-880b-4184-bfca-1928f4adf473)
