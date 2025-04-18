package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Queen: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidLeftHorizontalPositions = startPosition.leftHorizontalMoveValidPositions()
        val nextValidRightHorizontalPositions = startPosition.rightHorizontalMoveValidPositions()
        val nextValidForwardVerticalPositions = startPosition.forwardVerticalMoveValidPositions()
        val nextValidBackwardVerticalPositions = startPosition.backwardVerticalMoveValidPositions()

        val nextValidForwardLeftDiagonalPositions = startPosition.forwardLeftDiagonalMoveValidPositions()
        val nextValidForwardRightDiagonalPositions = startPosition.forwardRightDiagonalMoveValidPositions()
        val nextValidBackwardRightDiagonalPositions = startPosition.backwardRightDiagonalMoveValidPositions()
        val nextValidBackwardLeftDiagonalPositions = startPosition.backwardLeftDiagonalMoveValidPositions()

        return (nextValidLeftHorizontalPositions + nextValidRightHorizontalPositions
                + nextValidForwardVerticalPositions + nextValidBackwardVerticalPositions
                + nextValidForwardLeftDiagonalPositions + nextValidForwardRightDiagonalPositions
                + nextValidBackwardRightDiagonalPositions + nextValidBackwardLeftDiagonalPositions)
    }
}