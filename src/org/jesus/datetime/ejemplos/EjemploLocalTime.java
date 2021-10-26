package org.jesus.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalTime {
  public static void main(String[] args) {
    LocalTime ahora = LocalTime.now();
    System.out.println("Hora actual: " + ahora);
    System.out.println("Hora actual: " + ahora.getHour());
    System.out.println("Minuto actual: " + ahora.getMinute());
    System.out.println("Segundo actual: " + ahora.getSecond());
    System.out.println("Milisegundo actual: " + ahora.getNano());

    LocalTime seisConDiez = LocalTime.of(6, 10);
    System.out.println("Hora: " + seisConDiez);

    seisConDiez = LocalTime.parse("06:10:15");
    System.out.println("Hora: " + seisConDiez);
    boolean esAntes = seisConDiez.isBefore(ahora);
    System.out.println("Es antes: " + esAntes);

    DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
    String hora = seisConDiez.format(df);
    System.out.println("Hora: " + hora);
    String ahoraFormateada = ahora.format(df);
    System.out.println("Hora: " + ahoraFormateada);
    
  }
}