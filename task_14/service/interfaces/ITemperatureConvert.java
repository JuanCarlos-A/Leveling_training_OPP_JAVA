package main.com.globant.levelling.session_3.task_14.service.interfaces;

import main.com.globant.levelling.session_3.task_14.domain.TemperatureRecord;

import java.util.Collection;
import java.util.List;

public interface ITemperatureConvert {
    List<TemperatureRecord>convertToCelsiusRecord(Collection<TemperatureRecord>recordFahrenheit);
}
