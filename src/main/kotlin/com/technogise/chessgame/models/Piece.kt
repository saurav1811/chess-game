package com.technogise.chessgame.models

abstract class Piece {
    abstract fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel>
}
