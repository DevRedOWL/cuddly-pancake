package devs.mulham.horizontalcalendar.model;

public class CalendarEvent {
    private int color;
    private String description;

    public CalendarEvent(int i) {
        this.color = i;
    }

    public CalendarEvent(int i, String str) {
        this.color = i;
        this.description = str;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
