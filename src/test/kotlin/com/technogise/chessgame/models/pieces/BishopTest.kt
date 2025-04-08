package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import org.junit.jupiter.api.Test

class BishopTest {
 @Test
 fun `SHOULD return all next positions for bishop from given start position WHEN all those positions are valid`() {
  val bishop = Bishop()

  val validNextPositions = bishop.nextValidPositionsFrom(Position.of("D3"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("C4", "B5", "A6", "E4", "F5", "G6", "H7", "E2", "F1", "C2", "B1")
 }
}