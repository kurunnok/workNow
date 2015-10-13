package th.ac.kmitl.ce.ooad;

/**
 * Created by Administrator on 12/10/2558.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
@Controller
@RequestMapping("/postTopic")
public class PostTopic {
    private String nameTitle;
    private String description;
    private Date date;
    private long time;
    private String type;
    private double rate;


   /* @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    Topic sayHello(
            @RequestParam(value="name", required=false,
                    defaultValue="Stranger  xxxxxx") String name) {
        return new Topic();
    }*/
}
