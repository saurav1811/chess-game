package com.technogise.chessgame.models

abstract class Piece {
    abstract fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel>
}

enum class PieceName{
    BISHOP, HORSE, KING, PAWN, QUEEN, ROOK
}
