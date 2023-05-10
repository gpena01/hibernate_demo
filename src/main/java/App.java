import hql.FindUser_Hql;

public class App {
    public static void main( String[] args )
    {
        FindUser_Hql u = new FindUser_Hql();
        u.findUser();
        u.getRecordbyId();
    }
}
