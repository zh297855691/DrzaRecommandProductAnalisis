/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoadFile
 * Author:   yexin
 * Date:     2018/11/2 下午7:29
 * Description: 该类用于加载配置文件信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cmit.cmhk.drza.utils;


import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @desc 该类用于加载配置文件信息
 * @author zhengmao
 * @create 2018/11/2
 * @since 1.0.0
 */
public class LoadFile {
    private static Logger logger = Logger.getLogger(LoadFile.class.getName());
/*
    public static Properties loadConfig(String configFile){
        Properties properties = new Properties();
        try {
            properties.load(LoadFile.class.getClassLoader().getResourceAsStream(configFile));

        }catch (FileNotFoundException e){
            logger.error("找不到配置文件: " + configFile, e);
            throw new RuntimeException("找不到配置文件: " + configFile);
        }



    }
*/
}
