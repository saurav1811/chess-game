package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Horse: Piece() {
    // 8 possible L-shaped moves
    private val moves = listOf(
        Pair(2, 1), Pair(2, -1), Pair(-2, 1), Pair(-2, -1),
        Pair(1, 2), Pair(1, -2), Pair(-1, 2), Pair(-1, -2)
    )

    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidPositions = moves.map { (rowChange, columnChange) ->
            Position(
                rowIndex = startPosition.rowIndex + rowChange,
                columnIndex = startPosition.columnIndex + columnChange
            )
        }.filter { it.isValid() }
        return nextValidPositions.map { it.toPositionLabel() }
    }
}