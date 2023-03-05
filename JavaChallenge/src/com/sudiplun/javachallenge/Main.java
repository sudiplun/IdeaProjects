package com.sudiplun.javachallenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id=0;
    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("Welcome to world of programming");
        showInitialOptions();

    }
   private static void showInitialOptions(){
       System.out.println("""
               Main Menu select one of menu:
               \t1. Manage Contacts
               \t2. Messages
               \t3. Quit""");
       scanner = new Scanner(System.in);
       int choice = scanner.nextInt();
       switch (choice) {
           case 1:
               manageContacts();
               break;
           case 2:
               manageMessage();
               break;
           default:
               break;
       }
   }
    private static void manageMessage(){
        System.out.println("""
                Select one:\s
                \t1. Show all messages
                \t2. Send a new message
                \t3. Go Back""");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: 
                showAllMessages();
                break;
            case 2:
                sendMessage();
            default:
                showInitialOptions();
                break;                
        }
    }

    private static void sendMessage() {
        System.out.println("Enter the name of contect?");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("please enter name of receiver.");
            sendMessage();
        }else {
            boolean doesExist = false;
            for (Contact c: contacts){
                if (c.getName().equals(name)){
                    doesExist = true;
                }
            }
            if (doesExist){
                System.out.println("What a message?");
                String text = scanner.next();
                if (text.equals("")){
                    System.out.println("Please Enter a send text Messages");
                    sendMessage();
                }else {
                    id++;
                    Message newMessage = new Message(text, name, id);
                    for (Contact c: contacts){
                        if(c.getName().equals(name)){
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                        }
                    }
                    showInitialOptions();
                }
            }else {
                System.out.println("there is no such contact names "+ name);
            }
        }
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts){
            allMessages.addAll(c.getMessages());
        }
        if(allMessages.size()>0){
            for (Message m: allMessages){
                m.getDetails();
                System.out.println("**********");
            }
        }else {
            System.out.println("you don't have messages.");
        }
        showInitialOptions();
    }

    private static void manageContacts(){
       System.out.println("""
               Please Select one:
               \t1. Show all contact
               \t2. Add a new contact
               \t3. Search for a contact
               \t4. Delete a contact
               \t5. Go Back""");
       int choice = scanner.nextInt();
       switch (choice){
           case 1:
               showAllContacts (); 
               break;
           case 2:
               addContact();
           case 3:
               searchContact();
           case 4:
               deleteContact();
           default:
               showInitialOptions();
               break;
       }
   }

    private static void deleteContact() {
        System.out.println("Enter the contact's name:");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the name");
            deleteContact();
        }else {
            boolean doesExit = false;
            for (Contact c:contacts){
                if (c.getName().equals(name)){
                    doesExit = true;
                    contacts.remove(c);
                }
            }
            if(!doesExit){
                System.out.println("There is no such contact in your contact");
            }
        }
        showInitialOptions();
    }

    private static void searchContact() {
        System.out.println("Enter the contact name:");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the name");
            searchContact();
        }else {
            boolean doesExit = false;
           for (Contact c:contacts){
               if (c.getName().equals(name)){
                   doesExit = true;
                   c.getDetails();
               }
           }
           if(!doesExit){
               System.out.println("There is no such contact in your contact");
           }
        }
        showInitialOptions();
    }

    private static void addContact() {
        System.out.println("Adding a new contact..." +
                "\n Please enter the contact's name:");
        String name = scanner.next();
        System.out.println("Enter contact's number");
        String number = scanner.next();
        System.out.println("Enter contact's email");
        String email = scanner.next();

        if (name.equals("") || number.equals("") || email.equals("")){
            System.out.println("Please enter all off the information");
            addContact();
        }else {
            boolean doesExist = false;
            for (Contact c: contacts){
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }
            if (doesExist){
                System.out.println("we have a contact named" + name + " saved on this phone.");
                addContact();
            }else {
                Contact contact = new Contact(name, number, email);
            contacts.add(contact);
                System.out.println(name + " add successfully.");
            }
        }
        showInitialOptions();
    }

    private static void showAllContacts(){
        if (contacts.size()>0){
            for (Contact c:contacts){
                c.getDetails();
                System.out.println("***********");
            }
//            showInitialOptions();
        }else {
            System.out.println("you don't have any contact.");
        }

   }


}
