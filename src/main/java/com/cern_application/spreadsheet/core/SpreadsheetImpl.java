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
        return data.getOrDefault(row + "," + col, "");
    }

    @Override
    public void put(int row, int col, String value) {
        data.put(row + "," + col, value);
    }

    @Override
    public ValueType getValueType(int row, int col) {
        // TODO: Determine and return the value type of the cell at the given row and column
        return null;
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
