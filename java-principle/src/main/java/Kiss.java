public class Kiss {
    public String getDayOfWeek(int i) {
        if (i > 0 && i <= 7) {
            switch (i) {
                case 1:
                    return "Sat";
                case 2:
                    return "Sun";
                case 3:
                    return "Mon";
                case 4:
                    return "Tue";
                case 5:
                    return "Wed";
                case 6:
                    return "Thu";
                case 7:
                    return "Fri";
            }
        }
        return "Please enter btw 1-7";
    }

    public String kiss(int i) {
        if (i > 0 && i <= 7) {
            String[] days = {
                    "Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"
            };
            return days[i - 1];
        }
        return "Please enter btw 1- 7 ";
    }
}
