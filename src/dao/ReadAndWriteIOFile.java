package dao;

import Model.Drinks;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteIOFile {
    File file = new File("coffee.csv");

    public  void writeFile(ArrayList<Drinks> list){
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String line = "";
                for (Drinks drinks :
                        list) {
                    line += drinks.getName() + "," + drinks.getPrice() + "," + drinks.getCategorize() + "," + drinks.getDescribe() + "," + drinks.getQuantity() + "\n";

                }
                bufferedWriter.write(line);
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void readFile(ArrayList<Drinks> list){
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    String[] data = line.split(",");
                    Drinks drinks = new Drinks(data[0],Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                    list.add(drinks);
                }
                 bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


