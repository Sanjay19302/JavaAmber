
    class Bank{
        String bankName;
        String location;
        int regno;
        Bank(){
            bankName="SBI";
            location="Kallai";
            regno=1075;
            infoOfBank();
        }
        public void infoOfBank(){
            System.out.printf(bankName+"\n"+location+"\n"+regno+"\n");
        }
    }
    public class Bank_Details
    {
        public static void main(String[] args) {
            Bank b=new Bank();
            b.bankName="INDIAN";
            b.location="TVM";
            b.regno=1995;
            b.infoOfBank();
        }
    }

