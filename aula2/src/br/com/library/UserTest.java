package br.com.library;

import br.com.library.access.Library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String tookBookDate = "12-02-2021";
        String devoultionDate = "20-02-2021";
        boolean invalid = true;

        while(invalid) {
            System.out.println("\n\n\nType the took date");
            tookBookDate = scanner.nextLine();

            System.out.println("Type the devolution date");
            devoultionDate = scanner.nextLine();

            LocalDate localDateTookBook = LocalDate.parse(tookBookDate, DateTimeFormatter.BASIC_ISO_DATE);
            LocalDate localDateDevolution  = LocalDate.parse(devoultionDate, DateTimeFormatter.BASIC_ISO_DATE);

            if(localDateDevolution.isBefore(localDateTookBook)) {
                invalid = true;
                System.out.println("The date of devolution must be after of took book date");
            } else {
                invalid = false;
            }
        }
    }
}
