package com.globant.levelling.reportgenerator.service.interfaces;
import com.globant.levelling.reportgenerator.domain.TemperatureRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;

import java.util.Collection;
import java.util.List;

public interface ITemperatureReportGenerator {
    public  void  saveReportInCelsius(Collection<TemperatureRecord> temperatureRecords, String outputPath) throws WritingReportFailException;
}
