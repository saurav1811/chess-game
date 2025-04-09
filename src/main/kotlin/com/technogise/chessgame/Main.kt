package com.technogise.chessgame

import com.technogise.chessgame.models.PieceName
import com.technogise.chessgame.services.PieceMoveService

fun main() {
    val pieceMoveService = PieceMoveService()
    println("###### Start Piece Moves on Chess Board ######")
    println("Piece Names in App- ${PieceName.entries}")

    for (pieceMoveCall in 1..3) {
        println("\nPreparing Empty Chess Board for piece move #$pieceMoveCall...")

        print("Enter the piece name: ")
        val pieceName = PieceName.valueOf(readln().trim())
        print("Enter the start position: ")
        val startPosition = readln().trim()
        println("Added $pieceName to it with start position $startPosition")

        println("Next Valid Moves:- ${pieceMoveService.nextValidPositionsFor(pieceName, startPosition)}")
    }

    println("###### End Piece Moves on Chess Board ######")
}