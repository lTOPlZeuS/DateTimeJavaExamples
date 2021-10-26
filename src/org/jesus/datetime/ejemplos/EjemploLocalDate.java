package org.jesus.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDate {
  public static void main(String[] args) {
    LocalDate fechaActual = LocalDate.now();
    System.out.println("Fecha actual: " + fechaActual);

    System.out.println("Año: " + fechaActual.getYear());
    System.out.println("Mes: " + fechaActual.getMonth());
    System.out.println("Mes en español: " + fechaActual.getMonth().getDisplayName(TextStyle.FULL, new Locale("es","MX")));
    System.out.println("Día: " + fechaActual.getDayOfMonth());
    System.out.println("Día de la semana: " + fechaActual.getDayOfWeek());
    System.out.println("Día de la semana en español: " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es","MX")));

    LocalDate diaDeMañana = fechaActual.plusDays(1);
    System.out.println("Dia de mañana: " + diaDeMañana);

    LocalDate diaDeAyer = fechaActual.minusDays(1);
    System.out.println("Dia de ayer: " + diaDeAyer);

    fechaActual = LocalDate.of(1998, 9, 27);
    System.out.println("Fecha especifica: " + fechaActual);

    fechaActual = LocalDate.of(1998, Month.DECEMBER, 24);
    System.out.println("Fecha especifica: " + fechaActual);

    fechaActual = LocalDate.parse("1998-12-24");
    System.out.println("Fecha especifica: " + fechaActual);

    fechaActual = LocalDate.parse("1998-12-24",
      java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);

    DayOfWeek diaDeLaSemana = LocalDate.parse("1998-12-24").getDayOfWeek();
    System.out.println("Dia de la semana: " + diaDeLaSemana);

    int once = LocalDate.of(2020,11,11).getDayOfMonth();
    System.out.println("Dia del mes: " + once);

    boolean esBisiesto = LocalDate.now().isLeapYear();
    System.out.println("Es bisiesto: " + esBisiesto);

    boolean esAntes = LocalDate.now().isAfter(LocalDate.of(2020,11,11));
    System.out.println("Es antes: " + esAntes);

    boolean esDespues = LocalDate.now().isBefore(LocalDate.of(2020,11,11));
    System.out.println("Es despues: " + esDespues);
  }
}