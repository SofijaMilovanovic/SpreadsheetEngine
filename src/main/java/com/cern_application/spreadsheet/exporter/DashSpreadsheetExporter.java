package com.cern_application.spreadsheet.exporter;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

/**
 * Exports spreadsheet data with '-' as the fill character.
 */
public class DashSpreadsheetExporter extends SpreadsheetExporter{

    public DashSpreadsheetExporter(SpreadsheetImpl sheet) {
        super(sheet, '-');
    }
}
