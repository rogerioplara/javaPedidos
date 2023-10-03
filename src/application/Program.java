package application;

import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client clie = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));

        System.out.println(clie);

        sc.close();
    }
}
