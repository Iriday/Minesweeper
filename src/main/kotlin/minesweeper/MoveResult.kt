package minesweeper

enum class MoveResult {
    MARKED_UNMARKED, ATTEMPT_TO_UNCOVER_HINT_AGAIN, ATTEMPT_TO_UNCOVER_FREE_AGAIN, ATTEMPT_TO_MARK_HINT, ATTEMPT_TO_MARK_FREE, LOSE, WIN
}
