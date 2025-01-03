package com.cern_application.spreadsheet.core;

public interface Spreadsheet {

    String get(int row, int col);

    void put(int row, int col, String value);

    ValueType getValueType(int row, int col);
}
