package Manager;

import Model.Drinks;
import dao.ReadAndWriteIOFile;
import java.util.ArrayList;

public class DrinksManager implements IManager<Drinks>{
    ReadAndWriteIOFile readAndWriteIOFile;
    private ArrayList<Drinks> drinks;
    public DrinksManager(){
        readAndWriteIOFile = new ReadAndWriteIOFile();
        drinks = readAndWriteIOFile.readFile();

    }
    public int findIndex(String name){
        for (int i = 0; i <drinks.size() ; i++) {
            if(drinks.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean add(Drinks e) {
        drinks.add(drinks);
         readAndWriteIOFile.writeFile(drinks);
        return true;
    }

    @Override
    public boolean edit(Drinks e) {
        int index = findIndex(name);
        drinks.set(index,drinks);
        readAndWriteIOFile.writeFile(drinks);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findIndex(name);
        drinks.remove(index);
        readAndWriteIOFile.writeFile(drinks);
        return true;
    }
    public ArrayList<Drinks>sortASC(){
        ArrayList<Drinks> list = drinks;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getPrice()>list.get(j + 1).getPrice()){
                    Drinks drinks = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, drinks);
                }
            }
        }
        return list;
    }

    @Override
    public ArrayList<Drinks> findAll() {
        return drinks;
    }
}
