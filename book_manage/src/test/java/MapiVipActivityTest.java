import com.dezhonger.entity.Book;
import com.dezhonger.entity.MapiVipActivity;
import com.dezhonger.mapper.BookDao;
import com.dezhonger.mapper.MapiVipActivityDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by dezhonger on 2016/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapiVipActivityTest {
    @Autowired
    MapiVipActivityDao mapiVipActivityDao;

    @Test
    public void getAllUserNeedNotify() {
        List<Integer> ans = mapiVipActivityDao.getAllUserNeedNotify();
        System.out.println(ans.size());
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    @Test
    public void testSelect() {
        System.out.println(mapiVipActivityDao.selectStatus(1));
        System.out.println(mapiVipActivityDao.selectStatus(120));
        System.out.println(mapiVipActivityDao.selectStatus(2));
        System.out.println(mapiVipActivityDao.selectStatus(3));
        System.out.println(mapiVipActivityDao.selectStatus(null));
    }

    @Test
    public void testUpdate() {
        Date date = new Date();
        System.out.println(mapiVipActivityDao.updateStatus(1, 'Y', date));
//        System.out.println(mapiVipActivityDao.updateStatus(1, 'N', date));
    }

    @Test
    public void testInsertStatus() {
        Date date1 = new Date();
        Date date2 = new Date();
        MapiVipActivity mapiVipActivity = new MapiVipActivity();
        mapiVipActivity.setCreateTime(date1);
        mapiVipActivity.setUpdateTime(date2);
        mapiVipActivity.setIsNotify('Y');
        mapiVipActivity.setUserId(55);
        mapiVipActivityDao.insertStatus(mapiVipActivity);
    }


}
