package cn.taike.mongo.nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huayandong on 17/7/27.
 */
@RestController
public class BookController {

    @Autowired
    CourseService courseService;


//    @RequestMapping(value = "/get")
    public Object get() {
        try {
            courseService.queryAllCourse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "完成";
    }

}
