package javabeans;

public class MyBean implements java.io.Serializable {

    private String title;
    private boolean visible;
    private String[] colors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getColor(int index) {
        if (colors != null && index >= 0 && index < colors.length) {
            return colors[index];
        }
        return null;
    }

    public void setColor(int index, String color) {
        if (colors != null && index >= 0 && index < colors.length) {
            colors[index] = color;
        }
    }

}
