package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class King: Piece() {
    // Directions: vertical, horizontal, and diagonal (8 directions)
    private val directions = listOf(
        Pair(-1, -1), Pair(-1, 0), Pair(-1, 1),
        Pair(0, -1),               Pair(0, 1),
        Pair(1, -1),  Pair(1, 0),  Pair(1, 1)
    )

    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidPositions = directions.map { (rowChange, columnChange) ->
            Position(
                rowIndex = startPosition.rowIndex + rowChange,
                columnIndex = startPosition.columnIndex + columnChange
            )
        }.filter { it.isValid() }
        return nextValidPositions.map { it.toPositionLabel() }
    }
}