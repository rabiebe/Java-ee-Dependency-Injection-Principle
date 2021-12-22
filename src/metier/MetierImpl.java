package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

    private IDao iDao;
    
    @Override
    public String sayHello() {
        return iDao.sayHello().concat(", ").concat("don't worry about dependency injection,I already link the business layer with the dao layer, Happy coding :)");
    }

    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}
