package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Piece
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel

class Rook: Piece() {
    override fun nextValidPositionsFrom(startPosition: Position): List<PositionLabel> {
        val nextValidHorizontalPositions = startPosition.horizontalMoveValidPositions()
        val nextValidVerticalPositions = startPosition.verticalMoveValidPositions()
        return (nextValidHorizontalPositions + nextValidVerticalPositions)
    }
}