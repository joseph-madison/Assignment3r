package com.coderscampus.as3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserApplication {


    public UserApplication() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();
    
        User[] users = new User[4];
        for (int i = 0; i < 4; i++) {
            users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1));
        }
        System.out.println(users);
    }
        BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));

        {
            try {
                fileReader = new BufferedReader(new FileReader("data.txt"));
                {
                }
                new Scanner(System.in);
                {
                }
                String line;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Closing file reader");
                try {
                    fileReader.close();
                } catch (IOException e) {

                    try {
                        new RuntimeException(e);
                    }finally {
                        }
            }
        }
    }
}
