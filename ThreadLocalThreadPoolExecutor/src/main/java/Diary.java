public final class Diary {
    private static ThreadLocal<Day> days = new ThreadLocal<Day>(){

        protected Day initialValue() {
            return Day.MONDAY;
        }
    };

    public Day getCurrentDay()
    {
        return days.get();
    }

    public void setCurrentDay(Day updatedDay)
    {
        days.set(updatedDay);
    }

    //Thread specific task
    public void printDay(Day currentDay)
    {
        System.out.println("Printing Current Day retrieved : "+ currentDay);
    }
}
