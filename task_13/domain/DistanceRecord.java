package com.globant.levelling.reportgenerator.domain;
import java.time.LocalDateTime;

  /**
 * Record with information of a distance in a time
 * Distance unit-independent.
 */
public class DistanceRecord {

  private Double distance;
  private LocalDateTime timeStamp;

  public DistanceRecord() {
  }

  public DistanceRecord(Double distance, LocalDateTime timeStamp) {
    this.distance = distance;
    this.timeStamp = timeStamp;
  }

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public LocalDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(LocalDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }

}
