package Project.Study.LeetCode.DayOfTheYear;

class Solution {
    public int dayOfYear(String date) {
        int[]dates = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            dates[1]++;
        }
        if (month<2){
            return day;
        }
        for (int i=0;i<month-1;i++){
            totalDays+=dates[i];
        }
        return totalDays+day;
    }
}
public class Test {
}
