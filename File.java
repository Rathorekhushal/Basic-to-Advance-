public class File {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\ratho\\OneDrive\\Desktop\\Java Programming\\File.java");
        try {
            File.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
