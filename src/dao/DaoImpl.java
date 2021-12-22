package dao;



public class DaoImpl implements IDao{


    @Override
    public String sayHello() {
       return "You are in version 1, if you want to change the  version you have to change in the configuration file (config.txt)! ";
    }

}
