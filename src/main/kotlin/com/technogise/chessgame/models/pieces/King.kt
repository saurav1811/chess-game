package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class King: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidHorizontalPositions = startPosition.horizontalMoveValidPositions(1)
        val nextValidVerticalPositions = startPosition.verticalMoveValidPositions(1)

        val nextValidForwardLeftDiagonalPositions = startPosition.forwardLeftDiagonalMoveValidPositions(1)
        val nextValidForwardRightDiagonalPositions = startPosition.forwardRightDiagonalMoveValidPositions(1)
        val nextValidBackwardRightDiagonalPositions = startPosition.backwardRightDiagonalMoveValidPositions(1)
        val nextValidBackwardLeftDiagonalPositions = startPosition.backwardLeftDiagonalMoveValidPositions(1)

        return (nextValidHorizontalPositions + nextValidVerticalPositions
                + nextValidForwardLeftDiagonalPositions + nextValidForwardRightDiagonalPositions
                + nextValidBackwardRightDiagonalPositions + nextValidBackwardLeftDiagonalPositions)
    }
}