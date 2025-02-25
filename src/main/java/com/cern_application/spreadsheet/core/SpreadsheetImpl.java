package com.cern_application.spreadsheet.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of the Spreadsheet interface.
 */
public class SpreadsheetImpl implements Spreadsheet {

    private final int rows;
    private final int columns;
    private final Map<String, String> data;

    /**
     * Constructs a SpreadsheetImpl with the specified dimensions ensuring its values are not null.
     *
     * @param rows the number of rows.
     * @param columns the number of columns.
     */
    public SpreadsheetImpl(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new HashMap<>();
        initializeGrid();
    }

    /**
     * Returns the number of rows in the spreadsheet.
     *
     * @return the row count.
     */
    public int getRows() {
        return rows;
    }

    /**
     * Returns the number of columns in the spreadsheet.
     *
     * @return the column count.
     */
    public int getColumns() {
        return columns;
    }

    @Override
    public String get(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
          throw new IndexOutOfBoundsException("Invalid cell indices: (" + row + ", " + col + ")");
        }
        return data.getOrDefault(row + "," + col, "");
    }

    @Override
    public void put(int row, int col, String value) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            throw new IndexOutOfBoundsException("Invalid cell indices: (" + row + ", " + col + ")");
        }
        if (isInteger(value)) {
            data.put(row + "," + col, value.trim());
        } else {
            data.put(row + "," + col, value);
        }
    }

    @Override
    public ValueType getValueType(int row, int col) {
        String value = get(row, col);
        if (value.startsWith("=")) {
            return ValueType.FORMULA;
        } else if (isInteger(value)) {
            return ValueType.INTEGER;
        }
        return ValueType.STRING;
    }

    private void initializeGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                data.putIfAbsent(row + "," + col, "");
            }
        }
    }

    private boolean isInteger (String value) {
        return value.trim().matches("\\d+");
    }
}
