package com.feng.hello.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindCf {
    public static void main(String[] args) {
        File file = new File("D:\\yzf.txt");
        String str="";
        try {
            FileInputStream in = new FileInputStream(file);
            int size = in.available();
            byte [] buffer = new byte[size];
            in.read(buffer);
            in.close();
            str=new String(buffer,"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //查找翼支付重复订单

//        System.out.println(str);
        String [] yzfSuccessOrderIds = str.split(",");
//        System.out.println(yzfSuccessOrderIds.length);
//        for (int i = 0;i<yzfSuccessOrderIds.length;i++){
//            String currentOrderId =yzfSuccessOrderIds[i];
//            for (int j = 0; j < yzfSuccessOrderIds.length; j++) {
//                if (j!=i && currentOrderId.equals(yzfSuccessOrderIds[j])){
//                    System.out.println(currentOrderId.trim());
//                }
//            }
//        }

        //查找翼支付成功，HL失败
//        File fileError = new File("D:\\hl-error.txt");
//        String strError="";
//        try {
//            FileInputStream in01 = new FileInputStream(fileError);
//            int size01 = in01.available();
//            byte [] buffer01 = new byte[size01];
//            in01.read(buffer01);
//            in01.close();
//            strError=new String(buffer01,"UTF-8");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String[] orderIds01 = strError.split(",");
//        System.out.println(orderIds01.length);
//        for (int i = 0; i < orderIds01.length; i++) {
//            String currentErrorOrderId = orderIds01[i];
//            for (int j = 0; j < yzfSuccessOrderIds.length; j++) {
//                if (yzfSuccessOrderIds[j].indexOf(currentErrorOrderId) != -1) {
//                    System.out.println(currentErrorOrderId.trim());
//                }
//            }
//        }

        //yzf success and hl successs
        File fileSuccess = new File("D:\\hl-suceess.txt");
        String strSuccess="";
        try {
            FileInputStream in02 = new FileInputStream(fileSuccess);
            int size02 = in02.available();
            byte [] buffer02 = new byte[size02];
            in02.read(buffer02);
            in02.close();
            strSuccess=new String(buffer02,"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] orderIds02 = strSuccess.split(",");
        System.out.println(orderIds02.length);
        for (int i = 0; i < orderIds02.length; i++) {
            String currentSuccessOrderId = orderIds02[i];
            boolean isExist = false;
            for (int j = 0; j < yzfSuccessOrderIds.length; j++) {
                if (yzfSuccessOrderIds[j].indexOf(currentSuccessOrderId) != -1) {
                    isExist = true;
                    continue;
                }
            }
            if(!isExist){
                System.out.println(currentSuccessOrderId.trim());
            }
        }
    }
}
