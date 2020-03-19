//package com.zdz.db.datasource.interceptor;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * 按月分表策略
// * @author zhangdezhi
// * @date 2020-03-19
// */
//public class YYYYMM01Strategy implements Strategy {
//
//    @Override
//    public String returnTableName(String tableName, String param) {
//        try {
//            // 结果类似 20190601
//            return tableName+"_"+ get_MM01Str(param);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return tableName;
//        }
//    }
//    /**
//     * 获取当前时间并转化为类似20190601的格式
//     * @param dataStr
//     * @return
//     * @throws ParseException
//     */
//    public static String get_MM01Str(String dataStr) throws ParseException {
//        return getStrByDateFormat("yyyyMM01", getDatebyFormaterStr("yyyyMMdd", dataStr));
//    }
//    public static Date getDatebyFormaterStr(String formater, String dateStr) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat(formater);
//        return sdf.parse(dateStr);
//    }
//
//    public static String getStrByDateFormat(String formater, Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat(formater);
//        return sdf.format(date);
//    }
//}
