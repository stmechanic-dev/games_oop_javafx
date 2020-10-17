package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void whenTruePosition() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        assertThat(bb.position(), is(Cell.C8));
    }

    @Test
    public void whenTrueCopy() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        bb = bb.copy(Cell.G6);
        assertThat(bb.position(), is(Cell.G6));
    }

    @Test
    public void whenMoveRight() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] cells = bb.way(Cell.G5);
        assertThat(cells, is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenMoveLeft() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] cells = bb.way(Cell.A3);
        assertThat(cells, is(new Cell[] {Cell.B2, Cell.A3}));
    }
}