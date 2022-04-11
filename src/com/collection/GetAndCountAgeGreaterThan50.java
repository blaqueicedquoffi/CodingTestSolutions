package com.collection;

import java.util.*;
import java.io.*;
import java.net.*;

public class GetAndCountAgeGreaterThan50 {


        public static void main (String[] args) {
            System.setProperty("http.agent", "Chrome");
            try {
                URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
                try {
                    URLConnection connection = url.openConnection();
                    InputStream inputStream = connection.getInputStream();



                    String line;
                    StringBuilder text = new StringBuilder();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while((line = reader.readLine()) != null) {
                        text.append(line).append(" ");

                    }
                    String[] age = text.toString().split("age=");
                    int counter=0;
                    for (int i=1;i<age.length;i++
                         ) {
                        try{
                            if(Integer.parseInt(age[i]=age[i].substring(0, age[i].indexOf(",")))>=50){
                             counter++;
                            }
                        }catch (Exception e){
                          if( Integer.parseInt( age[i]=age[i].substring(0,age[i].length()-3))>=50){
                              counter++;
                          }

                        }

                    }

                    System.out.println(counter);

                } catch (IOException ioEx) {
                    System.out.println(ioEx);
                }
            } catch (MalformedURLException malEx) {
                System.out.println(malEx);
            }
        }
    }

