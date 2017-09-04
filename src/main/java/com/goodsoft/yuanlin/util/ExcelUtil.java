package com.goodsoft.yuanlin.util;

import com.goodsoft.yuanlin.domain.entity.demand.SeedlingOffer;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * function Excel表格工具类
 * Created by 严彬荣 on 2017/9/4.
 * version v1.0
 */
public class ExcelUtil {
    /**
     * 创建ExcelUtil类的单例（详情见本包下UUIDUtil类） start
     **/
    private volatile static ExcelUtil instance;

    private ExcelUtil() {
    }

    public static ExcelUtil getInstance() {
        if (instance == null) {
            synchronized (ExcelUtil.class) {
                if (instance == null)
                    instance = new ExcelUtil();
            }
        }
        return instance;
    }

    public List<SeedlingOffer> readExcel(String path) throws Exception {
        File file = new File(path);
        FileInputStream is = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(is);
        is.close();
        return getSheetExcel(wb);
    }


    private List<SeedlingOffer> getSheetExcel(XSSFWorkbook wb) {
        int st = wb.getActiveSheetIndex();
        XSSFSheet sheet = wb.getSheetAt(0);
        return getRowExcel(sheet);
    }

    private List<SeedlingOffer> getRowExcel(XSSFSheet sheet) {
        int rowCount = sheet.getPhysicalNumberOfRows();
        List<SeedlingOffer> list = new ArrayList<>();
        XSSFRow row;
        XSSFCell cell;
        for (int i = sheet.getFirstRowNum(); i < rowCount; ++i) {
            row = sheet.getRow(i);
            if (row == null) {
                if (i != sheet.getPhysicalNumberOfRows()) {//判断是否是最后一行
                }
                continue;
            }

        }
        return null;
    }

}
