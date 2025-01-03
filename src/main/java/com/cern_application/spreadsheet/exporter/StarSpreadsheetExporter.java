package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public class StarSpreadsheetExporter implements SpreadsheetExporter{

    private final SpreadsheetImpl sheet;

    public StarSpreadsheetExporter(SpreadsheetImpl sheet) {
        this.sheet = sheet;
    }

    @Override
    public String export() {
        // TODO: Implement export logic with stars
        return null;
    }
}
