package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class BoardingHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("How many rooms will be rented? ");
        int n = scanner.nextInt();

        Room[] rooms = new Room[10];

        for(int i = 0; i < n; i++) {
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.println("Room: ");
            int roomIndex = scanner.nextInt();

            rooms[roomIndex] = new Room(name, email);
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.printf("%d: %s, %s\n", i, rooms[i].getName(), rooms[i].getEmail());
            }
        }


        scanner.close();
    }
}
