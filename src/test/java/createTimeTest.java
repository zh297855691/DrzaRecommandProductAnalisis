/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: createTimeTest
 * Author:   yexin
 * Date:     2018/11/14 下午3:12
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.Date;


/**
 * @desc test
 * @author yexin
 * @create 2018/11/14
 * @since 1.0.0
 */
public class createTimeTest {
    public static String getCreateTime(String fullFileName){
        Path path = Paths.get(fullFileName);
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path,BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
        BasicFileAttributes attr;
        try {
            attr = basicFileAttributeView.readAttributes();
            Date createDate = new Date(attr.creationTime().toMillis());
            return createDate.toString();

        }catch (Exception e){
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.set(1970, 0, 1, 0, 0, 0);
        return cal.getTime().toString();

    }

    public static void main(String[] args) {
        String path = "/Users/yexin/Desktop/test.sql";
        String s = getCreateTime(path);
        System.out.println(s);
    }

}
