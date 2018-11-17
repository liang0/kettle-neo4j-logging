package com.neo4j.kettle.spoon.history;

import java.util.ArrayList;
import java.util.List;

public class HistoryResult {

  private String id;
  private String name;
  private String type;
  private String copy;
  private Long input;
  private Long output;
  private Long read;
  private Long written;
  private Long rejected;
  private Long errors;
  private Long durationMs;
  private String loggingText;
  private String registrationDate;

  private List<List<HistoryResult>> shortestPaths;
  private Boolean root;

  public HistoryResult() {
    shortestPaths = new ArrayList<>();
  }

  /**
   * Gets id
   *
   * @return value of id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id The id to set
   */
  public void setId( String id ) {
    this.id = id;
  }

  /**
   * Gets name
   *
   * @return value of name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name to set
   */
  public void setName( String name ) {
    this.name = name;
  }

  /**
   * Gets type
   *
   * @return value of type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type The type to set
   */
  public void setType( String type ) {
    this.type = type;
  }

  /**
   * Gets copy
   *
   * @return value of copy
   */
  public String getCopy() {
    return copy;
  }

  /**
   * @param copy The copy to set
   */
  public void setCopy( String copy ) {
    this.copy = copy;
  }

  /**
   * Gets input
   *
   * @return value of input
   */
  public Long getInput() {
    return input;
  }

  /**
   * @param input The input to set
   */
  public void setInput( Long input ) {
    this.input = input;
  }

  /**
   * Gets output
   *
   * @return value of output
   */
  public Long getOutput() {
    return output;
  }

  /**
   * @param output The output to set
   */
  public void setOutput( Long output ) {
    this.output = output;
  }

  /**
   * Gets read
   *
   * @return value of read
   */
  public Long getRead() {
    return read;
  }

  /**
   * @param read The read to set
   */
  public void setRead( Long read ) {
    this.read = read;
  }

  /**
   * Gets written
   *
   * @return value of written
   */
  public Long getWritten() {
    return written;
  }

  /**
   * @param written The written to set
   */
  public void setWritten( Long written ) {
    this.written = written;
  }

  /**
   * Gets rejected
   *
   * @return value of rejected
   */
  public Long getRejected() {
    return rejected;
  }

  /**
   * @param rejected The rejected to set
   */
  public void setRejected( Long rejected ) {
    this.rejected = rejected;
  }

  /**
   * Gets errors
   *
   * @return value of errors
   */
  public Long getErrors() {
    return errors;
  }

  /**
   * @param errors The errors to set
   */
  public void setErrors( Long errors ) {
    this.errors = errors;
  }

  /**
   * Gets loggingText
   *
   * @return value of loggingText
   */
  public String getLoggingText() {
    return loggingText;
  }

  /**
   * @param loggingText The loggingText to set
   */
  public void setLoggingText( String loggingText ) {
    this.loggingText = loggingText;
  }

  /**
   * Gets registrationDate
   *
   * @return value of registrationDate
   */
  public String getRegistrationDate() {
    return registrationDate;
  }

  /**
   * @param registrationDate The registrationDate to set
   */
  public void setRegistrationDate( String registrationDate ) {
    this.registrationDate = registrationDate;
  }

  /**
   * Gets shortestPaths
   *
   * @return value of shortestPaths
   */
  public List<List<HistoryResult>> getShortestPaths() {
    return shortestPaths;
  }

  /**
   * @param shortestPaths The shortestPaths to set
   */
  public void setShortestPaths( List<List<HistoryResult>> shortestPaths ) {
    this.shortestPaths = shortestPaths;
  }

  /**
   * Gets durationMs
   *
   * @return value of durationMs
   */
  public Long getDurationMs() {
    return durationMs;
  }

  /**
   * @param durationMs The durationMs to set
   */
  public void setDurationMs( Long durationMs ) {
    this.durationMs = durationMs;
  }

  public void setRoot( Boolean root ) {
    this.root = root;
  }

  public Boolean isRoot() {
    return root;
  }
}
