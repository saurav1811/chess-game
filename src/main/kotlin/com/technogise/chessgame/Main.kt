package com.technogise.chessgame

import com.technogise.chessgame.models.PieceName.KING
import com.technogise.chessgame.models.PieceName.PAWN
import com.technogise.chessgame.models.PieceName.QUEEN
import com.technogise.chessgame.services.PieceMoveService

fun main() {
    val pieceMoveService = PieceMoveService()
    println("###### Start Piece Moves on Chess Board ######")

    // 1st Piece Move
    println("Preparing Empty Chess Board...")
    val startPosition1 = "G1"
    println("Added $PAWN to it with start position $startPosition1")
    println("Next Valid Moves:- ${pieceMoveService.nextValidPositionsFor(PAWN, startPosition1)}")

    // 2nd Piece Move
    println("Preparing Empty Chess Board...")
    val startPosition2 = "D5"
    println("Added $KING to it with start position $startPosition2")
    println("Next Valid Moves:- ${pieceMoveService.nextValidPositionsFor(KING, startPosition2)}")

    // 3rd Piece Move
    println("Preparing Empty Chess Board...")
    val startPosition3 = "E4"
    println("Added $QUEEN to it with start position $startPosition3")
    println("Next Valid Moves:- ${pieceMoveService.nextValidPositionsFor(QUEEN, startPosition3)}")

    println("###### End Piece Moves on Chess Board ######")
}