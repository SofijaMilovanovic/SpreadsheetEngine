package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public class DashSpreadsheetExporter extends SpreadsheetExporter{

    public DashSpreadsheetExporter(SpreadsheetImpl sheet) {
        super(sheet, '-');
    }
}
