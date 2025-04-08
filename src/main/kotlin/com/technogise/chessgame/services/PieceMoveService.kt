package com.technogise.chessgame.services

import com.technogise.chessgame.models.PieceName
import com.technogise.chessgame.models.PieceName.BISHOP
import com.technogise.chessgame.models.PieceName.HORSE
import com.technogise.chessgame.models.PieceName.KING
import com.technogise.chessgame.models.PieceName.PAWN
import com.technogise.chessgame.models.PieceName.QUEEN
import com.technogise.chessgame.models.PieceName.ROOK
import com.technogise.chessgame.models.Position
import com.technogise.chessgame.models.PositionLabel
import com.technogise.chessgame.models.pieces.Bishop
import com.technogise.chessgame.models.pieces.Horse
import com.technogise.chessgame.models.pieces.King
import com.technogise.chessgame.models.pieces.Pawn
import com.technogise.chessgame.models.pieces.Queen
import com.technogise.chessgame.models.pieces.Rook

class PieceMoveService {

    fun nextValidPositionsFor(pieceName: PieceName, startPositionLabel: PositionLabel): List<PositionLabel> {
        val piece = getPiece(pieceName)
        val startPosition = Position.of(startPositionLabel)

        return piece.nextValidPositionsFrom(startPosition)
    }

    private fun getPiece(pieceName: PieceName) = when (pieceName) {
        BISHOP -> Bishop()
        HORSE -> Horse()
        KING -> King()
        PAWN -> Pawn()
        QUEEN -> Queen()
        ROOK -> Rook()
    }
}