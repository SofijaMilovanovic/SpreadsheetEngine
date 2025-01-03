package com.cern_application.spreadsheet.core;

import java.util.HashMap;
import java.util.Map;

public class SpreadsheetImpl implements Spreadsheet {

    private final int rows;
    private final int columns;
    private final Map<String, String> data;

    public SpreadsheetImpl(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new HashMap<>();
        initializeGrid();
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
        data.put(row + "," + col, value);
    }

    @Override
    public ValueType getValueType(int row, int col) {
        String value = get(row, col);
        if (value.startsWith("=")) {
            return ValueType.FORMULA;
        } else if (value.matches("\\d+")) {
            return ValueType.INTEGER;
        }
        return ValueType.STRING;
    }

    private void validateIndices(int row, int col) {
        // TODO: Validate if the given indices are within bounds
    }

    private void initializeGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                data.putIfAbsent(row + "," + col, "");
            }
        }
    }
}
