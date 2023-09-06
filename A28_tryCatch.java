public class A28_tryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        finally{
            System.out.println(0);
        }
    }
}
