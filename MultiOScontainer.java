public class MultiOScontainer {

    public class OS1{
        String osname;
        boolean processWorking;
        String status;
        public OS1(boolean processWorking,String status){
           this.processWorking=processWorking;
           this.status=status;
        }

    }
    public class OS2{
        String osname;
        boolean processWorking=true;
        String status="Working";
        public OS2(boolean processWorking,String status){
           this.processWorking=processWorking;
           this.status=status;
        }
        public int calculating(){
            if(processWorking){
                System.out.println("Calculating...");
                return 1;
            }else{
                System.out.println("Process not working");
                return 0;
            }
        }
    }
    public class OS3{
        String osname;
         boolean processWorking=true;
        String status="Working";
        public OS3(boolean processWorking,String status){
           this.processWorking=processWorking;
           this.status=status;
           for(int i=0;i<5;i++){
               System.out.println("OS3 is running...");
               if (i>5 && i<6) {
                   processWorking=false;
                   break;
               }
           }
        }
        public int calculating(){
            if(processWorking){
                System.out.println("Calculating...");
                return 1;
            }else{
                System.out.println("Process not working");
                return 0;
            }
        }   
    }
    public class SharedResources{
        public boolean printerAvailable;
        public  int memory;
        public boolean memoryAvailable;
        

    }

    public static void main(String[] args) {
        
    }
}