package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class King: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidLeftHorizontalPositions = startPosition.leftHorizontalMoveValidPositions(1)
        val nextValidRightHorizontalPositions = startPosition.rightHorizontalMoveValidPositions(1)
        val nextValidForwardVerticalPositions = startPosition.forwardVerticalMoveValidPositions(1)
        val nextValidBackwardVerticalPositions = startPosition.backwardVerticalMoveValidPositions(1)

        val nextValidForwardLeftDiagonalPositions = startPosition.forwardLeftDiagonalMoveValidPositions(1)
        val nextValidForwardRightDiagonalPositions = startPosition.forwardRightDiagonalMoveValidPositions(1)
        val nextValidBackwardRightDiagonalPositions = startPosition.backwardRightDiagonalMoveValidPositions(1)
        val nextValidBackwardLeftDiagonalPositions = startPosition.backwardLeftDiagonalMoveValidPositions(1)

        return (nextValidLeftHorizontalPositions + nextValidRightHorizontalPositions
                + nextValidForwardVerticalPositions + nextValidBackwardVerticalPositions
                + nextValidForwardLeftDiagonalPositions + nextValidForwardRightDiagonalPositions
                + nextValidBackwardRightDiagonalPositions + nextValidBackwardLeftDiagonalPositions)
    }
}