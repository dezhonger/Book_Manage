import com.dezhonger.entity.Daohang;
import com.dezhonger.mapper.DaohangDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zwl on 2016/9/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DaohangTest {
    @Autowired
    DaohangDao daohangDao;
    @Test
    public void getAll() {
        System.out.println(daohangDao.getAllDaohang());
    }
    @Test
    public void insert() {
        Daohang daohang = new Daohang();
        daohang.setName("Book Manage");
        daohang.setUrl("http://shuaige.dezhonger.com:8080");
        daohangDao.insert(daohang);
        getAll();
    }
    @Test
    public void insert2() {
        Daohang daohang = new Daohang();
        daohang.setName("Book Manage");
        daohang.setUrl("http://www.dezhonger.com");
        for(int i = 0; i < 20; i++) {
            daohangDao.insert(daohang);
        }
        System.out.println(daohangDao.getAllDaohang().size());
    }
}
