package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Counter {

    private int count;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }

}
