import java.io.Console;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.io.FileNotFoundException;
class Game {

                    public static void main(String[] args) {

                                       System.out.println("Countries Game");

                                       Console console = System.console();

                                       BufferedReader br = null;
int total = 0;
int correct = 0;

                                       try {

                                                           br = new BufferedReader(new FileReader("continents.csv"));

                                                           String line;

                                                           while ((line = br.readLine()) != null) {

                                                           total++;
                   String[] cols = line.split(",");

                                                                              String continent = cols[1];

                                                                              String country = cols[0];

                                                                              String answer = console.readLine("Which continent does " + country + " belong to? ");

                                                                              if (answer.equals(continent)) {

                                                                                                  System.out.println("Correct!");
correct++;

                                                                              }

                                                                              else {

                                                                                                  System.out.println("No, the answer is " + continent);

                                                                              }

                                                           }

                                       }

                    catch (FileNotFoundException e) {

                                       e.printStackTrace();

                                       } catch (IOException e) {

                                       e.printStackTrace();

                                       }
System.out.println("You scored " + correct + "out of " + total);

                    }

}
