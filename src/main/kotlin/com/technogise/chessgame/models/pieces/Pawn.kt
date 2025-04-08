package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Pawn: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidPositions = listOf(
            Position(startPosition.rowIndex + 1, startPosition.columnIndex)
        ).filter { it.isValid() }
        return nextValidPositions.map { it.toPositionLabel() }
    }
}