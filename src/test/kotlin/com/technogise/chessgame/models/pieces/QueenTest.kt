package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import org.junit.jupiter.api.Test

class QueenTest {
 @Test
 fun `SHOULD return all next positions for queen from given start position WHEN all those positions are valid`() {
  val queen = Queen()

  val validNextPositions = queen.nextValidPositionsFrom(Position.of("D3"))

  validNextPositions shouldContainExactlyInAnyOrder listOf(
   "A3", "B3", "C3", "E3", "F3", "G3", "H3", "D1", "D2", "D4", "D5", "D6", "D7", "D8",
   "C4", "B5", "A6", "E4", "F5", "G6", "H7", "E2", "F1", "C2", "B1"
  )
 }
}