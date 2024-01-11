package com.globant.levelling.reportgenerator.exceptions;

public class WritingReportFailException extends Exception {

  /**
   * Constructor that prints out a message and cause exception
   * @param message custom error human-readable message
   * @param cause cause of this exception
   */
  public WritingReportFailException(String message, Exception cause) {
    super(message, cause);
    System.out.println("An error ocurred with description: " + message + " and cause " + cause);
  }
}
