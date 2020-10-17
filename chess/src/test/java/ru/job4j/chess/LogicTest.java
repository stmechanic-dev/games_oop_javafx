package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    @Test
    public void moveTrue()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
        Cell expected = logic.getFigures()[0].position();
        assertThat(expected, is(Cell.H6));
    }

//    @Test
//    public void moveFalse()
//            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
//        Logic logic = new Logic();
//        logic.add(new BishopBlack(Cell.C1));
//        logic.add(new BishopBlack(Cell.D2));
//        logic.move(Cell.C1, Cell.H6);
//        Cell expected = logic.getFigures()[0].position();
//        assertThat(expected, is(Cell.C1));
//    }
}