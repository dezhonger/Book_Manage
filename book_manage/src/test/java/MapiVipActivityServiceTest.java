import com.dezhonger.mapper.MapiVipActivityDao;
import com.dezhonger.services.MapiVipActivityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zwl on 2016/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapiVipActivityServiceTest {
    @Autowired
    MapiVipActivityService mapiVipActivityService;

    @Test
    public void getAllUserNeedNotify() {
        List<Integer> ans = mapiVipActivityService.getAllUserNeedNotify();
        System.out.println(ans.size());
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    @Test
    public void testGetStatus() {
        System.out.println(mapiVipActivityService.getStatus(1));
        System.out.println(mapiVipActivityService.getStatus(55));
        System.out.println(mapiVipActivityService.getStatus(120));
        System.out.println(mapiVipActivityService.getStatus(1220));
        System.out.println(mapiVipActivityService.getStatus(null));
    }

    @Test
    public void testChangeStatus() {
        mapiVipActivityService.changeStatus(1, 'N');
        System.out.println(mapiVipActivityService.getStatus(1));

        mapiVipActivityService.changeStatus(55, 'N');
        System.out.println(mapiVipActivityService.getStatus(55));

        mapiVipActivityService.changeStatus(1234, 'N');
        System.out.println(mapiVipActivityService.getStatus(1234));

        mapiVipActivityService.changeStatus(null, 'N');
        System.out.println(mapiVipActivityService.getStatus(null));
    }
}
