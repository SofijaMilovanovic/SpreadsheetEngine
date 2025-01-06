package com.cern_application.spreadsheet.factory;

import com.cern_application.spreadsheet.core.SpreadsheetImpl;

/**
 * Factory class to create Spreadsheet instances.
 */
public class Office {

  /**
   * Creates a new spreadsheet with the specified dimensions.
   *
   * @param rows the number of rows.
   * @param columns the number of columns.
   * @return a new SpreadsheetImpl instance.
   */
  public static SpreadsheetImpl newSpreadsheet(int rows, int columns) {
    return new SpreadsheetImpl(rows, columns);
  }
}
