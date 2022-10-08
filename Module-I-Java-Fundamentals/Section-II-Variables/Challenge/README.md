# Chatbot
A chatbot is an application that talks to the user. You're going to build an app that carries a simple conversation.

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4a54dc0a-bb71-4239-90b0-33aa2fe4e123?alt=media&token=0109dc14-ca2c-47fb-8448-79a6a2ac1958)

## Task 1: Store Each Answer
After each question, add code that pick's up the user's answer and stores it.

![image](https://user-images.githubusercontent.com/93065901/194680483-7452b483-9eed-4b89-9977-0781b48cf1bc.png)

### Careful From the nextLine() Trap.
- nextLine() gets "skipped" if you put it ahead of nextInt(), nextDouble(), or nextLong(). You can expect this behavior when you try to pick up the user's favorite language.
- You will understand why this happens when we cover <b>Delimiters</b> in the next section (Booleans and Conditionals).
- The solution is to add a throwaway scan.nextLine() before the "real" scan.nextLine().

## Task 2: Update Each Reply
Update each reply with the user's answer.

![image](https://user-images.githubusercontent.com/93065901/194680254-6e73bb5c-ee29-4e1d-997f-82caf7757c09.png)

## Task 3: Run Your Code

![image](https://user-images.githubusercontent.com/93065901/194680278-46154c57-14a3-4128-b088-6e588c004482.png)

Why is the cat scared? The Screaming cat appeares when something's wrong or looks bad. In this case, the output is very messy. There should be a line of spacing between each answer and reply (see arrows).

## Task 4: Add A New Line
Before every reply, add a <b>new line</b>.

![image](https://user-images.githubusercontent.com/93065901/194680307-d40e6e15-6f7c-46ca-b910-91ee4fff5629.png)

Follow the comments to guide your code.

![image](https://user-images.githubusercontent.com/93065901/194680311-14614aac-e17a-43ce-a2b9-6a5874eb1ba0.png)

## FINAL OUTPUT

![image](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fc0b7c5bc-90b5-4d26-810a-cb3d7bc6f0db?alt=media&token=d031d2bc-eb28-4652-86fd-e021f5574694)
