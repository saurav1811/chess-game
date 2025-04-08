package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import org.junit.jupiter.api.Test

class RookTest {
 @Test
 fun `SHOULD return all next positions for rook from given start position WHEN all those positions are valid`() {
  val rook = Rook()

  val validNextPositions = rook.nextValidPositionsFrom(Position.of("D3"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("A3", "B3", "C3", "E3", "F3", "G3", "H3", "D1", "D2", "D4", "D5", "D6", "D7", "D8")
 }
}