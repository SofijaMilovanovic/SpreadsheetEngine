package com.cern_application.spreadsheet.factory;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

public class Office {

  public static SpreadsheetImpl newSpreadsheet(int rows, int columns) {
    return new SpreadsheetImpl(rows, columns);
  }
}
