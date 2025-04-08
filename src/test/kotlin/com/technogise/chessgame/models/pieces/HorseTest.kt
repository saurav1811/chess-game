package com.technogise.chessgame.models.pieces

import com.technogise.chessgame.models.Position
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import org.junit.jupiter.api.Test

class HorseTest {
 @Test
 fun `SHOULD return all next positions for horse from given start position WHEN all those positions are valid`() {
  val horse = Horse()

  val validNextPositions = horse.nextValidPositionsFrom(Position.of("C4"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("A5", "A3", "B2", "D2", "E3", "E5", "D6", "B6")
 }

 @Test
 fun `SHOULD return some next positions for horse from given start position WHEN some of those positions are valid`() {
  val horse = Horse()

  val validNextPositions = horse.nextValidPositionsFrom(Position.of("G1"))

  validNextPositions shouldContainExactlyInAnyOrder listOf("E2", "H3", "F3")
 }
}