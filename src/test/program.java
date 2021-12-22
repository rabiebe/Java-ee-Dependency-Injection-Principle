package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.IDao;
import metier.IMetier;

public class program {

	public static void main(String[] args) {
		try {
			File myObj = new File("F:\\java\\JavaEE\\eclipse-workspace\\di\\src\\config\\config.txt");
			Scanner myReader = new Scanner(myObj);
			String daoImpl = myReader.nextLine();
			Class aClassDao = Class.forName(daoImpl);
			IDao iDao = (IDao) aClassDao.newInstance();
			String metierImpl = myReader.nextLine();
			Class aClassMetier = Class.forName(metierImpl);
			IMetier iMetier = (IMetier) aClassMetier.newInstance();
			Method method = aClassMetier.getMethod("setDao", IDao.class);
			method.invoke(iMetier, iDao);
			System.out.println(iMetier.sayHello());
		} catch (Exception ex) {
			ex.getStackTrace();
		}

	}

}
