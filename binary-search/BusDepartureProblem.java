/**
 * Problem: Bus Departure Times
 * Source: CodeSignal OA Practice  
 * Difficulty: Medium
 * Topics: Binary Search, Time Conversion
 * 
 * Problem Description:
 * 每天巴士计划出发时间为有序列表 departure_times，给定当前时间 current_time，
 * 问最上一次出发的巴士是在几分钟之前出发的。
 * 
 * Example: departure_times = ["12:30", "14:00", "19:55"], current_time = "14:30"
 * Output: 30 (minutes)
 */

public class BusDepartureProblem {
    
    public static int solution(String[] departureTimes, String currentTime) {
        // TODO: Convert current time to minutes
        // TODO: Binary search for last departed bus
        // TODO: Calculate time difference
        return -1;
    }
    
    private static int timeToMinutes(String time) {
        // TODO: Convert "HH:MM" to total minutes from midnight
        return 0;
    }
    
    public static void main(String[] args) {
        // Test cases
        String[] times1 = {"12:30", "14:00", "19:55"};
        System.out.println(solution(times1, "14:30")); // Expected: 30
    }
}
