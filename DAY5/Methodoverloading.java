public class methodoverloading {
        static void Details(String name, int marks) {
            System.out.println("Welcome " + name);
            System.out.println("Your got "+ marks + " marks in exam.");
        }
        
        static void Details(String name, double marks) {
            System.out.println("Welcome " + name);
            System.out.println("Your got "+ marks + " marks in exam.");
        }
        
        public static void main(String[] args) {
            Details("Ridhi", 89);
            Details("Ritesh", 93.5);
        }
}
