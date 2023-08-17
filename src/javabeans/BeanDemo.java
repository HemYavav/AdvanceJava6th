package javabeans;

public class BeanDemo {
    public static void main(String[] args) {
        MyBean bean = new MyBean();
        
        bean.setTitle("Sample Bean");
        bean.setVisible(true);
        bean.setColors(new String[] {"Red", "Green", "Blue"});
        
        System.out.println("Title: " + bean.getTitle());
        System.out.println("Visible: " + bean.isVisible());
        System.out.println("Colors:");
        for (int i = 0; i < bean.getColors().length; i++) {
            System.out.println("  Color " + i + ": " + bean.getColor(i));
        }
        
        // Update a color and display
        bean.setColor(1, "Yellow");
        System.out.println("\nUpdated Colors:");
        for (int i = 0; i < bean.getColors().length; i++) {
            System.out.println("  Color " + i + ": " + bean.getColor(i));
        }
    }
}
