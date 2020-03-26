package com.zdz.db.dataInterceptor.service.impl;

import com.zdz.db.dataInterceptor.service.StrategyService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Service("YYYYMM01StrategyService")
public class YYYYMM01StrategyServiceServiceImpl implements StrategyService {
    @Override
    public String returnTableName(String tableName) {
        return tableName+getStrByDateFormat("yyyyMM01",new Date());
    }
    public static String getStrByDateFormat(String formater, Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(formater);
        return sdf.format(date);
    }
    public String setTableSuffixName(Date date){
        return getStrByDateFormat("yyyyMM01",date);
    }
}
