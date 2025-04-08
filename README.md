## Chess Game Problem
You are required to create a program, which simulates an empty chessboard and the movements of three types of
chess pieces on it.

**_Chessboard_**: The chessboard is an 8 x 8 grid with 64 cells in it. With 8 rows (1, 2, 3.... 8) and 8 columns (A, B, C.... H),
each cell can be uniquely identified with its cell number.

**_Chess pieces_**: The game of chess has 6 unique types of pieces - King, Queen, Rook, Bishop, Horse and Pawn - each with their own
unique types of movements.

You have to simulate the movement of the following **_three pieces on an empty chessboard_**.

**Inputs and Outputs to your program:**<br>
● Input- The input string to your program will be the Type of chess piece and it’s position (cell number) on the
chessboard. E.g. **Pawn**, **G1** <br>
● Output- Once you execute the program, the output will be a string of all possible cells in which the chess piece can
move from its current position. For the above input, the output would be **G2**.

## Assumptions
* Assuming that PositionLabels (eg:- D5, A7 etc.) passed in input are always valid and not having any validation in place for that.

## Design Decisions
* Filter out invalid next positions from result for a piece with given start position. If in case, there are no valid positions, then result an empty result.

## How to run the app?

