package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public class StarSpreadsheetExporter extends SpreadsheetExporter{

    public StarSpreadsheetExporter(SpreadsheetImpl sheet) {
        super(sheet, '*');
    }
}
