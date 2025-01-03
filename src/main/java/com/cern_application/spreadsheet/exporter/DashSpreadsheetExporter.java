package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public class DashSpreadsheetExporter implements SpreadsheetExporter{

    private final SpreadsheetImpl sheet;

    public DashSpreadsheetExporter(SpreadsheetImpl sheet) {
        this.sheet = sheet;
    }

    @Override
    public String export() {
        // TODO: Implement export logic with dashes
        return null;
    }
}
