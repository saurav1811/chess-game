package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class KingTest {
 @Test
 fun `SHOULD return all next positions for king from given start position WHEN all those positions are valid`() {
  val king = King()

  val validNextPositions = king.nextValidPositionsFrom(Position.of("E5"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("D6", "E6", "F6", "F5", "F4", "E4", "D4", "D5")
 }

 @Test
 fun `SHOULD return some next positions for king from given start position WHEN some of those positions are valid`() {
  val king = King()

  val validNextPositions = king.nextValidPositionsFrom(Position.of("B8"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("A8", "A7", "B7", "C7", "C8")
 }
}