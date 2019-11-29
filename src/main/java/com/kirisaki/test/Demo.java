package com.kirisaki.test;

import java.sql.*;

public class Demo {

    static String[] stations = new String[]{"北京西","保定东","石家庄站","郑州东","明港东","武汉站","赤壁北","长沙南","衡阳东","广州南"};
    static String[] cities = new String[]{"北京","保定","石家庄","郑州","明港","武汉","赤壁","长沙","衡阳","广州"};

    static String[] arrive_time = new String[]{"2019-06-18 09:00:00","2019-06-18 10:12:00","2019-06-18 11:24:00",
                         "2019-06-18 12:36:00","2019-06-18 13:48:00","2019-06-18 15:00:00","2019-06-18 16:12:00",
                         "2019-06-18 17:24:00","2019-06-18 18:36:00","2019-06-18 19:48:00"};
    static String[] mileage = new String[]{"0","131","281","693","980","1229","1357","1591","1768","2298"};

    public static void insertLine(Statement s) throws Exception{

        for(int j=0;j<2;j++){
            for(int i=0;i<5;i++){
                String sqlFormat = "insert into line values (%d,%d,'%s','%s')";
                String sql = String.format(sqlFormat,j+1,2*i+j+1,arrive_time[2*i+j],mileage[2*i+j]);
                System.out.println(sql);
                    s.execute(sql);
            }
        }

        for(int i=0;i<10;i++){
            String sqlFormat = "insert into line values (%d,%d,'%s','%s')";
            String sql = String.format(sqlFormat,3,i+1,arrive_time[i],mileage[i]);
            System.out.println(sql);
                    s.execute(sql);
        }
    }

    public static void insertStop(Statement s) throws Exception{

        for(int i=0;i<stations.length;i++){
            String sqlFormat = "insert into stop values (default,'%s','%s')";
            String sql = String.format(sqlFormat,stations[i],cities[i]);
            System.out.println(sql);
            s.execute(sql);
        }

    }

    public static void insertSeat(Statement s) throws Exception{
        char[] location = new char[]{'A','B','C','D','E'};
        for (int j=0;j<15;j++){
            for (int i = 0; i <100 ; i++) {
                String sqlFormat = "insert into seat values (default,%d,'二等座','%d%c')";
                String sql = String.format(sqlFormat,j+1,i%20+1,location[i/20]);
                System.out.println(sql);
                s.execute(sql);
            }
        }
    }

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/12307?useUnicode=true&characterEncoding=utf8",
                "root", "admin");

        Statement s = c.createStatement();
//        insertSeat(s);
//        insertStop(s);
//        insertLine(s);



//        ResultSet rs = s.executeQuery("select *from user");
//        while(rs.next()){
//            System.out.println(rs.getString(1) + "--" + rs.getString(2) + "--" + rs.getString(3));
//        }
        s.close();


    }
}
