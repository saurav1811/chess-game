package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Queen: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidHorizontalPositions = startPosition.horizontalMoveValidPositions()
        val nextValidVerticalPositions = startPosition.verticalMoveValidPositions()

        val nextValidForwardLeftDiagonalPositions = startPosition.forwardLeftDiagonalMoveValidPositions()
        val nextValidForwardRightDiagonalPositions = startPosition.forwardRightDiagonalMoveValidPositions()
        val nextValidBackwardRightDiagonalPositions = startPosition.backwardRightDiagonalMoveValidPositions()
        val nextValidBackwardLeftDiagonalPositions = startPosition.backwardLeftDiagonalMoveValidPositions()

        return (nextValidHorizontalPositions + nextValidVerticalPositions
                + nextValidForwardLeftDiagonalPositions + nextValidForwardRightDiagonalPositions
                + nextValidBackwardRightDiagonalPositions + nextValidBackwardLeftDiagonalPositions)
    }
}