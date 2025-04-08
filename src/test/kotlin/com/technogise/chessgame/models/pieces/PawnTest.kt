package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class PawnTest {
 @Test
 fun `SHOULD return next position for pawn from given start position WHEN next position is valid`() {
  val pawn = Pawn()

  val validNextPositions = pawn.nextValidPositionsFrom(Position.of("G1"))

  validNextPositions shouldContainExactly listOf("G2")
 }

 @Test
 fun `SHOULD return empty list for pawn from given start position WHEN next position is invalid`() {
  val pawn = Pawn()

  val validNextPositions = pawn.nextValidPositionsFrom(Position.of("E8"))

  validNextPositions shouldContainExactly emptyList()
 }
}