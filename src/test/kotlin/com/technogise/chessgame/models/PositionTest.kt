package com.technogise.chessgame.models

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class PositionTest {
 @Nested
 inner class ToPosition {
  @Test
  fun `SHOULD return position from given position label`() {
   val position = Position.of("D5")
   position shouldBe Position(4, 3)
  }
 }

 @Nested
 inner class ValidatePosition {
  @Test
  fun `SHOULD return true when given position is valid`() {
   val position = Position(rowIndex = 0, columnIndex = 7)
   position.isValid() shouldBe true
  }

  @Test
  fun `SHOULD return false when given position is invalid`() {
   val position = Position(rowIndex = 8, columnIndex = 7)
   position.isValid() shouldBe false
  }
 }

 @Nested
 inner class ToPositionLabel {
  @Test
  fun `SHOULD return position label from position`() {
   val position = Position(rowIndex = 4, columnIndex = 3)
   val positionLabel = position.toPositionLabel()
   positionLabel shouldBe "D5"
  }
 }

 @Nested
 inner class HorizontalMoveValidPositions {
  @Test
  fun `SHOULD return all horizontal positions with respect to current position`() {
   val position = Position.of("D3")
   position.horizontalMoveValidPositions() shouldBe listOf("A3", "B3", "C3", "E3", "F3", "G3", "H3")
  }

  @Test
  fun `SHOULD return all horizontal positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.horizontalMoveValidPositions(1) shouldBe listOf("C3", "E3")
  }
 }

 @Nested
 inner class VerticalMoveValidPositions {
  @Test
  fun `SHOULD return all vertical positions with respect to current position`() {
   val position = Position.of("D3")
   position.verticalMoveValidPositions() shouldBe listOf("D1", "D2", "D4", "D5", "D6", "D7", "D8")
  }

  @Test
  fun `SHOULD return all vertical positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.verticalMoveValidPositions(2) shouldBe listOf("D1", "D2", "D4", "D5")
  }
 }

 @Nested
 inner class DiagonalMoveValidPositions {
  @Test
  fun `SHOULD return all valid forward left diagonal positions with respect to current position`() {
   val position = Position.of("D3")
   position.forwardLeftDiagonalMoveValidPositions() shouldBe listOf("C4", "B5", "A6")
  }

  @Test
  fun `SHOULD return all valid forward left diagonal positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.forwardLeftDiagonalMoveValidPositions(2) shouldBe listOf("C4", "B5")
  }

  @Test
  fun `SHOULD return all valid forward right diagonal positions with respect to current position`() {
   val position = Position.of("D3")
   position.forwardRightDiagonalMoveValidPositions() shouldBe listOf("E4", "F5", "G6", "H7")
  }

  @Test
  fun `SHOULD return all valid forward right diagonal positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.forwardRightDiagonalMoveValidPositions(1) shouldBe listOf("E4")
  }

  @Test
  fun `SHOULD return all valid backward right diagonal positions with respect to current position`() {
   val position = Position.of("D3")
   position.backwardRightDiagonalMoveValidPositions() shouldBe listOf("E2", "F1")
  }

  @Test
  fun `SHOULD return all valid backward right diagonal positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.backwardRightDiagonalMoveValidPositions(1) shouldBe listOf("E2")
  }

  @Test
  fun `SHOULD return all valid backward left diagonal positions with respect to current position`() {
   val position = Position.of("D3")
   position.backwardLeftDiagonalMoveValidPositions() shouldBe listOf("C2", "B1")
  }

  @Test
  fun `SHOULD return all valid backward left diagonal positions with respect to current position with fixed steps`() {
   val position = Position.of("D3")
   position.backwardLeftDiagonalMoveValidPositions(1) shouldBe listOf("C2")
  }
 }
}