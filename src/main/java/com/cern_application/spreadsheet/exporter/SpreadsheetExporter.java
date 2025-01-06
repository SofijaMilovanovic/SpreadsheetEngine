package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public abstract class SpreadsheetExporter {

    protected final SpreadsheetImpl sheet;
    protected final char fillChar;

    protected SpreadsheetExporter(SpreadsheetImpl sheet, char fillChar) {
        this.sheet = sheet;
        this.fillChar = fillChar;
    }

    public String export() {
        int maxRow = sheet.getRows() - 1;
        int maxColumn = sheet.getColumns() - 1;

        StringBuilder output = new StringBuilder();
        output.append((maxRow + 1)).append(",").append((maxColumn + 1)).append("#");

        for (int row = 0; row <= maxRow; row++) {
            for (int col = 0; col <= maxColumn; col++) {
                StringBuilder value = new StringBuilder(sheet.get(row, col));
                output.append(!value.isEmpty() ? value.append(fillChar) : fillChar);
            }
        }
        return output.toString();
    }
}
