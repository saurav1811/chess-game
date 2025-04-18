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
* Assuming that everytime when service method is called, the chess board is empty and just contains one piece.

## Design Decisions
* Filter out invalid next positions from result for a piece with given start position. If in case, there are no valid positions, then result is empty.

## How to build the app?
`
./gradlew clean build
`

## How to run the app?
`
./gradlew clean run
`

## Extension

We are considering one more opponent piece on the board along with current piece in such a way 
that there might be overlaps in the valid move positions for both pieces.

We have to return the valid move positions for our current piece now (considering other piece).

**Input**
```
ROOK, D5
OPPONENT, D7
```

**Output**
```
D1, D2, D3, D4, D6, D7, A5, B5, C5, E5, F5, G5, H5
```

