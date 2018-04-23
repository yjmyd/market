package com.sell.market.utils;

import com.alibaba.fastjson.JSONArray;
import java.util.List;

/**
 * @Title  模10校验
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Created with IntelliJ IDEA on 2016/12/20 20:47 .
 */
public class LuhnUtil {
    /**
     * Luhn算法
     * 根据卡号获取校验位
     * @param cardNumber
     * @return
     */
    public static int getCheckNumber(String cardNumber){
        int totalNumber = 0;
        int lastNumber = 0;
        for (int i = cardNumber.length()-1; i >= 0; i-=2) {
            int tmpNumber = calculate(Integer.parseInt(String.valueOf(cardNumber.charAt(i))) *  2);
            if (i==0) {
                totalNumber += tmpNumber;
            }else {
                totalNumber += tmpNumber + Integer.parseInt(String.valueOf(cardNumber.charAt(i-1)));
            }

        }
        if (totalNumber >= 0 && totalNumber < 9) {
            return (10 - totalNumber);
        }else {
            String str = String.valueOf(totalNumber);
            if (Integer.parseInt(String.valueOf(str.charAt(str.length()-1))) == 0) {
                return 0;
            }else {
                return (10 - Integer.parseInt(String.valueOf(str.charAt(str.length()-1))));
            }
        }

    }

    /**
     * 计算数字各位和
     * @param number
     * @return
     */
    public static int calculate(int number){
        String str = String.valueOf(number);
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            total += Integer.valueOf(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return total;
    }
    /**
     * 校验银行卡卡号
     * @param cardId
     * @return
     */
    public static boolean checkBankCard(String cardId) {
        char bit = getBankCardCheckCode(cardId.substring(0, cardId.length() - 1));
        if(bit == 'N'){
            return false;
        }
        return cardId.charAt(cardId.length() - 1) == bit;
    }

    /**
     * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位
     * @param nonCheckCodeCardId
     * @return
     */
    public static char getBankCardCheckCode(String nonCheckCodeCardId){
        if(nonCheckCodeCardId == null || nonCheckCodeCardId.trim().length() == 0
                || !nonCheckCodeCardId.matches("\\d+")) {
            //如果传的不是数据返回N
            return 'N';
        }
        char[] chs = nonCheckCodeCardId.trim().toCharArray();
        int luhmSum = 0;
        for(int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
            int k = chs[i] - '0';
            if(j % 2 == 0) {
                k *= 2;
                k = k / 10 + k % 10;
            }
            luhmSum += k;
        }
        return (luhmSum % 10 == 0) ? '0' : (char)((10 - luhmSum % 10) + '0');
    }

    /**
     * 判断银行卡是否符合模10
     * @param number
     * @return
     */
    public static boolean luhnCheck(String number){
        int s1 = 0, s2 = 0;
        String reverse = new StringBuffer(number).reverse().toString();
        for(int i = 0 ;i < reverse.length();i++){
            int digit = Character.digit(reverse.charAt(i), 10);
            if(i % 2 == 0){
                s1 += digit;
            }else{
                s2 += 2 * digit;
                if(digit >= 5){
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }


    public static void main(String[] args) {
//        String cardNumber = "111111111";
//        System.out.println(checkBankCard(cardNumber));
//        System.out.println(luhnCheck(cardNumber));

        String aa  = "\"pictures\":\"\\\"[{\\\\\\\"businessType\\\\\\\":1,\\\\\\\"picUrl\\\\\\\":\\\\\\\"http://p6yvi47pw.bkt.clouddn.com/2a635224-ddba-41fd-af2c-fdd0aa0054f41524313498713png?e=1524317098&token=ERJIdtIwL21Pod3fUn3oYUGtpAj1WrmtgPtpQy2q:rV-hX3eSMZ_MutuIuH6y-DhOdRc=\\\\\\\"},{\\\\\\\"businessType\\\\\\\":2,\\\\\\\"picUrl\\\\\\\":\\\\\\\"http://p6yvi47pw.bkt.clouddn.com/911ea900-b5bc-4c1a-8121-b907891b523d1524309573548jpg?e=1524313173&token=ERJIdtIwL21Pod3fUn3oYUGtpAj1WrmtgPtpQy2q:akMrGta8BiMVp6ZVSVz9mD3GIeo=\\\\\\\"},{\\\\\\\"businessType\\\\\\\":3,\\\\\\\"picUrl\\\\\\\":\\\\\\\"http://p6yvi47pw.bkt.clouddn.com/e626ca2e-de98-47c8-a1a0-2a07f6bd97d11524313501201png?e=1524317101&token=ERJIdtIwL21Pod3fUn3oYUGtpAj1WrmtgPtpQy2q:zCu52FJVIVQomg6EOOjh01ZUM3A=\\\\\\\"},{\\\\\\\"businessType\\\\\\\":4,\\\\\\\"picUrl\\\\\\\":\\\\\\\"http://p6yvi47pw.bkt.clouddn.com/5c8739d0-aa42-442a-8a94-a3820d81e58e1524309564672png?e=1524313164&token=ERJIdtIwL21Pod3fUn3oYUGtpAj1WrmtgPtpQy2q:KmO5sIdKCOR3VKiGyXwMT963Ttk=\\\\\\\"},{\\\\\\\"businessType\\\\\\\":8,\\\\\\\"picUrl\\\\\\\":\\\\\\\"http://p6yvi47pw.bkt.clouddn.com/10487ac9-e254-4674-ac27-125d6ff6f2191524313504135png?e=1524317104&token=ERJIdtIwL21Pod3fUn3oYUGtpAj1WrmtgPtpQy2q:zem3dHetG8HKkeL4HTkq507miYc=\\\\\\\"}]";
        System.out.println(aa.replaceAll("\\\\",""));
        List list = JSONArray.parseArray(aa.replaceAll("\\\\",""),Class.class);

    }
}
