package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Bishop: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidForwardLeftDiagonalPositions = startPosition.forwardLeftDiagonalMoveValidPositions()
        val nextValidForwardRightDiagonalPositions = startPosition.forwardRightDiagonalMoveValidPositions()
        val nextValidBackwardRightDiagonalPositions = startPosition.backwardRightDiagonalMoveValidPositions()
        val nextValidBackwardLeftDiagonalPositions = startPosition.backwardLeftDiagonalMoveValidPositions()

        return (nextValidForwardLeftDiagonalPositions + nextValidForwardRightDiagonalPositions
                + nextValidBackwardRightDiagonalPositions + nextValidBackwardLeftDiagonalPositions)
    }
}