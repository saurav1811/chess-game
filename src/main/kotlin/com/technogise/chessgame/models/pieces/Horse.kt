package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Horse: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        return forwardValidLShapedMoves(startPosition) + rightValidLShapedMoves(startPosition) +
                backwardValidLShapedMoves(startPosition) + leftValidLShapedMoves(startPosition)
    }

    private fun forwardValidLShapedMoves(startPosition: Position): List<PositionLabel> = listOf(
        Position(
            rowIndex = startPosition.rowIndex + 2,
            columnIndex = startPosition.columnIndex - 1,
        ),
        Position(
            rowIndex = startPosition.rowIndex + 2,
            columnIndex = startPosition.columnIndex + 1,
        )
    ).filter { it.isValid() }.map { it.toPositionLabel() }

    private fun rightValidLShapedMoves(startPosition: Position): List<PositionLabel> = listOf(
        Position(
            rowIndex = startPosition.rowIndex + 1,
            columnIndex = startPosition.columnIndex + 2,
        ),
        Position(
            rowIndex = startPosition.rowIndex - 1,
            columnIndex = startPosition.columnIndex + 2,
        )
    ).filter { it.isValid() }.map { it.toPositionLabel() }

    private fun backwardValidLShapedMoves(startPosition: Position): List<PositionLabel> = listOf(
        Position(
            rowIndex = startPosition.rowIndex - 2,
            columnIndex = startPosition.columnIndex + 1,
        ),
        Position(
            rowIndex = startPosition.rowIndex - 2,
            columnIndex = startPosition.columnIndex - 1,
        )
    ).filter { it.isValid() }.map { it.toPositionLabel() }

    private fun leftValidLShapedMoves(startPosition: Position): List<PositionLabel> = listOf(
        Position(
            rowIndex = startPosition.rowIndex - 1,
            columnIndex = startPosition.columnIndex - 2,
        ),
        Position(
            rowIndex = startPosition.rowIndex + 1,
            columnIndex = startPosition.columnIndex - 2,
        )
    ).filter { it.isValid() }.map { it.toPositionLabel() }
}