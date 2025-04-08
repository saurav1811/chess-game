package com.technogise.chessgame.services

import com.technogise.chessgame.models.PieceName.BISHOP
import com.technogise.chessgame.models.PieceName.HORSE
import com.technogise.chessgame.models.PieceName.KING
import com.technogise.chessgame.models.PieceName.PAWN
import com.technogise.chessgame.models.PieceName.QUEEN
import com.technogise.chessgame.models.PieceName.ROOK
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import org.junit.jupiter.api.Test

class PieceMoveServiceTest {
 @Test
 fun `SHOULD return all next positions for BISHOP from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(BISHOP, "H8")

  validNextPositions shouldContainExactlyInAnyOrder listOf("A1", "B2", "C3", "D4", "E5", "F6", "G7")
 }

 @Test
 fun `SHOULD return all next positions for HORSE from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(HORSE, "C4")

  validNextPositions shouldContainExactlyInAnyOrder listOf("A5", "A3", "B2", "D2", "E3", "E5", "D6", "B6")
 }

 @Test
 fun `SHOULD return all next positions for KING from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(KING, "A1")

  validNextPositions shouldContainExactlyInAnyOrder listOf("A2", "B2", "B1")
 }

 @Test
 fun `SHOULD return all next positions for PAWN from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(PAWN, "G7")

  validNextPositions shouldContainExactlyInAnyOrder listOf("G8")
 }

 @Test
 fun `SHOULD return all next positions for QUEEN from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(QUEEN, "A8")

  validNextPositions shouldContainExactlyInAnyOrder listOf("A1", "A2", "A3", "A4", "A5", "A6", "A7", "B8", "C8", "D8", "E8", "F8", "G8", "H8", "B7", "C6", "D5", "E4", "F3", "G2", "H1")
 }

 @Test
 fun `SHOULD return all next positions for ROOK from given start position WHEN all those positions are valid`() {
  val pieceMoveService = PieceMoveService()

  val validNextPositions = pieceMoveService.nextValidPositionsFor(ROOK, "H1")

  validNextPositions shouldContainExactlyInAnyOrder listOf("A1", "B1", "C1", "D1", "E1", "F1", "G1", "H2", "H3", "H4", "H5", "H6", "H7", "H8")
 }
}