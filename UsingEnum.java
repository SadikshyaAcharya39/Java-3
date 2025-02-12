
enum Days
{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class UsingEnum {
    public static void main(String[] args) {
        for(Days days: Days.values()){
            System.out.println(days);
        }
    }
}
