package com.cern_application.spreadsheet.core;

/**
 * The Spreadsheet interface defines the operations for a spreadsheet.
 */
public interface Spreadsheet {

    /**
     * Retrieves the value stored in the specified cell.
     *
     * @param row the row index of the cell.
     * @param col the column index of the cell.
     * @return the value of the cell, or an empty string if the cell is empty.
     */
    String get(int row, int col);

    /**
     * Stores a value in the specified cell.
     *
     * @param row the row index of the cell.
     * @param col the column index of the cell.
     * @param value the value to be stored in the cell.
     */
    void put(int row, int col, String value);

    /**
     * Determines the type of value stored in the specified cell.
     *
     * @param row the row index of the cell.
     * @param col the column index of the cell.
     * @return the type of value in the cell.
     */
    ValueType getValueType(int row, int col);
}
