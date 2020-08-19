package Project.Study.LeetCode.DayOfTheWeek;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int y=1971,m=0,res=0;
        int[]monday = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(;y<year;y++){
            if((y%4==0&&y%100!=0)||y%400==0){
                res +=366;
            }
            else res +=365;
        }
        if((y%4==0&&y%100!=0)||y%400==0){
            monday[1]++;
        }
        for(;m<month-1;m++){
            res += monday[m];
        }
        res +=day;
        res = (res-1)%7;
        switch(res){
            case 0:
                return "Friday";
            case 1:
                return "Saturday";
            case 2:
                return  "Sunday";
            case 3:
                return "Monday";
            case 4:
                return "Tuesday";
            case 5:
                return "Wednesday";
            case 6:
                return "Thursday";
            default: break;
        }
        return "000";
    }
}
//class Solution {
//    public String dayOfTheWeek(int day, int month, int year) {
//        int year0=1971;
//        int[]dates = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int totalDays = 0;
//        for (;year0<year;year0++){
//            if ((year0 % 4 == 0 && year0 % 100 != 0) || (year0 % 400 == 0)) {
//                totalDays+=366;
//            }
//            totalDays+=365;
//        }
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            dates[1]++;
//        }
//        for (int i=0;i<month-1;i++){
//            totalDays+=dates[i];
//        }
//        totalDays+=day;
//        switch ((totalDays-1)%7){
//            case 0:
//                return "Friday";
//            case 1:
//                return "Saturday";
//            case 2:
//                return  "Sunday";
//            case 3:
//                return "Monday";
//            case 4:
//                return "Tuesday";
//            case 5:
//                return "Wednesday";
//            case 6:
//                return "Thursday";
//        }
//        return "000";
//    }
//}
public class Test {
}
