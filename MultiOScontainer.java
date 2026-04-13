public class MultiOScontainer {
  public static int memoryUsage = 0;
    static class OS1 {
        String osname;
        boolean processWorking;
        String status;

        public OS1(boolean processWorking, String status, String os) {
            this.processWorking = processWorking;
            this.status = status;
            this.osname = os;
        }

    }

    static class OS2 {
        String osname;
        boolean processWorking = true;
        String status = "Working";

        public OS2(boolean processWorking, String status, String os) {
            this.processWorking = processWorking;
            this.status = status;
            this.osname = os;
        }

        public int calculating() {
            if (processWorking) {
                System.out.println("Calculating...");
                return 1;
            } else {
                System.out.println("Process not working");
                return 0;
            }
        }
    }

    static class OS3 {
      
        String osname;
        boolean processWorking = true;
        String status = "Working";

        public OS3(boolean processWorking, String status, String os) {
            this.processWorking = processWorking;
            this.status = status;
            this.osname = os;

            for (int i = 0; i < 5; i++) {
                System.out.println("OS3 is running...");
                if (i > 5 && i < 6) {
                    processWorking = false;
                    break;
                }
                memoryUsage++;
            }
        }

        public int calculating() {
            if (processWorking) {
                System.out.println("Calculating...");
                return 1;
            } else {
                System.out.println("Process not working");
                return 0;
            }
        }
    }

    static class SharedResources {
        public boolean printerAvailable;
        public int memory;
        public boolean memoryAvailable;

    }

    public static void main(String[] args) {

        OS3 mac = new OS3(true, "Working", "MacOS");
        OS2 windows = new OS2(true, "Working", "Windows");
        SharedResources resources = new SharedResources();
        resources.printerAvailable = true;
        resources.memory = 1;
        resources.memoryAvailable = true;
        resources.memory = 5;
        if (mac.processWorking==true) {
            System.out.println(mac.osname + " is not working ");
             resources.memory = memoryUsage;
            System.out.println("Memory released by " + mac.osname + " is " + resources.memory);
        }

    }
}