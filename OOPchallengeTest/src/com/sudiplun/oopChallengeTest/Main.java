package com.sudiplun.oopChallengeTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Sudip Lun", 21,
                new Eye("Left Eye", "Entropy", "Black", true),
                new Eye("Right Eye", "Good", "Blue", true),
                new Heart("Heart", "Normal", 70),
                new Skin("Skin", "Alergic", "Brown", 20),
                new Stomach("Stomach", "Gastric", false ));
        System.out.println("Name of Patient: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        Scanner scanner = new Scanner(System.in);
        boolean shouldFinished=false;
        while (!shouldFinished){
            System.out.println("Choose an  organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach " +
                    "\n\t5. Skin" +
                    "\n\t6. Exit\n");
            int choice = scanner.nextInt();
              switch (choice) {
                  case 1:
                      patient.getLefteye().getdetails();
                      if (patient.getLefteye().isOpened()){
                          System.out.println("\t\t1. Close the Eye");
                          if (scanner.nextInt() == 1) {
                              patient.getLefteye().close();
                          }else {
                              continue;
                          }
                      }else {
                          System.out.println("\t\t1. open the Eye");
                          if (scanner.nextInt() == 1){
                              patient.getLefteye().open();
                          }else {
                              continue;
                          }
                      }
                      break;
                  case 2:
                      patient.getRighteye().getdetails();
                      if (patient.getRighteye().isOpened()){
                          System.out.println("\t\t1. close the eye");
                            if (scanner.nextInt() ==1){
                                patient.getRighteye().close();
                            }else {
                          continue;
                            }
                      }else {
                          System.out.println("\t\t1. open the eye");
                          if (scanner.nextInt() == 1) {
                              patient.getRighteye().close();
                          } else {
                              continue;
                          }
                      }
                      break;

                  case 3:
                      patient.getHeart().getdetails();
                      System.out.println("\t\t1. Change the heart rate");
                      if (scanner.nextInt() == 1){
                          System.out.println("Enter the new Heart rate: ");
                          int newHeartRate = scanner.nextInt();
                          patient.getHeart().setRate(newHeartRate);
                          System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                      }else {
                          continue;
                      }
                      break;
                  case 4:
                      patient.getStomach().getdetails();
                      System.out.println("\t\t1. Digest");
                      if (scanner.nextInt() == 1){
                          patient.getStomach().digest();
                      }else {continue;}break;

                  case 5:
                      patient.getSkin().getdetails();
                      break;
                  default:
                      shouldFinished =true;
                      break;
              }
        }

    }
}
