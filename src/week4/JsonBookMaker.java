package week4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class JsonBookMaker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JSONObject obj = new JSONObject();
        System.out.print("Enter a title for the book: ");
        obj.put("title", input.nextLine());

        System.out.print("Enter isbn-10: ");
        obj.put("isbn-10", input.nextLine());

        System.out.print("Enter isbn-13: ");
        obj.put("isbn-13", input.nextLine());

        System.out.print("Enter 1 or more authors (separated by , ): ");
        String[] authors = input.nextLine().split(",");
        JSONArray array = new JSONArray();
        for (String a : authors)
            array.add(a);

        obj.put("authors", array);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("book.json", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println(obj.toJSONString());
        writer.close();
    }

}
