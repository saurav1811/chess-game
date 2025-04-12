package com.technogise.chessgame.models

/*
rowIndex -> row index number in Chessboard
columnIndex -> column index number in Chessboard
                            columnLabel [columnIndex] →
                     A [0]      B [1]      C [2]      D [3]      E [4]      F [5]      G [6]      H [7]
             8 [7]  A8 (7,0)   B8 (7,1)   C8 (7,2)   D8 (7,3)   E8 (7,4)   F8 (7,5)   G8 (7,6)   H8 (7,7)
             7 [6]  A7 (6,0)   B7 (6,1)   C7 (6,2)   D7 (6,3)   E7 (6,4)   F7 (6,5)   G7 (6,6)   H7 (6,7)
             6 [5]  A6 (5,0)   B6 (5,1)   C6 (5,2)   D6 (5,3)   E6 (5,4)   F6 (5,5)   G6 (5,6)   H6 (5,7)
   ↑         5 [4]  A5 (4,0)   B5 (4,1)   C5 (4,2)   D5 (4,3)   E5 (4,4)   F5 (4,5)   G5 (4,6)   H5 (4,7)
rowLabel     4 [3]  A4 (3,0)   B4 (3,1)   C4 (3,2)   D4 (3,3)   E4 (3,4)   F4 (3,5)   G4 (3,6)   H4 (3,7)
[rowIndex]   3 [2]  A3 (2,0)   B3 (2,1)   C3 (2,2)   D3 (2,3)   E3 (2,4)   F3 (2,5)   G3 (2,6)   H3 (2,7)
             2 [1]  A2 (1,0)   B2 (1,1)   C2 (1,2)   D2 (1,3)   E2 (1,4)   F2 (1,5)   G2 (1,6)   H2 (1,7)
             1 [0]  A1 (0,0)   B1 (0,1)   C1 (0,2)   D1 (0,3)   E1 (0,4)   F1 (0,5)   G1 (0,6)   H1 (0,7)
 */
data class Position(
    val rowIndex: Int,
    val columnIndex: Int
) {
    companion object {
        private val rowLabels = listOf("1", "2", "3", "4", "5", "6", "7", "8")
        private val columnsLabels = listOf("A", "B", "C", "D", "E", "F", "G", "H")

        fun of(positionLabel: PositionLabel): Position {
            val positionLabelValues = positionLabel.split("").filterNot { it.isBlank() }
            return Position(
                rowIndex = rowLabels.indexOf(positionLabelValues[1]),
                columnIndex = columnsLabels.indexOf(positionLabelValues[0])
            )
        }
    }

    fun isValid(): Boolean = rowIndex in 0..7 && columnIndex in 0..7

    fun toPositionLabel(): PositionLabel = columnsLabels[columnIndex] + rowLabels[rowIndex]

    fun horizontalMoveValidPositions(steps: Int = 0): List<PositionLabel> {
        return (0..7).filter {
            (if (steps > 0) it >= (columnIndex - steps) && it <= (columnIndex + steps) else true) && it != columnIndex
        }.map { colIdx ->
            Position(
                rowIndex = rowIndex,
                columnIndex = colIdx
            )
        }.filter { it.isValid() }.map { it.toPositionLabel() }
    }

    fun verticalMoveValidPositions(steps: Int = 0): List<PositionLabel> {
        return (0..7).filter {
            (if (steps > 0) it >= (rowIndex - steps) && it <= (rowIndex + steps) else true) && it != rowIndex
        }.map { rowIdx ->
            Position(
                rowIndex = rowIdx,
                columnIndex = columnIndex
            )
        }.filter { it.isValid() }.map { it.toPositionLabel() }
    }

    fun forwardLeftDiagonalMoveValidPositions(steps: Int = 0) : List<PositionLabel> {
        var newRowIndex = (rowIndex + 1)
        var newColumnIndex = (columnIndex - 1)
        var step = 1
        val validPositions = mutableListOf<Position>()
        while (newRowIndex in ((rowIndex + 1)..7) && newColumnIndex in (0..<columnIndex) && ((steps != 0 && step <= steps) || steps == 0)) {
            validPositions.add(Position(
                rowIndex = newRowIndex,
                columnIndex = newColumnIndex
            ))
            newRowIndex += 1
            newColumnIndex -= 1
            step++
        }
        return validPositions.toList().filter { it.isValid() }.map { it.toPositionLabel() }
    }

    fun forwardRightDiagonalMoveValidPositions(steps: Int = 0) : List<PositionLabel> {
        var newRowIndex = (rowIndex + 1)
        var newColumnIndex = (columnIndex + 1)
        var step = 1
        val validPositions = mutableListOf<Position>()
        while (newRowIndex in ((rowIndex + 1)..7) && newColumnIndex in ((columnIndex + 1)..7) && ((steps != 0 && step <= steps) || steps == 0)) {
            validPositions.add(Position(
                rowIndex = newRowIndex,
                columnIndex = newColumnIndex
            ))
            newRowIndex += 1
            newColumnIndex += 1
            step++
        }
        return validPositions.toList().filter { it.isValid() }.map { it.toPositionLabel() }
    }

    fun backwardRightDiagonalMoveValidPositions(steps: Int = 0) : List<PositionLabel> {
        var newRowIndex = (rowIndex - 1)
        var newColumnIndex = (columnIndex + 1)
        var step = 1
        val validPositions = mutableListOf<Position>()
        while (newRowIndex in (0..(rowIndex + 1)) && newColumnIndex in ((columnIndex + 1)..7) && ((steps != 0 && step <= steps) || steps == 0)) {
            validPositions.add(Position(
                rowIndex = newRowIndex,
                columnIndex = newColumnIndex
            ))
            newRowIndex -= 1
            newColumnIndex += 1
            step++
        }
        return validPositions.toList().filter { it.isValid() }.map { it.toPositionLabel() }
    }

    fun backwardLeftDiagonalMoveValidPositions(steps: Int = 0) : List<PositionLabel> {
        var newRowIndex = (rowIndex - 1)
        var newColumnIndex = (columnIndex - 1)
        var step = 1
        val validPositions = mutableListOf<Position>()
        while (newRowIndex in (0..(rowIndex + 1)) && newColumnIndex in (0..<columnIndex) && ((steps != 0 && step <= steps) || steps == 0)) {
            validPositions.add(Position(
                rowIndex = newRowIndex,
                columnIndex = newColumnIndex
            ))
            newRowIndex -= 1
            newColumnIndex -= 1
            step++
        }
        return validPositions.toList().filter { it.isValid() }.map { it.toPositionLabel() }
    }
}

typealias PositionLabel = String