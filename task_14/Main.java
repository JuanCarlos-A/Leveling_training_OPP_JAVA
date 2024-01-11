package main.com.globant.levelling.session_3.task_14;

import main.com.globant.levelling.session_3.task_14.domain.TemperatureRecord;
import main.com.globant.levelling.session_3.task_14.service.impl.TemperatureReportConverter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureReportConverter temperatureReportConverter = new TemperatureReportConverter();
        List<TemperatureRecord> records = new ArrayList<>();

        // Ingresar datos desde el teclado
        System.out.print("Ingrese la cantidad de registros: ");
        int numberOfRecords = scanner.nextInt();

        for (int i = 0; i < numberOfRecords; i++) {
            System.out.print("Ingrese la fecha (YYYY-MM-DD) para el registro " + (i + 1) + ": ");
            String dateString = scanner.next();
            LocalDate date = LocalDate.parse(dateString);

            System.out.print("Ingrese la hora (HH:mm) para el registro " + (i + 1) + ": ");
            String timeString = scanner.next();
            LocalTime time = LocalTime.parse(timeString);

            System.out.print("Ingrese la temperatura en Farenheit para el registro " + (i + 1) + ": ");
            Double temperature = scanner.nextDouble();

            System.out.println("La temperatura convertida a celcius es: "+temperatureReportConverter.convertToFahrenheitToCelsius(temperature));

            TemperatureRecord record = new TemperatureRecord(date, time);
            records.add(record);
        }

        // Imprimir información requerida
        if (!records.isEmpty()) {
            TemperatureRecord highestTempRecord = records.get(0);
            TemperatureRecord lowestTempRecord = records.get(0);
            double totalTemperature = 0;
            int nullTemperatureCount = 0;

            for (TemperatureRecord record : records) {
                if (record.getTemperature() != null) {
                    totalTemperature += record.getTemperature();

                    if (record.getTemperature() > highestTempRecord.getTemperature()) {
                        highestTempRecord = record;
                    }

                    if (record.getTemperature() < lowestTempRecord.getTemperature()) {
                        lowestTempRecord = record;
                    }
                } else {
                    nullTemperatureCount++;
                }
            }

            double meanTemperature = totalTemperature / (records.size() - nullTemperatureCount);

            System.out.println("Tiempo con la temperatura más alta: " + highestTempRecord.getTime());
            System.out.println("Tiempo con la temperatura más baja: " + lowestTempRecord.getTime());
            System.out.println("Temperatura media: " + meanTemperature);
            System.out.println("Total de registros con temperatura nula: " + nullTemperatureCount);
        } else {
            System.out.println("No hay registros para procesar.");
        }
    }
}
